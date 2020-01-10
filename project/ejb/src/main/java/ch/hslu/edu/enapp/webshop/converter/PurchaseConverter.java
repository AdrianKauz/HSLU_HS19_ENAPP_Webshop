package ch.hslu.edu.enapp.webshop.converter;

import ch.hslu.edu.enapp.webshop.builder.PurchaseDtoBuilder;
import ch.hslu.edu.enapp.webshop.dto.CartItemDto;
import ch.hslu.edu.enapp.webshop.dto.PurchaseDto;
import ch.hslu.edu.enapp.webshop.entity.PurchaseitemEntity;
import ch.hslu.edu.enapp.webshop.xml.Salesorder;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class PurchaseConverter {
    public List<PurchaseitemEntity> getPurchaseItemEntities(List<CartItemDto> cartItems) {
        return cartItems.stream()
                .filter(Objects::nonNull)
                .map(item -> {
                    PurchaseitemEntity newEntity = new PurchaseitemEntity();
                    newEntity.setProduct(item.getProduct().getNo());
                    newEntity.setQuantity(item.getQuantity());

                    return newEntity;
                }).collect(Collectors.toList());
    }

    public PurchaseDto getPurchaseDtoFromSalesOrder(final Salesorder order) {
        return new PurchaseDtoBuilder()
                .setPurchaseId(Integer.parseInt(order.getPurchaseId()))
                .setDate(order.getPurchaseDateTime().toGregorianCalendar().getTime())
                .setItemCount(order.getPurchaseItemCount())
                .setTotalPrice(BigDecimal.valueOf(order.getPurchaseTotalCost()))
                .setState(order.getStatus())
                .build();
    }
}