package com.gtu.servicelafusion.controllers;

import com.gtu.servicelafusion.entity.ServiceProvider;
import com.gtu.servicelafusion.repository.ServiceProviderRepository;
import com.gtu.servicelafusion.repository.SpListRepository;
import com.gtu.servicelafusion.service.SpListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class ServiceProviderController {

//    TODO step - 6  for calling service
    @Autowired
SpListService spListService;

    @Autowired
    ServiceProviderRepository serviceProviderRepository;
//    @PostMapping("/splist")
//    public Map<String,Object> findServiceProviders (@RequestBody Map<String, Object> req)
//    {
//        Map<String,Object> map=new HashMap<String,Object>() ;
//        System.out.println("In splist  :"+req.get("category"));
//        map.put("splist",spListService.getSpList(req.get("category").toString()));
////        ArrayList<ServiceProvider> al=spListService.getSpList(req.get("category").toString());
////        for (ServiceProvider sp : al) {
////            String name = sp.getName();
////            String exp = sp.getExperience();
////            System.out.println("arraylist" + name + "  " + exp);
////        }
//        return map;
//    }
@PostMapping("/splist")
public Map<String,Object> findServiceProviders (HttpServletRequest req)
{
    Map<String,Object> map=new HashMap<String,Object>() ;
    System.out.println("In splist :"+req.getParameter("category"));




    //List<ServiceProvider> s=spListService.getSpList(req.getParameter("category"));
   // System.out.println("Size of arrylist :"+s.size());
   map=spListService.getSpList(req.getParameter("category"));
    if(map != null)
    {
        System.out.println("Not null");
    }


   //map.get("splist");

  // System.out.println(map.get("splist"));
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