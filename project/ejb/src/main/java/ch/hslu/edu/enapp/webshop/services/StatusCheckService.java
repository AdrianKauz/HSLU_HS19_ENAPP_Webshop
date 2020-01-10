package ch.hslu.edu.enapp.webshop.services;

import ch.hslu.edu.enapp.webshop.xml.Salesorder;

import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.inject.Inject;
import java.util.List;
import java.util.UUID;

@Singleton
public class StatusCheckService { ;
    @Inject
    IPurchaseService purchaseService;

    @Schedule(hour = "*", minute = "*", second = "*/30", info = "Run every 30 seconds.")
    private void updateOrderStates() {
        try {
            List<UUID> correlationIds = purchaseService.getCorrelationIdsOfAllUnfinishedPurchases();

            correlationIds.forEach(correlationId -> {
                Salesorder currentOrder = purchaseService.getSalesOrderFromServiceProvider(correlationId);

                if (currentOrder != null) {
                    if(currentOrder.getStatus().length() == 3) {
                        final int state_PostFinance = Character.getNumericValue(currentOrder.getStatus().charAt(0));
                        final int state_Order = Character.getNumericValue(currentOrder.getStatus().charAt(2));
                        purchaseService.setPurchaseStates(correlationId, state_PostFinance, state_Order);
                    }
                }
            });

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
