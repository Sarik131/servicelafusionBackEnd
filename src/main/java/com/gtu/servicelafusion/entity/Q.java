package com.gtu.servicelafusion.entity;

import javax.persistence.*;


@Entity
@Table(name = "query")
public class Q {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "query_id")
    Long id;

    @Column(name = "c_id")//column name
            int c_id;

    @Column(name = "status")//column name
    boolean status;

    @Column(name = "description")//column name
            String description;

    @Column(name = "category")//column name
            String category;

    @Column( name = "c_address")//column name
            String c_address;

    @Column( name = "title")//column name
            String title;


    public Q(String description, String category, String c_address) {
        this.description = description;
        this.category = category;
        this.c_address = c_address;
    }

    public Q(Long id, int c_id, boolean status, String description, String category, String c_address, String title) {
        this.id = id;
        this.c_id = c_id;
        this.status = status;
        this.description = description;
        this.category = category;
        this.c_address = c_address;
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getC_id() {
        return c_id;
    }

    public void setC_id(int c_id) {
        this.c_id = c_id;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getC_address() {
        return c_address;
    }

    public void setC_address(String c_address) {
        this.c_address = c_address;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}