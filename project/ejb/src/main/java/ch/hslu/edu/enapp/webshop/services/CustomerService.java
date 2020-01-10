package ch.hslu.edu.enapp.webshop.services;

import ch.hslu.edu.enapp.webshop.xml.Salesorder;

import javax.ejb.Asynchronous;
import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

@Stateless(name = "CustomerServiceEJB")
public class CustomerService implements ICustomerService {
    @Inject
    IPurchaseService purchaseService;

    @Inject
    IUserService userService;

    @Asynchronous
    @Override
    public void getNewDynNAVCustomerNo(String userName, UUID correlationId) {
        //Give Service Provider some time to generate a new customer number
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Salesorder order = purchaseService.getSalesOrderFromServiceProvider(correlationId);

        if(order != null) {
            userService.updateDynNAVId(userName, order.getDynNAVCustomerNo());
        }
    }
}
