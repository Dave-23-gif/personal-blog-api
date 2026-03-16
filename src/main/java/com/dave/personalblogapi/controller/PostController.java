package com.dave.personalblogapi.controller;

import com.dave.personalblogapi.dto.PostRequestDTO;
import com.dave.personalblogapi.dto.PostResponseDTO;
import com.dave.personalblogapi.service.PostService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/posts")
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;

    @PostMapping
    public PostResponseDTO createPost(@Valid @RequestBody PostRequestDTO requestDTO){
        return  postService.createPost(requestDTO);

    }

}
