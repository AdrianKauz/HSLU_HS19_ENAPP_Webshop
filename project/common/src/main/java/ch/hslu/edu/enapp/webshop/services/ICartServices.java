package ch.hslu.edu.enapp.webshop.services;

import ch.hslu.edu.enapp.webshop.dto.CartItemDto;

import java.util.List;

public interface ICartServices {
    void addToCart(final String productId);
    void removeFromCart(final String productId);
    void clearCart();
    List<CartItemDto> getCart();
    int countAllItems();
    boolean isEmpty();
}
