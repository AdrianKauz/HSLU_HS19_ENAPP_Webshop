package ch.hslu.edu.enapp.webshop.converter;

import ch.hslu.edu.enapp.webshop.dto.UserDto;
import ch.hslu.edu.enapp.webshop.entity.UserEntity;

public class UserConverter {
    public UserEntity getEntityFromDto(UserDto dto) {
        UserEntity newEntity = new UserEntity();
        newEntity.setName(dto.getName());
        newEntity.setFirstname(dto.getFirstname());
        newEntity.setLastname(dto.getLastname());
        newEntity.setAddress(dto.getAddress());
        newEntity.setEmail(dto.getEmail());
        newEntity.setPassword(dto.getPassword());
        newEntity.setDynnavid(dto.getDynnavid());

        return newEntity;
    }

    public UserDto getDtoFromEntity(UserEntity entity) {
        UserDto newDto = new UserDto();
        newDto.setName(entity.getName());
        newDto.setFirstname(entity.getFirstname());
        newDto.setLastname(entity.getLastname());
        newDto.setAddress(entity.getAddress());
        newDto.setEmail(entity.getEmail());
        newDto.setPassword(entity.getPassword());
        newDto.setDynnavid(entity.getDynnavid());

        return newDto;
    }

    public UserDto getDtoFromEntityWithoutSecrets(UserEntity entity) {
        UserDto newDto = this.getDtoFromEntity(entity);
        newDto.setPassword("");

        return newDto;
    }
}
