//package com.gtu.servicelafusion.controllers;
//
//import com.gtu.servicelafusion.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.Map;
//
//@RestController
//@RequestMapping("/user")
//public class QueryController {
//
////    TODO step - 6  for calling service
//    @Autowired
//    UserService userService;//initialize userService obj
//
//    @PostMapping("/login")
//        public String home(@RequestBody Map<String, Object> req) {
//
//        //Query Category
//        //Image link 1
//        //Image link 2
//        //Description
//
//            System.out.println("Email : " + req.get("email"));
//            System.out.println("Password : " + req.get("password"));
//            userService.checkUserLogin(req.get("email").toString(),req.get("password").toString());//to call service method
//            return "Data received!!";
//    }
//
////    public  String login(HttpServletRequest req){
////
////        //       System.out.println("Email : " + req.get("email"));
////        System.out.println("Email : " + req.getParameter("email"));
////        //System.out.println("Password : " + req.get("password"));
////        System.out.println("Password : " + req.getParameter("password"));
////        // userService.checkUserLogin(req.get("email").toString(),req.get("password").toString());//to call service method
////        userService.checkUserLogin(req.getParameter("email").toString(),req.getParameter("password").toString());//to call service method
////        return "Data received!!";
////    }
//
//}
