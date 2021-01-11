package com.dojoandninja.demo.service;

import com.dojoandninja.demo.models.Dojo;
import com.dojoandninja.demo.models.Ninja;
import com.dojoandninja.demo.repository.NinjaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {
    private final NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }


    public List<Ninja> allNinja(Ninja ninja){

        return ninjaRepository.findAll();
    }

//    public Ninja findNinjaById(Long id){
//       Optional<Ninja> n=ninjaRepository.findById(id);
//       if (n.isPresent()){
//           return n.get();
//
//       }else {
//           return  null;
//       }
//    }



    public Ninja create(Ninja ninja){
        return ninjaRepository.save(ninja);
    }

    public Ninja findNinjaById(Long id){
        Optional<Ninja> ninja=ninjaRepository.findById(id);
        if (ninja.isPresent()){
            return ninja.get();
        }else{
            return null;
        }

    }
}
