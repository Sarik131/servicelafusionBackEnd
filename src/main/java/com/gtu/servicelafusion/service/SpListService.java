package com.gtu.servicelafusion.service;

import com.gtu.servicelafusion.entity.ServiceProvider;
import com.gtu.servicelafusion.entity.User;
import com.gtu.servicelafusion.repository.ServiceProviderRepository;
import com.gtu.servicelafusion.repository.SpListRepository;
import com.gtu.servicelafusion.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//TODO step 4 create service class in service package
@Service
public class SpListService {

    @Autowired
    ServiceProviderRepository serviceProviderRepository;


    public List<ServiceProvider> getSpList(String category)
    {
        return serviceProviderRepository.findByCategory(category);
//        serviceProviderRepository.findAll()
//        return serviceProviderRepository.findByCategory(String category);

    }

}
