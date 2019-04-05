//package com.gtu.servicelafusion.entity;
//
//import javax.persistence.*;
//
//
//@Entity
//@Table(name = "query")
//public class Query {
//
//    @Id
//    //@GeneratedValue(strategy=GenerationType.AUTO)
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "query_id")
//    Long id;
//
//    @Column(name = "c_id")//column name
//    int c_id;
//
//
//    @Column(name = "description")//column name
//    String description;
//
//    @Column(name = "status",columnDefinition="tinyint(1) default 0")//column name
//            int status;
//
//    @Column(name = "category")//column name
//            String category;
//
//    @Column( name = "c_address")//column name
//            String c_address;
//
//    @Column( name = "title")//column name
//            String title;
//
//    public Query(String description, String category, String c_address) {
//
//        this.c_id=0;
//       this.status=0;
//       this.title="";
//        this.description = description;
//        this.c_address = c_address;
//        this.category = category;
//    }
//
//    public Query(Long id, int c_id, String description, int status, String category, String c_address, String title) {
//        this.id = id;
//        this.c_id = c_id;
//        this.description = description;
//        this.status = status;
//        this.category = category;
//        this.c_address = c_address;
//        this.title = title;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public int getC_id() {
//        return c_id;
//    }
//
//    public void setC_id(int c_id) {
//        this.c_id = c_id;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public int getStatus() {
//        return status;
//    }
//
//    public void setStatus(int status) {
//        this.status = status;
//    }
//
//    public String getCategory() {
//        return category;
//    }
//
//    public void setCategory(String category) {
//        this.category = category;
//    }
//
//    public String getC_address() {
//        return c_address;
//    }
//
//    public void setC_address(String c_address) {
//        this.c_address = c_address;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//}