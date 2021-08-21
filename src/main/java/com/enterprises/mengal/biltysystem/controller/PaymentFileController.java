package com.enterprises.mengal.biltysystem.controller;

import com.enterprises.mengal.biltysystem.dto.bilty.CreatePaymentEntriesDTO;
import com.enterprises.mengal.biltysystem.model.PaymentEntry;
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
    public Boolean fileExists(@PathVariable("hash") String hash){
        return paymentFileService.exists(hash);
    }
    @GetMapping("/{hash}")
    public PaymentFile getFile(@PathVariable("hash") String hash){
        return paymentFileService.getFileByHash(hash);
    }

    @PostMapping("/create")
    public PaymentFile create(@Valid @RequestBody PaymentFile paymentFile){
        return paymentFileService.create(paymentFile);
    }
    @PostMapping("/data")
    public List<PaymentEntry> createPaymentEntries(@Valid @RequestBody CreatePaymentEntriesDTO createPaymentEntriesDTO){
        return paymentFileService.createPaymentEntries(createPaymentEntriesDTO);
    }
    @GetMapping("/data/{id}")
    public List<PaymentEntry> getPaymentEntries(@PathVariable("id") long paymentFileId){
        return paymentFileService.getPaymentEntriesByPaymentFile(paymentFileId);
    }

    @PostMapping("/verify")
    public List<PaymentEntry> verifyPaymentEntries(@Valid @RequestBody List<PaymentEntry> paymentEntryList){
        return paymentFileService.verifyPaymentEntries(paymentEntryList);
    }

}
