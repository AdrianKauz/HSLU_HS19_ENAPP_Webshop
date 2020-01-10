package ch.hslu.edu.enapp.webshop.services;

import ch.hslu.edu.enapp.webshop.converter.PurchaseConverter;
import ch.hslu.edu.enapp.webshop.converter.UserConverter;
import ch.hslu.edu.enapp.webshop.dto.CartItemDto;
import ch.hslu.edu.enapp.webshop.dto.PurchaseDto;
import ch.hslu.edu.enapp.webshop.dto.PurchaseMessageDto;
import ch.hslu.edu.enapp.webshop.dto.UserDto;
import ch.hslu.edu.enapp.webshop.entity.PurchaseEntity;
import ch.hslu.edu.enapp.webshop.entity.PurchaseitemEntity;
import ch.hslu.edu.enapp.webshop.entity.UserEntity;
import ch.hslu.edu.enapp.webshop.xml.Salesorder;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;
import java.io.StringReader;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

@Stateless(name = "PurchaseServiceEJB")
public class PurchaseService implements IPurchaseService {
    @PersistenceContext
    EntityManager em;

    private PurchaseConverter purchaseConverter = new PurchaseConverter();
    private UserConverter userConverter = new UserConverter();

    @Inject
    IPaymentService paymentService;

    @Inject
    ICustomerService customerService;

    @Inject
    IEnappDaemonService enappDaemonService;

    @Override
    public void purchase(String userName, PurchaseMessageDto newPurchaseMessageDto) {
        newPurchaseMessageDto.setStudentID("tbkauz");
        this.setUser(newPurchaseMessageDto, userName);
        this.calculateTotalPrice(newPurchaseMessageDto);
        this.saveNewPurchaseToDatabase(newPurchaseMessageDto);

        final long paymentId = paymentService.charge(newPurchaseMessageDto.getPurchaseID());
        newPurchaseMessageDto.setPayID(paymentId);

        final UUID correlationId = enappDaemonService.sendMessage(newPurchaseMessageDto);
        setCorrelationId(newPurchaseMessageDto.getPurchaseID(), correlationId);

        if(newPurchaseMessageDto.getUser().getDynnavid() == null) {
            customerService.getNewDynNAVCustomerNo(newPurchaseMessageDto.getUser().getName(), correlationId);
        }
    }

    private void setUser(PurchaseMessageDto newPurchaseMessageDto, String userName) {
        final UserEntity currentUserEntity = em.createNamedQuery("getUserByName", UserEntity.class).setParameter("name", userName).getSingleResult();
        final UserDto userDto = this.userConverter.getDtoFromEntityWithoutSecrets(currentUserEntity);
        newPurchaseMessageDto.setUser(userDto);
    }

    private void calculateTotalPrice(PurchaseMessageDto newPurchaseMessageDto) {
        List<CartItemDto> cardItems = newPurchaseMessageDto.getCartItems();

        Function<CartItemDto, BigDecimal> subTotal = cartItemDto -> cartItemDto.getProduct().getUnitPrice().multiply(new BigDecimal(cartItemDto.getQuantity()));
        BigDecimal totalPrice = cardItems.stream().map(subTotal).reduce(BigDecimal.ZERO, BigDecimal::add);

        newPurchaseMessageDto.setTotalPrice(totalPrice);
    }

    private void saveNewPurchaseToDatabase(PurchaseMessageDto newPurchaseMessageDto) {
        final PurchaseEntity newPurchaseEntity = new PurchaseEntity();
        newPurchaseEntity.setStateOrder(9);
        newPurchaseEntity.setStatePostfinance(9);
        newPurchaseEntity.setDatetime(new Timestamp(new Date().getTime()));
        newPurchaseEntity.setUser(newPurchaseMessageDto.getUser().getName());

        newPurchaseEntity.setUserByUser(userConverter.getEntityFromDto(newPurchaseMessageDto.getUser()));

        final List<PurchaseitemEntity> purchaseItemEntities = this.purchaseConverter.getPurchaseItemEntities(newPurchaseMessageDto.getCartItems());

        purchaseItemEntities.replaceAll(thisEntity -> {
            thisEntity.setPurchaseByPurchase(newPurchaseEntity);
            return thisEntity;
        });

        newPurchaseEntity.setPurchaseitemsById(purchaseItemEntities);

        em.persist(newPurchaseEntity);
        em.flush();

        newPurchaseMessageDto.setPurchaseID(newPurchaseEntity.getId());
        newPurchaseMessageDto.setDate(newPurchaseEntity.getDatetime());
    }

    private void setCorrelationId(int purchaseID, UUID correlationId) {
        final PurchaseEntity entity = em.createNamedQuery("getPurchaseById", PurchaseEntity.class).setParameter("id", purchaseID).getSingleResult();
        entity.setCorrelationId(correlationId.toString());

        em.merge(entity);
        em.flush();
    }

    @Override
    public List<UUID> getCorrelationIdsOfAllUnfinishedPurchases() {
        List<PurchaseEntity> unfinishedPurchases = em.createNamedQuery("getAllUnfinishedPurchases", PurchaseEntity.class).getResultList();
        List<UUID> associatedUUIDs = new ArrayList<>();

        try {
            unfinishedPurchases.forEach(purchaseEntity -> {
                associatedUUIDs.add(UUID.fromString(purchaseEntity.getCorrelationId()));
            });
        } catch (Exception e) {
            e.printStackTrace();
        }

        return associatedUUIDs;
    }

    @Override
    public Salesorder getSalesOrderFromServiceProvider(UUID correlationId) {
        Salesorder order = null;
        final Client client = ClientBuilder.newBuilder().newClient();
        final WebTarget target = client.target("http://enapp-daemons.el.eee.intern:9080/EnappDaemonWeb/rest/salesorder/corr/" + correlationId.toString());
        final Invocation.Builder builder = target.request();
        final Response result = builder.get();

        if(result.getStatus() == 200) {
            final String xmlResponse = result.readEntity(String.class);

            try {
                JAXBContext context = JAXBContext.newInstance(Salesorder.class);
                Unmarshaller unmarshaller = context.createUnmarshaller();
                StreamSource streamSource = new StreamSource(new StringReader(xmlResponse));
                order = (Salesorder) unmarshaller.unmarshal(streamSource);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return order;
    }

    @Override
    public void setPurchaseStates(UUID correlationId, int state_PostFinance, int state_Order) {
        PurchaseEntity entity = em.createNamedQuery("getPurchaseByCorrelationId", PurchaseEntity.class).setParameter("correlationId", correlationId.toString()).getSingleResult();

        entity.setStatePostfinance(state_PostFinance);
        entity.setStateOrder(state_Order);

        em.merge(entity);
        em.flush();
    }

    @Override
    public List<PurchaseDto> getAllPurchasesFromUser(final String userName) {
        List<PurchaseEntity> purchasesEntities = em.createNamedQuery("getPurchasesByUser", PurchaseEntity.class).setParameter("user", userName).getResultList();

        return purchasesEntities.stream()
                .map(entity -> this.getSalesOrderFromServiceProvider(UUID.fromString(entity.getCorrelationId())))
                .filter(Objects::nonNull)
                .map(order -> purchaseConverter.getPurchaseDtoFromSalesOrder(order))
                .collect(Collectors.toList());
    }
}
