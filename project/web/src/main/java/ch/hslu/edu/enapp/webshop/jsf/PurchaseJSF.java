package ch.hslu.edu.enapp.webshop.jsf;

import ch.hslu.edu.enapp.webshop.dto.PurchaseDto;
import ch.hslu.edu.enapp.webshop.services.IPurchaseService;
import ch.hslu.edu.enapp.webshop.services.IUserService;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@SessionScoped
public class PurchaseJSF implements Serializable {
    @Inject
    private IPurchaseService purchaseService;

    @Inject
    private IUserService userService;

    public List<PurchaseDto> getAllPurchasesFromUser() {
        String userName = userService.getNameFromCurrentUser();
        return purchaseService.getAllPurchasesFromUser(userName);
    }
}
