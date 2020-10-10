package com.enterprises.mengal.biltysystem.service;

import com.enterprises.mengal.biltysystem.model.Bilty;
import com.enterprises.mengal.biltysystem.repository.BiltyRepo;
import com.enterprises.mengal.biltysystem.util.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BiltyService {

    @Autowired
    BiltyRepo biltyRepo;

    public Message<List<Bilty>> getAllBiltyEntries(){
        Message message = new Message();
        message.setData(biltyRepo.findAll());
        return message;

    }

    public Message<Bilty> create(Bilty b){
        b.setVerified(false);
        Message message = new Message();
        message.setData(biltyRepo.save(b));
        return message;

    }

}
