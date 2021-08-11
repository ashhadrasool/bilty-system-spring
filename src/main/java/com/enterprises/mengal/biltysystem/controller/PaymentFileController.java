package com.enterprises.mengal.biltysystem.controller;

import com.enterprises.mengal.biltysystem.model.PaymentFile;
import com.enterprises.mengal.biltysystem.service.PaymentFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@CrossOrigin
@RestController
@RequestMapping("/api/paymentfile")
public class PaymentFileController {

    @Autowired
    PaymentFileService paymentFileService;

    @GetMapping("/exists/{hash}")
    public Boolean getAllUsers(@PathVariable("hash") String hash){
        return paymentFileService.exists(hash);
    }

    @PostMapping("/create")
    public PaymentFile create(@Valid @RequestBody PaymentFile paymentFile){
        return paymentFileService.create(paymentFile);
    }

}
