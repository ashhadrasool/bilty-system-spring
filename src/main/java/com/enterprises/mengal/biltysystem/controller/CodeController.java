package com.enterprises.mengal.biltysystem.controller;

import com.enterprises.mengal.biltysystem.model.Code;
import com.enterprises.mengal.biltysystem.service.CodeService;
import com.enterprises.mengal.biltysystem.util.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/code")
public class CodeController {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    CodeService codeService;

    @GetMapping("/all")
    public Message<List<Code>> getAllCodes(){
        log.debug("inside::getAllCodes");
        return codeService.getAllCodes();
    }

    @GetMapping("/allByType")
    public Message<List<Code>> getAllCodes(@Valid @RequestParam String type){
        log.debug("inside::getAllCodesByType");
        return codeService.getAllCodesByType(type);
    }

    @PostMapping("/create")
    public Message<Code> create(@Valid @RequestBody Code code){
        return codeService.create(code);
    }

}


