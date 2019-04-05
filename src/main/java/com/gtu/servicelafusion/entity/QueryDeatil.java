package com.gtu.servicelafusion.entity;

import javax.persistence.*;
import java.sql.Date;


@Entity
@Table(name = "query_location")
public class QueryDeatil {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qd_id")
    Long id;

    @Column(name = "lat")//column name
            int sp_id;

    @Column(name = "title")//column name
            String title;

    @Column(name = "description")//column name
            String description;

    @Column(name = "category")//column name
            String category;

    @Column(name = "create_date")//column name
            Date create_date;

    public QueryDeatil(Long id, int q_id, int sp_id, String title, String description, String category, Date create_date) {
        this.id = id;

        this.sp_id = sp_id;
        this.title = title;
        this.description = description;
        this.category = category;
        this.create_date = create_date;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }
}