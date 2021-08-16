package com.enterprises.mengal.biltysystem.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.math.BigInteger;

@Entity
@Data
public class User extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger userid;

    private String password;

    @NotNull
    @Email
    @Column(unique = true)
    private String email;

    private String firstName;
    private String lastName;
    private String jobTitle;
    private String phoneNo;
    private String identity; //cnic and shit
    private String imageUrl;

}
