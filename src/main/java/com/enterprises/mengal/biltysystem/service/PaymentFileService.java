package com.enterprises.mengal.biltysystem.service;

import com.enterprises.mengal.biltysystem.dto.bilty.CreatePaymentEntriesDTO;
import com.enterprises.mengal.biltysystem.dto.bilty.PaymentEntryDTO;
import com.enterprises.mengal.biltysystem.model.Code;
import com.enterprises.mengal.biltysystem.model.PaymentEntry;
import com.enterprises.mengal.biltysystem.model.PaymentFile;
import com.enterprises.mengal.biltysystem.repository.BiltyRepo;
import com.enterprises.mengal.biltysystem.repository.CodeRepo;
import com.enterprises.mengal.biltysystem.repository.PaymentEntryRepo;
import com.enterprises.mengal.biltysystem.repository.PaymentFileRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Service
public class PaymentFileService {

    @Autowired
    BiltyRepo biltyRepo;

    @Autowired
    PaymentFileRepo paymentFileRepo;

    @Autowired
    PaymentEntryRepo paymentEntryRepo;

    @Autowired
    CodeRepo codeRepo;

    public PaymentFile create(PaymentFile paymentFile) {
        return paymentFileRepo.save(paymentFile);
    }

    public List<PaymentEntry> createPaymentEntries(CreatePaymentEntriesDTO createPaymentEntriesDTO) {
        List<PaymentEntry> paymentEntries = new ArrayList<>();

        IntStream.range(0, createPaymentEntriesDTO.getPaymentEntryList().size()).forEach(i -> {
            PaymentEntryDTO paymentEntryDTO = createPaymentEntriesDTO.getPaymentEntryList().get(i);
            PaymentEntry paymentEntry = new PaymentEntry();

            paymentEntry.setDate(paymentEntryDTO.getDate());
            paymentEntry.setWeight(paymentEntryDTO.getWeight());
            paymentEntry.setVehicleNo(paymentEntryDTO.getVehicleNo());
            paymentEntry.setPaymentEntryFileIndex(i);
            paymentEntry.setPaymentFileId(createPaymentEntriesDTO.getPaymentFileId());

            paymentEntry = paymentEntryRepo.save(paymentEntry);
            paymentEntries.add(paymentEntry);
        });
        return paymentEntries;
    }

    public List<PaymentEntry> getPaymentEntriesByPaymentFile(long paymentFileId){
        return paymentEntryRepo.findAllByPaymentFileId(paymentFileId);
    }

    public List<PaymentEntry> verifyPaymentEntries(List<PaymentEntry> paymentEntryList){
        Code verified = codeRepo.getOneByDescription("Verified").get();
        List<PaymentEntry> paymentEntryListUpdated = new ArrayList<>();
        paymentEntryList.stream().forEach(p ->{
            p.getBilty().setStatus(verified);
            biltyRepo.save(p.getBilty());

            paymentEntryListUpdated.add(paymentEntryRepo.save(p));

        });
        return paymentEntryListUpdated;
    }

    public boolean exists(String md5hash){
        return paymentFileRepo.existsByMd5Hash(md5hash);
    }

    public PaymentFile getFileByHash(String md5hash){
        return paymentFileRepo.findByMd5Hash(md5hash);
    }

}


// .        .
// ..      ..
// ...    ...
// ....  ....
// ..........
