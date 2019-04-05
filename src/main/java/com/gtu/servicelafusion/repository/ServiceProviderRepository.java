package com.gtu.servicelafusion.repository;

import com.gtu.servicelafusion.entity.ServiceProvider;
import com.gtu.servicelafusion.entity.User;
import net.bytebuddy.TypeCache;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Repository
public interface ServiceProviderRepository extends JpaRepository<ServiceProvider,Long> {

   ServiceProvider findOneByEmailAndPassword(String email, String password);


    //@Query("SELECT sp.name , sp.experience FROM ServiceProvider sp WHERE category = :cat")
    @Query("SELECT sp FROM ServiceProvider sp WHERE sp.category = :cat")
    public List<ServiceProvider> findByCategory(@Param("cat") String category);

    @Query("SELECT sp.id FROM ServiceProvider sp WHERE sp.email = :em AND sp.password = :pa ")
    public String findSp_idByEmailAndPassword(@Param("em") String email,@Param("pa") String pass);


}
