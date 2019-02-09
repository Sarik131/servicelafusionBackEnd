package com.gtu.servicelafusion.controllers;

import com.gtu.servicelafusion.entity.ServiceProvider;
import com.gtu.servicelafusion.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class ServiceProviderController {

//    TODO step - 6  for calling service
    @Autowired
    UserService userService;
   // ServiceProvider serviceProvider;//initialize userService obj

//    @PostMapping("/login")
//    public String home(@RequestBody Map<String, Object> req) {
//
//        System.out.println("Email : " + req.get("email"));
//        System.out.println("Password : " + req.get("password"));
//        userService.checkUserLogin(req.get("email").toString(),req.get("password").toString());//to call service method
//        return "Data received!!";
//    }
//
    @GetMapping("/serviceProviders")
    public List<ServiceProvider> findServiceProviders ()
    {
        return userService.findAllServiceProviders();
    }

    {

    }
}
