package ch.hslu.edu.enapp.webshop.services;

import ch.hslu.edu.enapp.webshop.converter.UserConverter;
import ch.hslu.edu.enapp.webshop.dto.UserDto;
import ch.hslu.edu.enapp.webshop.entity.RoleEntity;
import ch.hslu.edu.enapp.webshop.entity.UserEntity;
import ch.hslu.edu.enapp.webshop.entity.UsertoroleEntity;

import javax.annotation.Resource;
import javax.ejb.EJBContext;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Stateless(name = "UserServiceEJB")
public class UserService implements IUserService {
    @PersistenceContext
    private EntityManager em;

    @Resource
    EJBContext context;

    private UserConverter userconverter = new UserConverter();

    public UserService() {
    }

    @Override
    public void createUser(final UserDto user) {
        final UserEntity newUser = new UserEntity();
        newUser.setFirstname(user.getFirstname());
        newUser.setLastname(user.getLastname());
        newUser.setName(user.getName());
        newUser.setPassword(user.getPassword());
        newUser.setEmail(user.getEmail());
        newUser.setAddress(user.getAddress());

        final RoleEntity userRoleEntity = em.createNamedQuery("getRoleByName", RoleEntity.class).setParameter("name", "customer").getSingleResult();

        final List<UsertoroleEntity> usertoroles = new ArrayList<>();
        final UsertoroleEntity usertorole = new UsertoroleEntity();
        usertorole.setUserByName(newUser);
        usertorole.setRoleByRole(userRoleEntity);
        usertoroles.add(usertorole);

        newUser.setUsertorolesByName(usertoroles);

        em.persist(newUser);
    }

    @Override
    public void modifyUser(UserDto user) {
        final UserEntity userEntity = em.createNamedQuery("getUserByName", UserEntity.class).setParameter("name", user.getName()).getSingleResult();
        userEntity.setFirstname(user.getFirstname());
        userEntity.setLastname(user.getLastname());
        userEntity.setAddress(user.getAddress());
        userEntity.setEmail(user.getEmail());

        em.merge(userEntity);
        em.flush();
    }

    @Override
    public UserDto getCurrentUser() {
        final String principalName = context.getCallerPrincipal().getName();

        final UserEntity userEntity = em.createNamedQuery("getUserByName", UserEntity.class).setParameter("name", principalName).getSingleResult();
        final UserDto userDto = new UserDto();
        userDto.setName(userEntity.getName());
        userDto.setFirstname(userEntity.getFirstname());
        userDto.setLastname(userEntity.getLastname());
        userDto.setAddress(userEntity.getAddress());
        userDto.setPassword(userEntity.getPassword());
        userDto.setEmail(userEntity.getEmail());

        return userDto;
    }

    @Override
    public String getNameFromCurrentUser() {
        return context.getCallerPrincipal().getName();
    }

    @Override
    public void updateDynNAVId(String userName, String newDynNAVId) {
        final UserEntity entity = em.createNamedQuery("getUserByName", UserEntity.class).setParameter("name", userName).getSingleResult();

        entity.setDynnavid(newDynNAVId);

        em.merge(entity);
        em.flush();
    }

    @Override
    public List<UserDto> getAllUsers() {
        final List<UserEntity> entities = em.createNamedQuery("getAllUsers", UserEntity.class).getResultList();

        return entities.stream()
                .filter(Objects::nonNull)
                .map(entity -> userconverter.getDtoFromEntityWithoutSecrets(entity))
                .collect(Collectors.toList());
    }

    @Override
    public void updateUser(final UserDto dto) {
        final UserEntity entity = em.createNamedQuery("getUserByName", UserEntity.class).setParameter("name", dto.getName()).getSingleResult();

        entity.setDynnavid(dto.getDynnavid());

        em.merge(entity);
        em.flush();
    }
}