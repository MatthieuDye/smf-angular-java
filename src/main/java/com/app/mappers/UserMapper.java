package com.app.mappers;

import com.app.dtos.UserDTO;
import com.app.entities.User;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserDTO userToUserDTO(User user);

    @InheritInverseConfiguration
    User userDTOToUser(UserDTO userDTO);
}
