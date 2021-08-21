package com.enterprises.mengal.biltysystem.dto.bilty;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserRegisterDTO {
    private String email;

    private String firstName;
    private String lastName;
    private String jobTitle;
    private String phoneNo;
    private String identity; //cnic and shit
    private String imageUrl;

    private String password;


}
