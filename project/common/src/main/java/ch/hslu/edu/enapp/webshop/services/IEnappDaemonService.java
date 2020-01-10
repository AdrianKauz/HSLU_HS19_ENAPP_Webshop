package ch.hslu.edu.enapp.webshop.services;

import ch.hslu.edu.enapp.webshop.dto.PurchaseMessageDto;

import java.util.UUID;

public interface IEnappDaemonService {
    public UUID sendMessage(PurchaseMessageDto purchase);
}
