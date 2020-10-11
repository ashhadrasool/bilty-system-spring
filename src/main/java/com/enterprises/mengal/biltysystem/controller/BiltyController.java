package com.enterprises.mengal.biltysystem.controller;

import com.enterprises.mengal.biltysystem.dto.bilty.CreateBiltyDTO;
import com.enterprises.mengal.biltysystem.model.Bilty;
import com.enterprises.mengal.biltysystem.model.Code;
import com.enterprises.mengal.biltysystem.service.BiltyService;
import com.enterprises.mengal.biltysystem.service.CodeService;
import com.enterprises.mengal.biltysystem.util.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.Valid;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/bilty")
public class BiltyController {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private BiltyService biltyService;


    @GetMapping("/all")
    public Message<List<Bilty>> getAllBiltyReceipts(){
        log.debug("inside::getAllBiltyList");
        return biltyService.getAllBiltyEntries();

    }

    @GetMapping("/aa/{id}")
    public Message<List<Bilty>> getBilty(@PathVariable("id") long id){
        log.debug("inside::getAllBiltyList");
        return biltyService.getAllBiltyEntries(id);
    }

    @PostMapping("/create")
    public Message<Bilty> createBilty(@Valid @RequestBody CreateBiltyDTO createBiltyDTO){

        log.debug("inside::getAllBiltyList");
        return biltyService.create(createBiltyDTO);
    }

}
