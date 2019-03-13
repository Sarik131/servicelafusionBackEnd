package com.gtu.servicelafusion.service;

import com.gtu.servicelafusion.entity.User;
import com.gtu.servicelafusion.repository.CustRegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


//TODO step 4 create service class in service package
@Service
public class CustRegisterService {

    @Autowired//to get data for bin
            CustRegisterRepository custRegisterRepository;//userRepository contain data


    public void registerCustomer(String email,String password,String name,String phoneno,String address){
        //String email,String password,String name,String phoneno,String address
        //email,password,name,phoneno,address
        //Write method in the form of query which you want to perform

        User user=new User(email,password,name,phoneno,address);
       custRegisterRepository.save(user);
    }



}
