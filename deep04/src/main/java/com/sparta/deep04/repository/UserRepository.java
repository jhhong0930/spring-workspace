package com.sparta.deep04.repository;

import com.sparta.deep04.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}