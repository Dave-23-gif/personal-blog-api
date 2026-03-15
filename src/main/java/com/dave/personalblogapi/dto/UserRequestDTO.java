package com.dave.personalblogapi.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserRequestDTO {
    @NotBlank(message = "name is required")
    private String name;
    @Email(message = "invalid email format")
    @NotBlank(message = "email is reqiured")
    private String email;
    @NotBlank(message = "password is required")
    @Size(min = 5, max = 16, message = "must be atleast 5 characters and must not exceed 16 characters")
    private String password;
    @NotBlank(message = "bio is required")
    @Size(min = 1, max = 100, message = "must be atlest 1 character and must not exceed 100 characters")
    private String bio;
}
