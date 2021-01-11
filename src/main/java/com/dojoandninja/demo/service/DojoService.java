package com.dojoandninja.demo.service;

import com.dojoandninja.demo.models.Dojo;
import com.dojoandninja.demo.models.Ninja;
import com.dojoandninja.demo.repository.DojoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DojoService {
    private final DojoRepository dojoRepository;

    public DojoService(DojoRepository dojoRepository) {
        this.dojoRepository = dojoRepository;
    }

    public List<Dojo> allDojo(){
        return this.dojoRepository.findAll();
    }

    public Dojo addDojo(Dojo dojo){
        return dojoRepository.save(dojo);
    }


    public Dojo findDojoById(Long id){
        Optional<Dojo> dojo=dojoRepository.findById(id);
        if (dojo.isPresent()){
            return dojo.get();
        }else{
            return null;
        }

    }
}
