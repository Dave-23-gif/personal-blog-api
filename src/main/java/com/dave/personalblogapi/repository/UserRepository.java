package com.dave.personalblogapi.repository;

import com.dave.personalblogapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
