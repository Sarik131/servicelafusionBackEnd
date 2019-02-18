package com.gtu.servicelafusion.repository;

import com.gtu.servicelafusion.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.servlet.http.HttpServletRequest;

//TODO step 5 - create this class in repository package

@Repository//annotation for repository
public interface RegisterRepository extends JpaRepository<User,Long> {//extends with JpaRepository<Entity class name,primary key datatype>
    //User save(String email, String password, String name, String phoneno, String address);
   // User save(HttpServletRequest req);
}
