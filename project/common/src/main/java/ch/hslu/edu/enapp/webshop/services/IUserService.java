package ch.hslu.edu.enapp.webshop.services;

import ch.hslu.edu.enapp.webshop.dto.UserDto;

import java.util.List;

public interface IUserService {
    void createUser(final UserDto user);
    void modifyUser(UserDto user);
    UserDto getCurrentUser();
    String getNameFromCurrentUser();
    void updateDynNAVId(String user, String newDynNAVId);
    List<UserDto> getAllUsers();
    void updateUser(final UserDto dto);
}
