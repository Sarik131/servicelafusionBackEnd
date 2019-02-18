package com.gtu.servicelafusion.controllers;

import com.gtu.servicelafusion.entity.Query;
import com.gtu.servicelafusion.repository.CreateQueryRepository;
import com.gtu.servicelafusion.service.SpListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class CreateQueryController {

    //    TODO step - 6  for calling service
    @Autowired
    CreateQueryRepository createQueryRepository;

    @PostMapping("/splist")
    public Map<String, Object> saveQuery(@RequestBody Map<String, Object> req) {
        Map<String, Object> map = new HashMap<String, Object>();
        System.out.println("In createquery");


        Query q = new Query();
        int cid = Integer.parseInt(req.get("c_id").toString());
        Long amount = Long.parseLong(req.get("amount").toString());
        String description = req.get("description").toString();
        String category =req.get("category").toString();
        String c_address=req.get("c_address").toString();
       // Query q = new Query(cid,amount,description,category,c_address);
        q.setC_id(cid);
        q.setAmount(amount);
        q.setDescription(description);
        q.setCategory(category);
        q.setC_address(c_address);

        createQueryRepository.save(q);

        map.put("message", "Data received");
        return map;
    }
}