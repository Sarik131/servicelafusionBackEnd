package com.gtu.servicelafusion.repository;


import com.gtu.servicelafusion.entity.Q;
//import com.gtu.servicelafusion.entity.Query;
import com.gtu.servicelafusion.entity.ServiceProvider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CreateQueryRepository extends JpaRepository<Q,Long> {

    @Query(" select q from Q q ORDER BY q.id DESC")
    public Q getQuery_id();


}
