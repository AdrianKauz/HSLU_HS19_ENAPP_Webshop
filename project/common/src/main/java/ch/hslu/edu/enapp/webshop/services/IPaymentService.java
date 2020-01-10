package ch.hslu.edu.enapp.webshop.services;

public interface IPaymentService {
    long charge(int orderID);
}
