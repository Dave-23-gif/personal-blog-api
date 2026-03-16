package com.dave.personalblogapi.controller;

import com.dave.personalblogapi.dto.UserRequestDTO;
import com.dave.personalblogapi.dto.UserResponseDTO;
import com.dave.personalblogapi.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping
    public UserResponseDTO createUser(@Valid @RequestBody UserRequestDTO requestDTO){
        return  userService.createUser(requestDTO);
    }
}
