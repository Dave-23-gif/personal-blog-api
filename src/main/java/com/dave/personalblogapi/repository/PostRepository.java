package com.dave.personalblogapi.repository;

import com.dave.personalblogapi.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
