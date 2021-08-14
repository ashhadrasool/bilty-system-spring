package com.enterprises.mengal.biltysystem.service;

import com.enterprises.mengal.biltysystem.dto.bilty.BiltySearchDTO;
import com.enterprises.mengal.biltysystem.dto.bilty.CreateBiltyDTO;
import com.enterprises.mengal.biltysystem.model.Bilty;
import com.enterprises.mengal.biltysystem.model.QBilty;
import com.enterprises.mengal.biltysystem.repository.BiltyRepo;
import com.enterprises.mengal.biltysystem.repository.predicatee.BiltyPredicate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.querydsl.core.types.Predicate;
import com.querydsl.core.types.dsl.BooleanExpression;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;


@Service
public class BiltyService {

    @Autowired
    BiltyRepo biltyRepo;

    @Autowired
    private CodeService codeService;

    public Page<Bilty> getAll(BiltySearchDTO biltySearchDTO, Pageable pageable){
        BiltyPredicate biltyPredicate = new BiltyPredicate(biltySearchDTO);
        return biltyRepo.findAll(biltyPredicate.getPredicate(), pageable);
    }

    public List<Bilty> getAllBetweenDates(String startDate, String endDate){

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        try {
//            Date sdate = formatter.parse(startDate);
//            Date edate = formatter.parse(endDate);

            LocalDate sdate = LocalDate.parse(startDate);
            LocalDate edate = LocalDate.parse(endDate);

            return biltyRepo.findByDateGreaterThanEqualAndDateLessThanEqual(sdate, edate);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }

    public Bilty getBiltyById(long id){
        return biltyRepo.findOneByBiltyId(id);
    }

    public Bilty create(CreateBiltyDTO createBiltyDTO){
        //b.setVerified(false);
        Bilty bilty = new Bilty();

        bilty.setStatus(codeService.getCodeById(createBiltyDTO.getStatusId()));
        bilty.setTo(codeService.getCodeById(createBiltyDTO.getToId()));
        bilty.setFrom(codeService.getCodeById(createBiltyDTO.getFromId()));
        bilty.setSender(codeService.getCodeById(createBiltyDTO.getSenderId()));
        bilty.setMaterial(codeService.getCodeById(createBiltyDTO.getMaterialId()));
        bilty.setAdvanceAmount(createBiltyDTO.getAdvanceAmount());
        bilty.setContainerNo(createBiltyDTO.getContainerNo());
        bilty.setDieselAmount(createBiltyDTO.getDieselAmount());
        bilty.setDriverName(createBiltyDTO.getDriverName());
        bilty.setDriverMobileNo(createBiltyDTO.getDriverMobileNo());
        bilty.setMsNo(createBiltyDTO.getMsNo());
        bilty.setPoNo(createBiltyDTO.getPoNo());
        bilty.setVehicleNo(createBiltyDTO.getVehicleNo());
        //bilty.setActiveIndicator(true);
        bilty.setWeight(createBiltyDTO.getWeight());
        bilty.setDate(createBiltyDTO.getDate());

        return biltyRepo.save(bilty);

    }

}
