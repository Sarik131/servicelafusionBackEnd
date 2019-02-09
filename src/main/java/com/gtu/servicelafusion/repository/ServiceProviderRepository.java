package com.gtu.servicelafusion.repository;

import com.gtu.servicelafusion.entity.ServiceProvider;
import com.gtu.servicelafusion.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceProviderRepository extends JpaRepository<ServiceProvider,Long> {

    ServiceProvider findOneByEmailAndPassword(String email, String password);

}
