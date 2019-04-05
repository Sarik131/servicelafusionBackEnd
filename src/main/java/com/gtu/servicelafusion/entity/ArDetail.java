package com.gtu.servicelafusion.entity;

import javax.persistence.*;


@Entity
@Table(name = "ar_detail")
public class ArDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ar_id")
    Long id;

    @Column(name = "sp_id")//column name
    int sp_id;

    @Column( name = "sp_loc")//column name
    String sp_loc;

    @Column( name = "work_loc")//column name
    String work_loc;

    @Column( name = "s_description")//column name
    String s_description;

    @Column( name = "l_description")//column name
    String l_description;

    @Column( name = "image_name")//column name
    String image_name;

    public ArDetail(Long id, int sp_id, String sp_loc, String work_loc, String s_description, String l_description, String image_name) {
        this.id = id;
        this.sp_id = sp_id;
        this.sp_loc = sp_loc;
        this.work_loc = work_loc;
        this.s_description = s_description;
        this.l_description = l_description;
        this.image_name = image_name;
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

    public String getSp_loc() {
        return sp_loc;
    }

    public void setSp_loc(String sp_loc) {
        this.sp_loc = sp_loc;
    }

    public String getWork_loc() {
        return work_loc;
    }

    public void setWork_loc(String work_loc) {
        this.work_loc = work_loc;
    }

    public String getS_description() {
        return s_description;
    }

    public void setS_description(String s_description) {
        this.s_description = s_description;
    }

    public String getL_description() {
        return l_description;
    }

    public void setL_description(String l_description) {
        this.l_description = l_description;
    }

    public String getImage_name() {
        return image_name;
    }

    public void setImage_name(String image_name) {
        this.image_name = image_name;
    }
}