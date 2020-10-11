package com.enterprises.mengal.biltysystem.service;

import com.enterprises.mengal.biltysystem.dto.bilty.CreateBiltyDTO;
import com.enterprises.mengal.biltysystem.model.Bilty;
import com.enterprises.mengal.biltysystem.model.Code;
import com.enterprises.mengal.biltysystem.repository.BiltyRepo;
import com.enterprises.mengal.biltysystem.util.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BiltyService {

    @Autowired
    BiltyRepo biltyRepo;

    @Autowired
    private CodeService codeService;

    public Message<List<Bilty>> getAllBiltyEntries(){
        Message message = new Message();
        message.setData(biltyRepo.findAll());
        return message;

    }public Message<List<Bilty>> getAllBiltyEntries(long id){
        Message message = new Message();
        message.setData(biltyRepo.findAllByBiltyid(id));
        return message;
    }

    public Message<Bilty> create(CreateBiltyDTO createBiltyDTO){
        //b.setVerified(false);
        Message message = new Message();
        Bilty bilty = new Bilty();

        bilty.setStatus(codeService.getCodeById(createBiltyDTO.getStatusid()));
        bilty.setTo(codeService.getCodeById(createBiltyDTO.getToid()));
        bilty.setFrom(codeService.getCodeById(createBiltyDTO.getFromid()));
        bilty.setSender(codeService.getCodeById(createBiltyDTO.getSenderid()));
        bilty.setMaterial(codeService.getCodeById(createBiltyDTO.getMaterialid()));
        bilty.setAdvanceamount(createBiltyDTO.getAdvanceamount());
        bilty.setContainerno(createBiltyDTO.getContainerno());
        bilty.setDieselamount(createBiltyDTO.getDieselamount());
        bilty.setDrivername(createBiltyDTO.getDrivername());
        bilty.setDrivermobileno(createBiltyDTO.getDrivermobileno());
        bilty.setMsno(createBiltyDTO.getMsno());
        bilty.setPono(createBiltyDTO.getPono());
        bilty.setVehicleno(createBiltyDTO.getVehicleno());
        bilty.setVerified(false);
        bilty.setActiveIndicator(true);
        bilty.setWeight(createBiltyDTO.getWeight());

        message.setData(biltyRepo.save(bilty));
        return message;

    }

}
