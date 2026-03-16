package com.dave.personalblogapi.mapper;

import com.dave.personalblogapi.dto.PostRequestDTO;
import com.dave.personalblogapi.dto.PostResponseDTO;
import com.dave.personalblogapi.entity.Post;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PostMapper {
   public Post toEntity(PostRequestDTO dto);
   @Mapping(source = "author.name", target = "authorName")
   public PostResponseDTO toResponseDTO(Post post);
}
