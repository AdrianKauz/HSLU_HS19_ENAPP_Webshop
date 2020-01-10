package ch.hslu.edu.enapp.webshop.jsf;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import java.io.IOException;
import java.io.Serializable;

@Named
@SessionScoped
public class UserSessionJSF implements Serializable {
    private static final long serialVersionUID = 1492259801008765070L;

    private String username;

    public String getUsername() {
        if (null == this.username) {
            try {
                final FacesContext facesContext = FacesContext.getCurrentInstance();
                this.username = facesContext.getExternalContext().getUserPrincipal().getName();

                final FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO,
                        "Hello " + this.username, "");
                facesContext.addMessage(null, message);
                facesContext.getExternalContext().getFlash().setKeepMessages(true);
            } catch (NullPointerException ex) {
                this.username = null;
            }
        }

        return this.username;
    }

    public boolean isAdministrator() {
        final FacesContext facesContext = FacesContext.getCurrentInstance();
        return facesContext.getExternalContext().isUserInRole("administrator");
    }

    public String logout() throws IOException {
        final FacesContext facesContext = FacesContext.getCurrentInstance();
        facesContext.getExternalContext().invalidateSession();

        final FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO,
                "Goodbye " + this.username, "");
        facesContext.addMessage(null, message);
        facesContext.getExternalContext().getFlash().setKeepMessages(true);

        this.username = null;
        return "/index?faces-redirect=true";
    }
}
