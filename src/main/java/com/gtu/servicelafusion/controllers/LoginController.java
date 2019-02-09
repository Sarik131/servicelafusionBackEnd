package com.gtu.servicelafusion.controllers;

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


public class LoginController {
    @Autowired
    UserService userService;
    @PostMapping("/login1")


    //public String home(@RequestBody Map<String, Object> req)
    public  Map<String,Object> login(HttpServletRequest req) {
        System.out.println("Email : " + req.getParameter("email"));
        System.out.println("Password : " + req.getParameter("password"));
        userService.checkUserLogin(req.getParameter("email").toString(), req.getParameter("password").toString());//to call service method
        Map<String, Object> map = new HashMap<>();
        map.put("message", "Data received!!");
        return map;
    }

        //       System.out.println("Email : " + req.get("email"));
        //System.out.println("Password : " + req.get("password"));
        // userService.checkUserLogin(req.get("email").toString(),req.get("password").toString());//to call service method

//    public String register(@RequestBody Map<String, Object> req) {
//
//        System.out.println("Email :" + req.get("email"));
//        System.out.println("Password :" + req.get("password"));
//        return "User Registered";
//    }
}
