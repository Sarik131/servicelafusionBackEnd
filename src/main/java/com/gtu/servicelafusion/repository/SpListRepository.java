package com.gtu.servicelafusion.repository;

import com.gtu.servicelafusion.entity.ServiceProvider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SpListRepository extends JpaRepository<ServiceProvider,Long> {
@Query("select sp from ServiceProvider sp where category = :category")
    public List<ServiceProvider> findByCategory(@Param("category") String category);
}
