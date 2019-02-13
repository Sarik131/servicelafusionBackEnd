package com.gtu.servicelafusion.controllers;

import com.gtu.servicelafusion.entity.ServiceProvider;
import com.gtu.servicelafusion.entity.User;
import com.gtu.servicelafusion.repository.ServiceProviderRepository;
import com.gtu.servicelafusion.repository.UserRepository;
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
public class RegistrationController
{
    @Autowired
    //RegisterService registerService;
    ServiceProviderRepository spRepository;
    @PostMapping("/register")

    public  Map<String,Object> register(HttpServletRequest req) {

        System.out.println("Email : " + req.getParameter("email").toString());
        System.out.println("Password : " + req.getParameter("password").toString());
        System.out.println("Name : " + req.getParameter("name").toString());
        System.out.println("Phoneo : " + req.getParameter("phoneno").toString());
        System.out.println("experience : " + req.getParameter("experience").toString());
        System.out.println("category : Test" );

        //registerService.registerCustomer(req.getParameter("email").toString(), req.getParameter("password").toString(), req.getParameter("name").toString(), req.getParameter("phoneno").toString(), req.getParameter("address").toString());//to call service method
       // registerService.registerCustomer(req);


        Map<String, Object> map = new HashMap<>();
//        map.put("Email : " , req.getParameter("email"));
//        map.put("Password : " , req.getParameter("password"));
//        map.put("Name : " , req.getParameter("name"));
//        map.put("Phoneo : " , req.getParameter("phoneno"));
//        map.put("Address : " , req.getParameter("address"));
        map.put("message", "Customer Registered!!");
        //User user=userRepository.saveAll(map.hashCode());

        ServiceProvider sp=new ServiceProvider();
        //sp.setId((long) 5);
        sp.setName(req.getParameter("name"));
        sp.setEmail(req.getParameter("email"));
        sp.setPassword(req.getParameter("password"));
        sp.setPhoneno(req.getParameter("phoneno"));
        sp.setCategory(req.getParameter("category"));
        sp.setExperience(req.getParameter("experience"));

        spRepository.save(sp);

        return map;
    }


}
