package com.enterprises.mengal.biltysystem.service;

import com.enterprises.mengal.biltysystem.model.Code;
import com.enterprises.mengal.biltysystem.repository.CodeRepo;
import com.enterprises.mengal.biltysystem.util.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CodeService {

    @Autowired
    CodeRepo codeRepository;

    public Message<List<Code>> getAllCodesByType(String type){
        Message message = new Message();
        message.setData(codeRepository.findAllByType(type));
        return message;
    }
    public Message<List<Code>> getAllCodes(){
        Message message = new Message();
        message.setData(codeRepository.findAll());
        return message;
    }

    public Message<Code> create(Code code){
        Message message = new Message();
        message.setData(codeRepository.save(code));
        return message;
    }
}
