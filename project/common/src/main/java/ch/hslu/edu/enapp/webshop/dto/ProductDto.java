package ch.hslu.edu.enapp.webshop.dto;

import java.math.BigDecimal;

public class ProductDto {
    private String no;
    private String owner;
    private String description;
    private String kind;
    private String mediafileName;
    private BigDecimal unitPrice;

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getMediafileName() {
        return mediafileName;
    }

    public void setMediafileName(String mediafileName) {
        this.mediafileName = mediafileName;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }
}
