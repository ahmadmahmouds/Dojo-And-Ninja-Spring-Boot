package com.dojoandninja.demo.controller;

import com.dojoandninja.demo.models.Dojo;
import com.dojoandninja.demo.models.Ninja;
import com.dojoandninja.demo.service.DojoService;
import com.dojoandninja.demo.service.NinjaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Optional;

@Controller
public class NinjaController {
    private final NinjaService ninjaService;
    private final DojoService dojoService;


    public NinjaController(NinjaService ninjaService, DojoService dojoService) {
        this.ninjaService = ninjaService;
        this.dojoService = dojoService;
    }

    @RequestMapping("ninjas/new")
    public String showForm(@ModelAttribute("ninja") Ninja ninja, Model model){
        List<Dojo> allDojo= dojoService.allDojo();
        model.addAttribute("allDojo",allDojo);
        return "ninja/new.jsp";
    }

    @RequestMapping(value = "/new" ,method = RequestMethod.POST)
    public String create(@ModelAttribute("ninja") Ninja ninja, Model model){
        ninjaService.create(ninja);
        return "redirect:dojos/"+ninja.getDojo().getId();
    }

    @RequestMapping("dojos/{id}")
    public String show(@PathVariable("id") Long id,Model model ){

        Dojo dojo=dojoService.findDojoById(id);

        List<Ninja> ninjas=dojo.getNinjas();

        model.addAttribute("ninjas",ninjas);

        model.addAttribute("dojo",dojo);
        return "ninja/show.jsp";
    }





}
