package com.gtu.servicelafusion.controllers;

import com.gtu.servicelafusion.repository.ServiceProviderRepository;
import com.gtu.servicelafusion.repository.SpListRepository;
import com.gtu.servicelafusion.service.SpListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class ServiceProviderController {

//    TODO step - 6  for calling service
    @Autowired
SpListService spListService;

    @PostMapping("/splist")
    public Map<String,Object> findServiceProviders (@RequestBody Map<String, Object> req)
    {
        Map<String,Object> map=new HashMap<String,Object>() ;
        System.out.println("In splist"+req.get("category"));
        map.put("splist",spListService.getSpList(req.get("category").toString()));
        return map;
    }
//@GetMapping("/splist")
//public Map<String,Object> findServiceProviders (HttpServletRequest req)
//{
//    Map<String,Object> map=new HashMap<String,Object>() ;
//    System.out.println("In splist"+req.getParameter("category"));
//    map.put("splist",spListService.getSpList(req.getParameter("category").toString()));
//    return map;
//}
    {

    }
}



// ServiceProvider serviceProvider;//initialize userService obj

//    @PostMapping("/login")
//    public String home(@RequestBody Map<String, Object> req) {
//
//        System.out.println("Email : " + req.get("email"));
//        System.out.println("Password : " + req.get("password"));
//        userService.checkUserLogin(req.get("email").toString(),req.get("password").toString());//to call service method
//        return "Data received!!";
//    }
