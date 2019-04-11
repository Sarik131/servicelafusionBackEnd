package com.gtu.servicelafusion.service;



import com.gtu.servicelafusion.entity.Q;
//import com.gtu.servicelafusion.entity.Query;
import com.gtu.servicelafusion.entity.ServiceProvider;
import com.gtu.servicelafusion.repository.CreateQueryRepository;
import com.gtu.servicelafusion.repository.ServiceProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//TODO step 4 create service class in service package
@Service
public class CreateQueryService {

    @Autowired
    CreateQueryRepository createQueryRepository;

    public void saveAll(String description,String category,String c_address)
    {
        Q query =new Q(description,category,c_address);
         createQueryRepository.save(query);
    }
    public String getQuery_id()
    {
        Q q=createQueryRepository.getQuery_id();
        return ""+q.getId();
    }

}
