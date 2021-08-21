package com.enterprises.mengal.biltysystem.controller;


import com.enterprises.mengal.biltysystem.dto.bilty.UserRegisterDTO;
import com.enterprises.mengal.biltysystem.dto.bilty.UserSigninDTO;
import com.enterprises.mengal.biltysystem.model.User;
import com.enterprises.mengal.biltysystem.security.jwt.JwtResponse;
import com.enterprises.mengal.biltysystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/all")
    public ResponseEntity<List<User>> getAllUsers(){
        List<User> userList = userService.getAllUsers();
        return ResponseEntity.ok().body(userList);
    }

    @PostMapping("/signin")
    public ResponseEntity<JwtResponse> signIn(@RequestBody UserSigninDTO userSigninDTO){
        return ResponseEntity.ok(userService.signIn(userSigninDTO));
    }

    @PostMapping("/signup")
    public ResponseEntity<User> register(@RequestBody UserRegisterDTO userRegisterDTO){
        return ResponseEntity.ok(userService.register(userRegisterDTO));
    }

}


