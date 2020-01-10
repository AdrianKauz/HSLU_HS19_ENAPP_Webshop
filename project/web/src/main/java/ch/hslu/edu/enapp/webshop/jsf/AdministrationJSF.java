package ch.hslu.edu.enapp.webshop.jsf;

import ch.hslu.edu.enapp.webshop.dto.UserDto;
import ch.hslu.edu.enapp.webshop.services.IUserService;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@SessionScoped
public class AdministrationJSF implements Serializable {
    @Inject
    private IUserService userService;

    public List<UserDto> getAllUsers() {
        return userService.getAllUsers();
    }

    public void updateUser(final UserDto dto) {
        userService.updateUser(dto);
    }
}
