package com.gtu.servicelafusion.service;


import com.gtu.servicelafusion.repository.GetQueryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

//TODO step 4 create service class in service package
@Service
public class GetQueryService {

  @Autowired
  GetQueryRepository getQueryRepository;

    public Map<String,Object> findByCategory(String category)
    {
        Map<String,Object> map= new HashMap<>();
        map.put("query",getQueryRepository.findByQCategory(category));
        return map;
    }

}
