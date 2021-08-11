package com.enterprises.mengal.biltysystem.service;

import com.enterprises.mengal.biltysystem.model.Code;
import com.enterprises.mengal.biltysystem.repository.CodeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CodeService {

    @Autowired
    CodeRepo codeRepository;

    public List<Code> getAllCodesByType(String type){
        return codeRepository.findAllByType(type);
    }

    public Code getCodeById(long id){
        Optional<Code> c=  codeRepository.findById(id);
        return c.get();
    }

    public List<Code> getAllCodes(){
        return codeRepository.findAll();
    }

    public Code create(Code code){
        return codeRepository.save(code);
    }
}
