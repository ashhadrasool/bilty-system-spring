package com.enterprises.mengal.biltysystem.repository;

import com.enterprises.mengal.biltysystem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
