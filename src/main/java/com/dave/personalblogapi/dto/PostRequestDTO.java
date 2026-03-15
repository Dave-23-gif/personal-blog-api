package com.dave.personalblogapi.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PostRequestDTO {
    @NotBlank(message = "Title is needed")
    @Size(min = 1, max = 100, message = "must be atleast 1 character and must not exceed 100 characters")
    private String title;
    @NotBlank(message = "content is required")
    private String content;
    @NotNull(message = "author id is required")
    private Long authorId;
}
