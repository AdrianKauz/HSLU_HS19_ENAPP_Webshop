package ch.hslu.edu.enapp.webshop.jsf;

import ch.hslu.edu.enapp.webshop.dto.ProductDto;
import ch.hslu.edu.enapp.webshop.services.IProductService;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Named
@ApplicationScoped
public class ProductJSF implements Serializable {
    @Inject
    private IProductService productService;

    @Size(min = 0)
    private int id;

    @Size(min = 4, max = 20, message = "Length must be between 4 and 20")
    private String name;

    @Size(min = 4, max = 200, message = "Length must be between 4 and 200")
    private String description;

    @Size(min = 4, max = 200, message = "Length must be between 4 and 20")
    private String mediapath;

    @DecimalMin(value = "0.0", inclusive = true, message = "Negative values are not allowed")
    @Digits(integer = 6, fraction = 2, message = "######.##")
    private BigDecimal unitPrice;

    private List<ProductDto> products = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMediapath() {
        return mediapath;
    }

    public void setMediapath(String mediapath) {
        this.mediapath = mediapath;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public List<ProductDto> getProducts() {
        if(this.products.isEmpty()) {
            this.products = productService.getAllProducts();
        }

        return this.products;
    }
}
