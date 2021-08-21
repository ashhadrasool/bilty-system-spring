package com.enterprises.mengal.biltysystem.service;

import com.enterprises.mengal.biltysystem.dto.bilty.UserRegisterDTO;
import com.enterprises.mengal.biltysystem.dto.bilty.UserSigninDTO;
import com.enterprises.mengal.biltysystem.model.User;
import com.enterprises.mengal.biltysystem.repository.UserRepo;
import com.enterprises.mengal.biltysystem.security.dto.UserDetailsImpl;
import com.enterprises.mengal.biltysystem.security.jwt.JwtResponse;
import com.enterprises.mengal.biltysystem.security.jwt.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    PasswordEncoder encoder;

    @Autowired
    JwtUtils jwtUtils;

    @Autowired
    private UserRepo userRepo;

    public User create(User user) {
        return userRepo.save(user);
    }

    public User update(User user) {
        return userRepo.save(user);
    }

    public List<User> getAllUsers(){
        return userRepo.findAll();
    }

    public JwtResponse signIn(UserSigninDTO userSigninDTO){
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(userSigninDTO.getEmail(), userSigninDTO.getPassword()));

        SecurityContextHolder.getContext().setAuthentication(authentication);
        String jwt = jwtUtils.generateJwtToken(authentication);

        UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();
        List<String> roles = userDetails.getAuthorities().stream()
                .map(item -> item.getAuthority())
                .collect(Collectors.toList());

        return new JwtResponse(jwt,
                userDetails.getUserId(),
                userDetails.getEmail(),
                roles);
    }

    public User register(UserRegisterDTO userRegisterDTO){
        User user = new User(
                userRegisterDTO.getEmail(),
                encoder.encode(userRegisterDTO.getPassword()),
                userRegisterDTO.getFirstName(),
                userRegisterDTO.getLastName(),
                userRegisterDTO.getJobTitle(),
                userRegisterDTO.getPhoneNo(),
                userRegisterDTO.getImageUrl()
                );
        return userRepo.save(user);

    }

}
