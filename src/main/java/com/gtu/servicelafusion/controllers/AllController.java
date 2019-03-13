package com.gtu.servicelafusion.controllers;

import com.gtu.servicelafusion.repository.ServiceProviderRepository;
import com.gtu.servicelafusion.service.SpListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class AllController {

//    TODO step - 6  for calling service
    @Autowired
SpListService spListService;

    @Autowired
    ServiceProviderRepository serviceProviderRepository;
@GetMapping("/all")
public Map<String,Object> findServiceProviders (HttpServletRequest req)
{
    Map<String,Object> map=new HashMap<String,Object>() ;
    System.out.println("In splist :"+req.getParameter("category"));



//    if(spListService.getSpList(req.getParameter("category")) != null)
//    {
//        System.out.println("Not null");
//    }

    //List<ServiceProvider> s=spListService.getSpList(req.getParameter("category"));
   // System.out.println("Size of arrylist :"+s.size());
    map.put("splist",serviceProviderRepository.findAll());
//    map.put("splist",serviceProviderRepository.findAll());
    return map;
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

//    ArrayList<ServiceProvider> al=spListService.getSpList(req.getParameter("category"));
//    for (int i = 0; i < al.size(); i++) {
//        String name = al.get(i).getName();
//        String exp = al.get(i).getExperience();
//        System.out.println("arraylist" + name + "  " + exp);
//    }
//    ArrayList<ServiceProvider> sp= (ArrayList<ServiceProvider>) spListService.getSpList(req.getParameter("category"));
//    for (ServiceProvider spd :sp) {
//        System.out.println(spd.getExperience());
//        System.out.println(spd.getName());
//    }
//