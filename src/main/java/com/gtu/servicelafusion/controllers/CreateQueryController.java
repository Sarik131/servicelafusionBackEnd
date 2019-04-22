package com.gtu.servicelafusion.controllers;

//import com.gtu.servicelafusion.entity.Query;
import com.gtu.servicelafusion.repository.CreateQueryRepository;
import com.gtu.servicelafusion.service.CreateQueryService;
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
public class CreateQueryController {

    //    TODO step - 6  for calling service
    @Autowired
    CreateQueryService createQueryService;

    @PostMapping("/createquery")
    public Map<String, Object> saveQuery(HttpServletRequest req) {
        Map<String, Object> map = new HashMap<String, Object>();
        System.out.println("In createquery");

//        Query q = new Query();
//        int cid = Integer.parseInt(req.get("c_id").toString());
//        Long amount = Long.parseLong(req.get("amount").toString());

       System.out.println("Description : "+req.getParameter("description").toString());
       System.out.println("category : "+req.getParameter("catTitle").toString());
       System.out.println("c_address : "+req.getParameter("c_address").toString());
       System.out.println("image_url : "+req.getParameter("image_url").toString());

        String description = req.getParameter("description").toString();
        String category =req.getParameter("catTitle").toString();
        String c_address=req.getParameter("c_address").toString();
        String image_url=req.getParameter("image_url").toString();

//       // Query q = new Query(cid,amount,description,category,c_address);
//        q.setC_id(cid);
//        q.setAmount(amount);
//        q.setDescription(description);
//        q.setCategory(category);
//        q.setC_address(c_address);
//        createQueryRepository.save(q);

        createQueryService.saveAll(description,category,c_address,image_url);

//        map.put("query_id", createQueryService.getQuery_id());
        map.put("message", "In Create Query ~ Data received");
        return map;
    }
}