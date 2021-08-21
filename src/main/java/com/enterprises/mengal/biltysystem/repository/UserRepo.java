package com.enterprises.mengal.biltysystem.repository;

import com.enterprises.mengal.biltysystem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Long> {
    public Optional<User> findByEmail(String email);
}
