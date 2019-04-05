package com.gtu.servicelafusion.controllers;

import com.gtu.servicelafusion.repository.QRepository;
import com.gtu.servicelafusion.repository.ServiceProviderRepository;
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
public class QSController {


    @Autowired
    QRepository qRepository;


@PostMapping("/querystatus")
public Map<String,Object> findServiceProviders (HttpServletRequest req)
{
    Map<String,Object> map=new HashMap<String,Object>() ;
    int query_id=Integer.parseInt(req.getParameter("query_id"));
        String title;
    String description;

    System.out.println("Query_id : " +query_id );

        title=qRepository.findTitleById(query_id);
    description=qRepository.findDescriptionById(query_id);


//        map.put("title",title);
   // map.put("description",description);
    map.put("message","Data received!");
    return map;
}

}



