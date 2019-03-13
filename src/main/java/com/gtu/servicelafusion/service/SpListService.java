package com.gtu.servicelafusion.service;

import com.gtu.servicelafusion.entity.ServiceProvider;
import com.gtu.servicelafusion.entity.User;
import com.gtu.servicelafusion.repository.ServiceProviderRepository;
import com.gtu.servicelafusion.repository.SpListRepository;
import com.gtu.servicelafusion.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//TODO step 4 create service class in service package
@Service
public class SpListService {

    @Autowired
    ServiceProviderRepository serviceProviderRepository;


    public Map<String ,Object> getSpList(String category)
    {
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("splist",serviceProviderRepository.findByCategory(category));
        return map;

    }

}
