package com.enterprises.mengal.biltysystem.service;

import com.enterprises.mengal.biltysystem.dto.bilty.CreateBiltyDTO;
import com.enterprises.mengal.biltysystem.model.Bilty;
import com.enterprises.mengal.biltysystem.repository.BiltyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Locale;

@Service
public class BiltyService {

    @Autowired
    BiltyRepo biltyRepo;

    @Autowired
    private CodeService codeService;

    public Page<Bilty> getAll(Pageable pageable){
        return biltyRepo.findAll(pageable);
    }

    public List<Bilty> getAllBetweenDates(String startDate, String endDate){

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date sdate = formatter.parse(startDate);
            Date edate = formatter.parse(endDate);
            return biltyRepo.findByDateGreaterThanEqualAndDateLessThanEqual(sdate, edate);
        } catch (ParseException e) {
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

        bilty.setStatus(codeService.getCodeById(createBiltyDTO.getStatusid()));
        bilty.setTo(codeService.getCodeById(createBiltyDTO.getToid()));
        bilty.setFrom(codeService.getCodeById(createBiltyDTO.getFromid()));
        bilty.setSender(codeService.getCodeById(createBiltyDTO.getSenderid()));
        bilty.setMaterial(codeService.getCodeById(createBiltyDTO.getMaterialid()));
        bilty.setAdvanceAmount(createBiltyDTO.getAdvanceamount());
        bilty.setContainerNo(createBiltyDTO.getContainerno());
        bilty.setDieselAmount(createBiltyDTO.getDieselamount());
        bilty.setDriverName(createBiltyDTO.getDrivername());
        bilty.setDriverMobileNo(createBiltyDTO.getDrivermobileno());
        bilty.setMsNo(createBiltyDTO.getMsno());
        bilty.setPoNo(createBiltyDTO.getPono());
        bilty.setVehicleNo(createBiltyDTO.getVehicleno());
        bilty.setActiveIndicator(true);
        bilty.setWeight(createBiltyDTO.getWeight());
        bilty.setDate(createBiltyDTO.getDate());

        return biltyRepo.save(bilty);

    }

}
