package ch.hslu.edu.enapp.webshop.dto;

public class CartItemDto {
    private int quantity;
    private ProductDto product;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public ProductDto getProduct() {
        return product;
    }

    public void setProduct(ProductDto product) {
        this.product = product;
    }
}