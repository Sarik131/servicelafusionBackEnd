package com.gtu.servicelafusion.repository;


import com.gtu.servicelafusion.entity.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface CreateQueryRepository extends JpaRepository<Query,Long> {


}
