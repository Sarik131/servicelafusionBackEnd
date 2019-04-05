package com.gtu.servicelafusion.controllers;

import com.gtu.servicelafusion.entity.ServiceProvider;
import com.gtu.servicelafusion.entity.User;
import com.gtu.servicelafusion.repository.CustRegisterRepository;
import com.gtu.servicelafusion.repository.ServiceProviderRepository;
import com.gtu.servicelafusion.repository.UserRepository;
import com.gtu.servicelafusion.service.CustRegisterService;
import com.gtu.servicelafusion.service.RegisterService;
import com.gtu.servicelafusion.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class CustRegistrationController
{
    @Autowired
    CustRegisterService custRegisterService;
    @PostMapping("/cregister")

    public  Map<String,Object> register(HttpServletRequest req) {

        System.out.println("Email : " + req.getParameter("email"));
        System.out.println("Password : " + req.getParameter("password"));
        System.out.println("Name : " + req.getParameter("name"));
        System.out.println("Phoneo : " + req.getParameter("phoneno"));
        System.out.println("address : " + req.getParameter("address"));
        //System.out.println("category : "+req.getParameter("category") );

        custRegisterService.registerCustomer(req.getParameter("email"), req.getParameter("password"), req.getParameter("name"), req.getParameter("phoneno"), req.getParameter("address"));
       // registerService.registerCustomer(req);


        Map<String, Object> map = new HashMap<>();
        map.put("message", "Customer Registered!!");


       return map;
    }


}
