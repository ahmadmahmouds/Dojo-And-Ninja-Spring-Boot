package com.dojoandninja.demo.controller;

import com.dojoandninja.demo.models.Dojo;
import com.dojoandninja.demo.service.DojoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DojoController {
    private final DojoService  dojoService;

    public DojoController(DojoService dojoService) {
        this.dojoService = dojoService;
    }

    @RequestMapping("dojos/new")
    public String dojoForm(@ModelAttribute("dojo") Dojo dojo){
        return "dojo/new.jsp";
    }
    @RequestMapping(value = "dojos/new" ,method = RequestMethod.POST)
    public String createDojo(@ModelAttribute("dojo") Dojo dojo){
        dojoService.addDojo(dojo);
        return "redirect:/dojos/new";


    }
}
