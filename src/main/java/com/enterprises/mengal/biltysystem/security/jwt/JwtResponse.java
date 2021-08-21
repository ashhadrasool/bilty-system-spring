package com.enterprises.mengal.biltysystem.security.jwt;

import lombok.Data;

import java.util.List;

@Data
public class JwtResponse {

    private String token;
    private String type = "Basic";
    private Long userId;
    private String email;
    private List roles;

    public JwtResponse(String jwt, Long userId, String email, List roles) {

        this.token = jwt;
        this.userId = userId;
        this.email = email;
        this.roles = roles;
    }
}