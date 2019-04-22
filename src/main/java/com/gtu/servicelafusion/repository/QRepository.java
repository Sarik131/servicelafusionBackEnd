package com.gtu.servicelafusion.repository;

import com.gtu.servicelafusion.entity.Q;
import com.gtu.servicelafusion.entity.ServiceProvider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QRepository extends JpaRepository<Q,Long> {


 @Query("SELECT q.description FROM Q q WHERE q.id = :cat")
    public String findDescriptionById(@Param("cat") Long q_id);
//
 @Query("SELECT q.title FROM Q q WHERE q.id = :id")
 public String findTitleById(@Param("id") Long q_id);

 @Query("SELECT q.image FROM Q q WHERE q.id = :id")
 public String findImage_urlById(@Param("id") Long q_id);

}
