package ch.hslu.edu.enapp.webshop.services;

import ch.hslu.edu.enapp.webshop.dto.CartItemDto;

import javax.ejb.Stateful;
import javax.ejb.StatefulTimeout;
import javax.inject.Inject;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

@Stateful(name = "CartServiceEJB")
@StatefulTimeout(unit = TimeUnit.MINUTES, value = 20)
public class CartServices implements ICartServices {
    @Inject
    IProductService productService;

    private Map<String, Integer> simpleCart = new HashMap<>();

    @Override
    public void addToCart(final String productId) {
        if (this.simpleCart.containsKey(productId)) {
            this.simpleCart.put(productId, this.simpleCart.get(productId) + 1);
        } else {
            this.simpleCart.put(productId, 1);
        }
    }

    @Override
    public void removeFromCart(final String productId) {
        if (!this.simpleCart.isEmpty()) {
            if (this.simpleCart.containsKey(productId)) {
                this.simpleCart.remove(productId);
            }
        }
    }

    @Override
    public void clearCart() {
        this.simpleCart.clear();
    }

    @Override
    public List<CartItemDto> getCart() {
        return this.simpleCart.entrySet()
                .stream()
                .filter(Objects::nonNull)
                .map(entry -> {
                    CartItemDto cardItem = new CartItemDto();
                    cardItem.setProduct(productService.getProduct(entry.getKey()));
                    cardItem.setQuantity(entry.getValue());

                    return cardItem;
                }).collect(Collectors.toList());
    }

    @Override
    public int countAllItems() {
        return this.simpleCart.values()
                .stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

    @Override
    public boolean isEmpty() {
        return this.simpleCart.isEmpty();
    }
}
