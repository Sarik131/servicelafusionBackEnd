package com.gtu.servicelafusion.repository;

import com.gtu.servicelafusion.entity.ServiceProvider;
import com.gtu.servicelafusion.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

//TODO step 5 - create this class in repository package
@Repository//annotation for repository
public interface UserRepository extends JpaRepository<User,Long> {//extends with JpaRepository<Entity class name,primary key datatype>

    User findOneByEmailAndPassword(String email, String password);//create method

    @Query("SELECT u.address FROM User u WHERE u.email = :em AND u.password = :pa ")
    public String findAddressByEmailAndPassword(@Param("em") String email,@Param("pa") String pass);



}
