package com.gtu.servicelafusion.service;

import com.gtu.servicelafusion.entity.ServiceProvider;
import com.gtu.servicelafusion.entity.User;
import com.gtu.servicelafusion.repository.ServiceProviderRepository;
import com.gtu.servicelafusion.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//TODO step 4 create service class in service package
@Service
public class UserService {

    @Autowired//to get data for bin
    UserRepository userRepository;//userRepository contain data

    @Autowired
    ServiceProviderRepository serviceProviderRepository;


    public void checkUserLogin(String email,String password){
        User user = userRepository.findOneByEmailAndPassword(email,password);//Write method in the form of query which you want to perform

        if(user != null){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }

    public List<ServiceProvider> findAllServiceProviders()
    {
        return serviceProviderRepository.findAll();
    }

}
