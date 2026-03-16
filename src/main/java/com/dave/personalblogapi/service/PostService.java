package com.dave.personalblogapi.service;

import com.dave.personalblogapi.dto.PostRequestDTO;
import com.dave.personalblogapi.dto.PostResponseDTO;
import com.dave.personalblogapi.entity.Post;
import com.dave.personalblogapi.entity.User;
import com.dave.personalblogapi.mapper.PostMapper;
import com.dave.personalblogapi.repository.PostRepository;
import com.dave.personalblogapi.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;
    private final UserRepository userRepository;
    private final PostMapper postMapper;

    public PostResponseDTO createPost(PostRequestDTO RequestDTO) {
        User author=userRepository.findById(RequestDTO.getAuthorId())
                .orElseThrow(()->new RuntimeException("User Not Found"));
        Post post = postMapper.toEntity(RequestDTO);
        post.setAuthor(author);

        Post savedPost = postRepository.save(post);
        return postMapper.toResponseDTO(savedPost);
    }
}
