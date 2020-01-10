package ch.hslu.edu.enapp.webshop.services;

import java.util.UUID;

public interface ICustomerService {
    void getNewDynNAVCustomerNo(String userName, UUID correlationId);
}
