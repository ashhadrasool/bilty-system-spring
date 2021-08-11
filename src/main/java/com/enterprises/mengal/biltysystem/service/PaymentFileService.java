package com.enterprises.mengal.biltysystem.service;

import com.enterprises.mengal.biltysystem.model.PaymentFile;
import com.enterprises.mengal.biltysystem.repository.PaymentFileRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentFileService {

    @Autowired
    PaymentFileRepo paymentFileRepo;

    public PaymentFile create(PaymentFile paymentFile) {
        return paymentFileRepo.save(paymentFile);
    }

    public boolean exists(String md5hash){
        return paymentFileRepo.existsByMd5Hash(md5hash);
    }

}


// .        .
// ..      ..
// ...    ...
// ....  ....
// ..........
