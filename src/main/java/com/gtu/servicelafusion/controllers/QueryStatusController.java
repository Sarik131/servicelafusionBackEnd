//package com.gtu.servicelafusion.controllers;
//
//
//import com.gtu.servicelafusion.repository.QueryStatusRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.servlet.http.HttpServletRequest;
//import java.util.HashMap;
//import java.util.Map;
//
//@RestController
//@RequestMapping("/user")
//public class QueryStatusController {
//
//
//    @Autowired
//    QueryStatusRepository queryStatusRepository;
//
//    @PostMapping("/querystatus")
//        public Map<String,Object> login(HttpServletRequest req) {
//        Map<String,Object> map=new HashMap<String,Object>() ;
//        int query_id=Integer.parseInt(req.getParameter("query_id"));
//        String title;
//        String description;
//
//        System.out.println("Query_id : " +query_id );
//
////        title=queryStatusRepository.findTitleById(query_id);
////        description=queryStatusRepository.findDescriptionById(query_id);
//
//
////        map.put("title",title);
////        map.put("description",description);
//        map.put("message","Data received!");
//        return map;
//    }
//
//}
