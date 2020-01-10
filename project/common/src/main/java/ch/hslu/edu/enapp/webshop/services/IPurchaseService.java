package ch.hslu.edu.enapp.webshop.services;

import ch.hslu.edu.enapp.webshop.dto.PurchaseDto;
import ch.hslu.edu.enapp.webshop.dto.PurchaseMessageDto;
import ch.hslu.edu.enapp.webshop.xml.Salesorder;

import java.util.List;
import java.util.UUID;

public interface IPurchaseService {
    void purchase(String currentUserName, PurchaseMessageDto newPurchase);
    List<UUID> getCorrelationIdsOfAllUnfinishedPurchases();
    Salesorder getSalesOrderFromServiceProvider(UUID correlationId);
    void setPurchaseStates(UUID correlationId, int state_postfinance, int state_order);
    List<PurchaseDto> getAllPurchasesFromUser(final String userName);
}
