package com.enterprises.mengal.biltysystem.repository;


import com.enterprises.mengal.biltysystem.model.PaymentFile;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PaymentFileRepo extends JpaRepository<PaymentFile, Long> {

    boolean existsByMd5Hash(String md5Hash);
    PaymentFile findByMd5Hash(String md5Hash);
}
