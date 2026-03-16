package com.dave.personalblogapi.service;

import com.dave.personalblogapi.dto.UserRequestDTO;
import com.dave.personalblogapi.dto.UserResponseDTO;
import com.dave.personalblogapi.entity.User;
import com.dave.personalblogapi.mapper.UserMapper;
import com.dave.personalblogapi.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserResponseDTO createUser(UserRequestDTO RequestDTO) {
        User user = userMapper.toEntity(RequestDTO);
        User savedUser=userRepository.save(user);
        return userMapper.toResponseDTO(savedUser);
    }

}
