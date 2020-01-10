package ch.hslu.edu.enapp.webshop.jsf;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;
import javax.inject.Named;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import ch.hslu.edu.enapp.webshop.dto.UserDto;
import ch.hslu.edu.enapp.webshop.services.IUserService;

import java.util.List;


@Named
@RequestScoped
public class UserJSF {
    @Inject
    private IUserService userService;

    @Size(min = 4, max = 20, message = "Length must be between 4 and 20")
    private String firstname;

    @Size(min = 4, max = 20, message = "Length must be between 4 and 20")
    private String lastname;

    @Size(min = 4, max = 20, message = "Length must be between 4 and 20")
    private String username;

    @Size(min = 4, max = 20, message = "Length must be between 4 and 20")
    private String password;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public void createUser(ActionEvent actionEvent) {
        final UserDto newUser = new UserDto();
        newUser.setFirstname(this.firstname);
        newUser.setLastname(this.lastname);
        newUser.setName(this.username);
        newUser.setPassword(this.password);
        newUser.setEmail(this.email);
        newUser.setAddress(this.address);

        final FacesContext facesContext = FacesContext.getCurrentInstance();

        try {
            this.userService.createUser(newUser);

            final FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO,
                    "User \"" + this.username + "\" created", "");
            facesContext.addMessage(null, message);
            facesContext.getExternalContext().getFlash().setKeepMessages(true);

            this.clearAttributes();
        } catch (Exception e) {
            final UIInput input = (UIInput) facesContext.getViewRoot().findComponent("addUserForm:usernameInput");
            input.setValid(false);
            facesContext.addMessage(input.getClientId(facesContext), new FacesMessage("User could not be created"));
            facesContext.validationFailed();
        }
    }

    public void clearAttributes() {
        this.firstname = "";
        this.lastname = "";
        this.username = "";
        this.password = "";
        this.email = "";
        this.address = "";
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