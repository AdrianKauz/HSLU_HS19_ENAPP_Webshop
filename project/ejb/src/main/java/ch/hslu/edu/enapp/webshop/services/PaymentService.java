package ch.hslu.edu.enapp.webshop.services;

import ch.hslu.edu.enapp.webshop.xml.Ncresponse;

import javax.ejb.Stateless;
import javax.ws.rs.client.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.transform.stream.StreamSource;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.*;

import static java.util.stream.Collectors.joining;

@Stateless(name = "PaymentServicesEJB")
public class PaymentService implements IPaymentService {
    final String orderDirectURL = "https://e-payment.postfinance.ch/ncol/test/orderdirect.asp";
    final String shaPassPhrase = "XXXXXXXXXXXX";

    public PaymentService() {
    }

    @Override
    public long charge(int orderID) {
        final SortedMap<String, String> parameters = new TreeMap<>();

        parameters.put("PSPID","XXXXXXXXXXXX");
        parameters.put("USERID","XXXXXXXXXXXX");
        parameters.put("PSWD", "XXXXXXXXXXXX");
        parameters.put("ORDERID", String.valueOf(orderID));
        parameters.put("AMOUNT","1200");
        parameters.put("CURRENCY", "CHF");
        parameters.put("CARDNO", "5399999999999999");
        parameters.put("ED", "12/21");
        parameters.put("CVC", "123");
        parameters.put("OPERATION", "SAL");

        final String shaSign = this.getSHASign(parameters, this.shaPassPhrase);

        parameters.put("SHASIGN", shaSign);

        final String finalPostString = this.getFinalPostString(parameters);
        final long payID = this.executePayment(finalPostString);

        return payID;
    }

    private long executePayment(String finalPostString) {
        long payID = 0;
        final Client client = ClientBuilder.newBuilder().newClient();
        final WebTarget target = client.target(this.orderDirectURL);
        final Invocation.Builder builder = target.request();
        final Response result = builder.post(Entity.entity(finalPostString, MediaType.APPLICATION_FORM_URLENCODED_TYPE) );
        final String xmlResponse = result.readEntity(String.class);

        try {
            JAXBContext context = JAXBContext.newInstance(Ncresponse.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            StreamSource streamSource = new StreamSource(new StringReader(xmlResponse));
            Ncresponse response = (Ncresponse) unmarshaller.unmarshal(streamSource);

            if(response.getSTATUS() == 9) {
                payID = response.getPAYID();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return payID;
    }

    private String getSHASign(SortedMap<String, String> parameters, String passPhrase) {
        StringBuilder newParaString = new StringBuilder();

        for (Map.Entry<String, String> entry : parameters.entrySet()) {
            newParaString.append(entry.getKey());
            newParaString.append("=");
            newParaString.append(entry.getValue());
            newParaString.append(passPhrase);
        }

        return this.getSHA1(newParaString.toString());
    }

    private String getSHA1(String text) {
        try {
            final MessageDigest md = MessageDigest.getInstance("SHA-1");
            final byte[] digest = md.digest(text.getBytes(StandardCharsets.UTF_8));
            final String passwordHash = (new HexBinaryAdapter()).marshal(digest);

            return passwordHash;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private String getFinalPostString(SortedMap<String, String> parameters) {
        final String finalPostString = parameters.entrySet()
                .stream()
                .map(element -> element.getKey() + "=" + element.getValue())
                .collect(joining("&"));

        return finalPostString;
    }
}
