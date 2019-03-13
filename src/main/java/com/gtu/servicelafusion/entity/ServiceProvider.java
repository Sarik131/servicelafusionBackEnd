package com.gtu.servicelafusion.entity;

import javax.persistence.*;


@Entity
@Table(name = "reg_sp")
public class ServiceProvider {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Basic(optional = false)
    @Column(name = "sp_id")
    Long id;

    @Column(name = "name")//column name
    String name;

    @Column(name = "email")//column name
    String email;

    @Column(name = "phoneno")//column name
    String phoneno;

    @Column(name = "category")//column name
    String category;

    @Column( name = "password")//column name
    String password;

    @Column( name = "experience")//column name
    String experience;

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}