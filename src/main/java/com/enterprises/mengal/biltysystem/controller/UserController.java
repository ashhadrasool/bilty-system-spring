package com.enterprises.mengal.biltysystem.controller;


import com.enterprises.mengal.biltysystem.model.User;
import com.enterprises.mengal.biltysystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/users")
public class UserController {

    //@Autowired
    UserService userService;

    @GetMapping("/get/all")
    public ResponseEntity<List<User>> getAllUsers(){

        List<User> userList = userService.getAllUsers();

        return ResponseEntity.ok().body(userList);
    }

}


