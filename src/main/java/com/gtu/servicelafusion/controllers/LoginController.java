package com.gtu.servicelafusion.controllers;

import com.gtu.servicelafusion.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
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
    public Map<String, Object> login(HttpServletRequest req) {
        String c_address,sp_id;
        String email;
        String password;
        String user;
        Map<String, Object> map = new HashMap<>();


        email = req.getParameter("email");
        password = req.getParameter("password");
        user = req.getParameter("user");
        System.out.println("Email : " + email);
        System.out.println("Password : " + password);
        System.out.println("User : " + user);

        if (user.equalsIgnoreCase("customer")) {

            String check = userService.checkUserLogin(req.getParameter("email"), req.getParameter("password"));//to call service method
            System.out.println("check :" + check);
            map.put("checkLogin", check);
            c_address = userService.findAddressByEmailAndPassword(req.getParameter("email"), req.getParameter("password"));
            System.out.println("c_address" + c_address);
            map.put("c_address", c_address);
            map.put("message", "Data received!!");

        } else {
            String check = userService.checkSpLogin(req.getParameter("email"), req.getParameter("password"));//to call service method
            System.out.println("check :" + check);
            map.put("checkLogin", check);
            sp_id = userService.findSp_idByEmailAndPassword(req.getParameter("email"), req.getParameter("password"));
            System.out.println("sp_id :" + sp_id);
            map.put("sp_id", sp_id);
            map.put("message", "Data received!!");
        }
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
