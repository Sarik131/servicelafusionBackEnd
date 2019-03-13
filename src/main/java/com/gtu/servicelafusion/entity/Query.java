package com.gtu.servicelafusion.entity;

import javax.persistence.*;


@Entity
@Table(name = "query")
public class Query {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "query_id")
    //@NotNull
    //@Column(name = "sp_id")
    Long id;

    @Column(name = "c_id")//column name
    int c_id;

    @Column(name = "amount")//column name
    Long amount;

    @Column(name = "description")//column name
    String description;

    @Column(name = "category")//column name
    String category;

    @Column( name = "c_address")//column name
    String c_address;

public Query()
{}
    public Query( int c_id, long amount, String description, String category, String c_address) {
        //this.id = id;
        this.c_id = c_id;
        this.amount = amount;
        this.description = description;
        this.category = category;
        this.c_address = c_address;
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

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
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
}