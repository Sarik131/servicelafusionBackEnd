package com.gtu.servicelafusion.controllers;

import com.gtu.servicelafusion.entity.ServiceProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "welcome...";
    }


//    ServiceProvider sp=new ServiceProvider();
//        sp.setId((long) 3);
//        sp.setName(req.getParameter("name"));
//        sp.setEmail(req.getParameter("email"));
//        sp.setPassword(req.getParameter("password"));
//        sp.setPhoneno(req.getParameter("phoneno"));
//        sp.setExperience(req.getParameter("experience"));
//
//        registerRepository.save(sp);
}
