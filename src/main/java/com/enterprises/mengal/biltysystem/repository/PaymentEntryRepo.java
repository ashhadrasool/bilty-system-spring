package com.enterprises.mengal.biltysystem.repository;

import com.enterprises.mengal.biltysystem.model.PaymentEntry;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PaymentEntryRepo extends JpaRepository<PaymentEntry, Long> {
    List<PaymentEntry> findAllByPaymentFileId(long paymentFileId);
}
