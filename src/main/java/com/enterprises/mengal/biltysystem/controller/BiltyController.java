package com.enterprises.mengal.biltysystem.controller;

import com.enterprises.mengal.biltysystem.dto.bilty.CreateBiltyDTO;
import com.enterprises.mengal.biltysystem.model.Bilty;
import com.enterprises.mengal.biltysystem.service.BiltyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/bilty")
public class BiltyController {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private BiltyService biltyService;


    @GetMapping("/all" )
    public Page<Bilty> getAllBiltyReceipts(Pageable pageable){
        log.debug("inside::getAllBiltyList");
        return biltyService.getAll(pageable);

    }

    @GetMapping("/allwithindates" )
    public List<Bilty> getBiltyListBetweenDates(@RequestParam("startdate") String startDate, @RequestParam("enddate") String endDate){
        log.debug("inside::getAllBiltyList");
        return biltyService.getAllBetweenDates(startDate, endDate);

    }

    @GetMapping("/{id}")
    public Bilty getBilty(@PathVariable("id") long id){
        log.debug("inside::getAllBiltyList");
        return biltyService.getBiltyById(id);
    }

    @PostMapping("/create")
    public Bilty createBilty(@Valid @RequestBody CreateBiltyDTO createBiltyDTO){
        log.debug("inside::getAllBiltyList");
        return biltyService.create(createBiltyDTO);
    }

}
