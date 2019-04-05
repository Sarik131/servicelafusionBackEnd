package com.gtu.servicelafusion.entity;

import javax.persistence.*;


@Entity
@Table(name = "quotation")
public class Quotation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "quot_id")
    Long id;

    @Column(name = "q_id")//column name
    int q_id;

    @Column(name = "sp_id")//column name
    int sp_id;

    @Column( name = "reply")//column name
    String reply;

    @Column(name = "amount")//column name
    int amount;

    public Quotation(Long id, int q_id, int sp_id, String reply, int amount) {
        this.id = id;
        this.q_id = q_id;
        this.sp_id = sp_id;
        this.reply = reply;
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public int getQ_id() {
        return q_id;
    }

    public int getSp_id() {
        return sp_id;
    }

    public String getReply() {
        return reply;
    }

    public int getAmount() {
        return amount;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setQ_id(int q_id) {
        this.q_id = q_id;
    }

    public void setSp_id(int sp_id) {
        this.sp_id = sp_id;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}