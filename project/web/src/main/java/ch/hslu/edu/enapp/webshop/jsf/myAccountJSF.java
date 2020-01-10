package ch.hslu.edu.enapp.webshop.jsf;

import ch.hslu.edu.enapp.webshop.dto.UserDto;
import ch.hslu.edu.enapp.webshop.services.IUserService;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;
import javax.inject.Named;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Named
@SessionScoped
public class myAccountJSF implements Serializable {
    @Inject
    private IUserService userServices;

    @Size(min = 4, max = 20, message = "Length must be between 4 and 20")
    private String firstname;

    @Size(min = 4, max = 20, message = "Length must be between 4 and 20")
    private String lastname;

    @Size(min = 4, max = 20, message = "Length must be between 4 and 20")
    private String username;

    @Pattern(regexp = ".+@.+", message = "E-Mail is invalid")
    private String email;

    @Size(min = 4, max = 20, message = "Length must be between 4 and 20")
    private String address;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void loadUserAttributes() {
        UserDto currentUser = this.userServices.getCurrentUser();
        this.username = currentUser.getName();
        this.firstname = currentUser.getFirstname();
        this.lastname = currentUser.getLastname();
        this.address = currentUser.getAddress();
        this.email = currentUser.getEmail();
    }

    public void modifyUser(ActionEvent actionEvent) {
        final UserDto modifiedUser = new UserDto();
        modifiedUser.setName(this.username);
        modifiedUser.setFirstname(this.firstname);
        modifiedUser.setLastname(this.lastname);
        modifiedUser.setEmail(this.email);
        modifiedUser.setAddress(this.address);

        try {
            this.userServices.modifyUser(modifiedUser);

            this.showInfoMessage("Your changes where saved!");
        } catch (Exception e) {
            this.showErrorMessage("Your changes could not be saved.");
        }
    }

    private void showInfoMessage(String newMessage) {
        this.showMessage(newMessage, FacesMessage.SEVERITY_INFO);
    }

    private void showErrorMessage(String newMessage) {
        this.showMessage(newMessage, FacesMessage.SEVERITY_ERROR);
    }

    private void showMessage(String newMessage, FacesMessage.Severity messageType) {
        final FacesMessage message = new FacesMessage(messageType, newMessage, "");
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}