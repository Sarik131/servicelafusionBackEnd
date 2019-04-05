package com.gtu.servicelafusion.repository;



import com.gtu.servicelafusion.entity.Q;
import com.gtu.servicelafusion.entity.ServiceProvider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


@Repository
public interface GetQueryRepository extends JpaRepository<Q,Long> {

    @Query("SELECT q FROM Q q WHERE q.category = :cat AND q.status = 0")
   public List<Q> findByQCategory(@Param("cat") String category);

}
