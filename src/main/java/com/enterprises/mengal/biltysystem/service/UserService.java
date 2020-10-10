package com.enterprises.mengal.biltysystem.service;

import com.enterprises.mengal.biltysystem.model.User;
import com.enterprises.mengal.biltysystem.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserService {

   // User user;

    @Autowired
    private UserRepo userRepository;

//    public User getUser(String email) {
//        return userRepository.findOneByEmail(email);
//    }

    public User create(User user) {
        return userRepository.save(user);
    }

    public User update(User user) {
        return userRepository.save(user);
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

}
