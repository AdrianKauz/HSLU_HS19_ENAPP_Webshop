package ch.hslu.edu.enapp.webshop.builder;

import ch.hslu.edu.enapp.webshop.dto.PurchaseDto;

import java.math.BigDecimal;
import java.util.Date;

public class PurchaseDtoBuilder {
    private int purchaseId;
    private Date date;
    private int itemCount;
    private BigDecimal totalPrice;
    private String state;

    public PurchaseDtoBuilder setPurchaseId(final int purchaseId) {
        this.purchaseId = purchaseId;
        return this;
    }

    public PurchaseDtoBuilder setDate(final Date date) {
        this.date = date;
        return this;
    }

    public PurchaseDtoBuilder setItemCount(final int itemCount) {
        this.itemCount = itemCount;
        return this;
    }

    public PurchaseDtoBuilder setTotalPrice(final BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }

    public PurchaseDtoBuilder setState(final String state) {
        this.state = state;
        return this;
    }

    public PurchaseDto build() {
        return new PurchaseDto(this.purchaseId, this.date, this.itemCount, this.totalPrice, this.state);
    }
}
