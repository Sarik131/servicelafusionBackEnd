package com.gtu.servicelafusion.entity;

import javax.persistence.*;

//TODO- step 3  make entity class

@Entity
@Table( name = "reg_customer")//Table name

public class User {

    @Id//For primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "c_id")//If of primary key is not Id then do this <-
    Long id;

    @Column( name = "email")//column name
    String email;

    @Column( name = "password")//column name
    String password;

    @Column(name = "name")
    String name;

    @Column(name = "phoneno")
    String phoneno;

    public  User()
    {}
    public User(String email, String password, String name, String phoneno, String address) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.phoneno = phoneno;
        this.address = address;
    }

    @Column(name = "address")
    String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //with  Alt+insert insert getter and setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
