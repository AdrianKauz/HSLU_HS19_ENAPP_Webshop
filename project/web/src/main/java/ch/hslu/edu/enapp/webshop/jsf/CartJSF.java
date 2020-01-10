package ch.hslu.edu.enapp.webshop.jsf;

import ch.hslu.edu.enapp.webshop.dto.CartItemDto;
import ch.hslu.edu.enapp.webshop.dto.PurchaseMessageDto;
import ch.hslu.edu.enapp.webshop.services.ICartServices;
import ch.hslu.edu.enapp.webshop.services.IPurchaseService;
import ch.hslu.edu.enapp.webshop.services.IUserService;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@SessionScoped
public class CartJSF implements Serializable {
    @Inject
    IUserService userService;

    @Inject
    ICartServices cartServices;

    @Inject
    IPurchaseService purchaseService;


    private List<CartItemDto> currentCartSelection;

    private int itemsCounter = 0;

    public void addToCart(final String newProductId) {
        cartServices.addToCart(newProductId);
    }

    public int getSize() {
        this.itemsCounter = cartServices.countAllItems();
        return itemsCounter;
    }

    public List<CartItemDto> getCurrentCartSelection() {
        this.currentCartSelection = cartServices.getCart();

        return this.currentCartSelection;
    }

    public void purchase() {

        try {
            final PurchaseMessageDto newPurchase = new PurchaseMessageDto();
            newPurchase.setCartItems(this.currentCartSelection);

            purchaseService.purchase(this.userService.getNameFromCurrentUser(), newPurchase);
            cartServices.clearCart();
            this.showInfoMessage("Kauf erfolgreich!");
        } catch (Exception e) {
            this.showErrorMessage("Fehler!: " + e.getMessage());
        }
    }

    private void showInfoMessage(String newMessage) {
        final FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, newMessage, "");
        FacesContext.getCurrentInstance().addMessage(null, message);
    }

    private void showErrorMessage(String newMessage) {
        final FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, newMessage, "");
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}
