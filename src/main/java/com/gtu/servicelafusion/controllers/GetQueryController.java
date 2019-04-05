package com.gtu.servicelafusion.controllers;

import com.gtu.servicelafusion.repository.ServiceProviderRepository;
import com.gtu.servicelafusion.service.GetQueryService;
import com.gtu.servicelafusion.service.SpListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class GetQueryController {

//    TODO step - 6  for calling service

    @Autowired
    GetQueryService getQueryService;

@PostMapping("/getquery")
public Map<String,Object> findByCategory (HttpServletRequest req)
{
    String category=req.getParameter("category");
    Map<String,Object> map=new HashMap<>();
    System.out.println("IN getQuery :"+category);
 // map.put("query",getQueryService.findByCategory(category));
    map=getQueryService.findByCategory(category);
    if(map != null)
    {
        System.out.println("Not null");
    }

    return map;
}

}
