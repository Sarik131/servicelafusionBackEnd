package com.gtu.servicelafusion.entity;

import javax.persistence.*;


@Entity
@Table(name = "query")
public class Bidding {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "b_id")
    Long id;

    @Column(name = "sp_id")//column name
    int sp_id;

    @Column(name = "c_id")//column name
    int c_id;

    @Column(name = "amount")//column name
    int amount;

    @Column( name = "message")//column name
    String message;

    public Bidding(Long id, int sp_id, int c_id, int amount, String message) {
        this.id = id;
        this.sp_id = sp_id;
        this.c_id = c_id;
        this.amount = amount;
        this.message = message;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getSp_id() {
        return sp_id;
    }

    public void setSp_id(int sp_id) {
        this.sp_id = sp_id;
    }

    public int getC_id() {
        return c_id;
    }

    public void setC_id(int c_id) {
        this.c_id = c_id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}