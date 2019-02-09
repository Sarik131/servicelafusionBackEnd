package com.gtu.servicelafusion.service;

import com.gtu.servicelafusion.entity.User;
import com.gtu.servicelafusion.repository.RegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;


//TODO step 4 create service class in service package
@Service
public class RegisterService {

    @Autowired//to get data for bin
    RegisterRepository userRepository;//userRepository contain data

//    @Autowired
//    ServiceProviderRepository serviceProviderRepository;


    public void registerCustomer(String email,String password,String name,String phoneno,String address){
        //String email,String password,String name,String phoneno,String address
        //email,password,name,phoneno,address
        //Write method in the form of query which you want to perform
        User user;
        //= new userRepository;
//
//
//        if(user != null){
//            System.out.println("true");
//        }
//        else{
//            System.out.println("false");
//        }
    }



}
