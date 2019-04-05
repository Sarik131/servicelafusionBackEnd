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


    public String checkUserLogin(String email,String password){
        User user = userRepository.findOneByEmailAndPassword(email,password);//Write method in the form of query which you want to perform

        if(user != null){
            //System.out.println("true");
            return "true";

        }
        else{
            //System.out.println("false");
            return "false";
        }

    }
    public String findAddressByEmailAndPassword(String email,String password)
    {
        String c_address    =   userRepository.findAddressByEmailAndPassword(email,password);
        return c_address;
    }

    public String findSp_idByEmailAndPassword(String email,String password)
    {
        String sp_id=" ";

        sp_id= serviceProviderRepository.findSp_idByEmailAndPassword(email,password);

        return sp_id;
    }
    public String checkSpLogin(String email,String password) {
        ServiceProvider sp = serviceProviderRepository.findOneByEmailAndPassword(email, password);
        if (sp != null) {
            //System.out.println("true");
            return "true";
        }

        else{
            //System.out.println("false");
            return "false";
        }
    }
    public List<ServiceProvider> findAllServiceProviders()
    {
        return serviceProviderRepository.findAll();
    }

}
