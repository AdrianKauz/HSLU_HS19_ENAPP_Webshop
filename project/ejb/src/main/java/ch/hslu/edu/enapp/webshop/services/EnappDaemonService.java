package ch.hslu.edu.enapp.webshop.services;

import ch.hslu.edu.enapp.webshop.dto.PurchaseMessageDto;
import ch.hslu.edu.enapp.webshop.xml.PurchaseMessage;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.jms.*;
import javax.jms.Queue;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

@Stateless(name = "EnappDaemonServiceEJB")
public class EnappDaemonService implements IEnappDaemonService {

    @Resource(name = "MyRemoteJmsQueueConnectionFactory")
    private ConnectionFactory connectionFactory;

    @Resource(name = "jms/enappQueueAMQ")
    private Queue queue;

    @Override
    public UUID sendMessage(PurchaseMessageDto newPurchase) {
        final UUID correlationId = UUID.randomUUID();
        final PurchaseMessage purchaseMessage = this.prepareNewPurchaseMessage(newPurchase);
        final String xmlMessage = this.createTextMessage(purchaseMessage);
        this.send(xmlMessage, correlationId);

        return correlationId;
    }

    private PurchaseMessage prepareNewPurchaseMessage(PurchaseMessageDto purchase) {
        PurchaseMessage newMessage = new PurchaseMessage();

        newMessage.setPayId(String.valueOf(purchase.getPayID()));
        newMessage.setPurchaseId(String.valueOf(purchase.getPurchaseID()));
        newMessage.setStudent(purchase.getStudentID());
        newMessage.setTotalPrice(purchase.getTotalPrice().floatValue());
        newMessage.setDate(getGregorianFromDate(purchase.getDate()));

        PurchaseMessage.Customer customer = new PurchaseMessage.Customer();
        customer.setDynNavCustNo(purchase.getUser().getDynnavid());
        customer.setAddress(purchase.getUser().getAddress());
        customer.setShopLoginname(purchase.getUser().getName());
        newMessage.setCustomer(customer);

        PurchaseMessage.Lines lines = new PurchaseMessage.Lines();

        purchase.getCartItems().forEach(item -> {
            PurchaseMessage.Lines.Line newLine = new PurchaseMessage.Lines.Line();
            newLine.setMsDynNAVItemNo(item.getProduct().getNo());
            newLine.setDescription(item.getProduct().getDescription());
            newLine.setQuantity(item.getQuantity());
            newLine.setTotalLinePrice(item.getProduct().getUnitPrice().multiply(new BigDecimal(item.getQuantity())).floatValue());
            lines.getLine().add(newLine);
        });

        newMessage.setLines(lines);
        return newMessage;
    }

    private XMLGregorianCalendar getGregorianFromDate(Date newDate) {
        XMLGregorianCalendar xmlDate = null;
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(newDate);
        try {
            xmlDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(gc);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return xmlDate;
    }

    private String createTextMessage(PurchaseMessage purchaseMessage) {
        String purchaseMessageAsString = "";

        try {
            final JAXBContext context = JAXBContext.newInstance(PurchaseMessage.class);
            final StringWriter writer = new StringWriter();
            final Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(purchaseMessage, writer);
            purchaseMessageAsString = writer.toString();
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        return purchaseMessageAsString;
    }

    private void send(String xmlMessage, UUID correlationId) {
        try(Connection connection = connectionFactory.createConnection();
            Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE)
        ) {
            MessageProducer producer = session.createProducer(queue);

            TextMessage message = session.createTextMessage(xmlMessage);
            message.setStringProperty("MessageFormat", "Version 1.5");
            message.setJMSCorrelationID(correlationId.toString());

            producer.send(message);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
