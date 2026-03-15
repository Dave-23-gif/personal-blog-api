package com.dave.personalblogapi.mapper;

import com.dave.personalblogapi.dto.UserRequestDTO;
import com.dave.personalblogapi.dto.UserResponseDTO;
import com.dave.personalblogapi.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    public User toEntity(UserRequestDTO dto);
    public UserResponseDTO toResponseDTO(User user);
}
