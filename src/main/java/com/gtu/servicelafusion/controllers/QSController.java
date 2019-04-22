package com.gtu.servicelafusion.controllers;

import com.gtu.servicelafusion.repository.QRepository;

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
    public Map<String, Object> findServiceProviders(HttpServletRequest req) {
        Map<String, Object> map = new HashMap<String, Object>();
        Long query_id = Long.parseLong(req.getParameter("query_id"));
        String title;
        String description;
        String image_url;
        System.out.println("Query_id : " + query_id);

        title = qRepository.findTitleById(query_id);
        description = qRepository.findDescriptionById(query_id);
        image_url= qRepository.findImage_urlById(query_id);

        map.put("title", title);
        map.put("description", description);
        map.put("image_url", image_url);
        System.out.println("image_url"+image_url);
        map.put("message", "Data received!");
        return map;
    }

}



