package com.gtu.servicelafusion.controllers;
import com.gtu.servicelafusion.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

//    TODO step - 6  for calling service
    @Autowired
    UserService userService;//initialize userService obj

    @PostMapping("/demo")
        public Map<String,Object> login(HttpServletRequest req) {

        System.out.println("Email : " + req.getParameter("email"));
        System.out.println("Password : " + req.getParameter("password"));
        userService.checkUserLogin(req.getParameter("email").toString(),req.getParameter("password").toString());//to call service method
        Map<String,Object> map=new HashMap<String,Object>() ;
        map.put("email",req.getParameter("email"));
        map.put("password",req.getParameter("password"));
        return map;
    }

//    public  String login(HttpServletRequest req){
//
//        //       System.out.println("Email : " + req.get("email"));
//        System.out.println("Email : " + req.getParameter("email"));
//        //System.out.println("Password : " + req.get("password"));
//        System.out.println("Password : " + req.getParameter("password"));
//        // userService.checkUserLogin(req.get("email").toString(),req.get("password").toString());//to call service method
//        userService.checkUserLogin(req.getParameter("email").toString(),req.getParameter("password").toString());//to call service method
//        return "Data received!!";
//    }
//      System.out.println("Email : " + req.get("email"));
//            System.out.println("Password : " + req.get("password"));
//            userService.checkUserLogin(req.get("email").toString(),req.get("password").toString());//to call service method
//            return "Data received!!";

}
