package com.gtu.servicelafusion.repository;

import com.gtu.servicelafusion.entity.ServiceProvider;
import com.gtu.servicelafusion.entity.User;
import net.bytebuddy.TypeCache;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface ServiceProviderRepository extends JpaRepository<ServiceProvider,Long> {

@Query("SELECT sp.name , sp.experience FROM ServiceProvider sp WHERE category = :category")
    public List<ServiceProvider> findByCategory(@Param("category") String category);

}
