package ch.hslu.edu.enapp.webshop.dto;

import java.math.BigDecimal;
import java.util.Date;

public class PurchaseDto {
    private int purchaseId;
    private Date date;
    private int itemCount;
    private BigDecimal totalPrice;
    private String state;

    public PurchaseDto(final int purchaseId, final Date date, final int itemCount, final BigDecimal totalPrice, final String state) {
        this.purchaseId = purchaseId;
        this.date = date;
        this.itemCount = itemCount;
        this.totalPrice = totalPrice;
        this.state = state;
    }

    public int getPurchaseID() {
        return purchaseId;
    }

    public void setPurchaseID(int purchaseID) {
        this.purchaseId = purchaseID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
