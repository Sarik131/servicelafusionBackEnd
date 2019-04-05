package com.gtu.servicelafusion.entity;

import javax.persistence.*;


@Entity
@Table(name = "query_location")
public class QueryLocation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "loc_id")
    Long id;

    @Column(name = "q_id")//column name
    int q_id;

    @Column(name = "lat")//column name
    int lat;

    @Column(name = "long")//column name
    int lon;

    @Column( name = "title")//column name
    String title;

    public QueryLocation(Long id, int q_id, int lat, int lon, String title) {
        this.id = id;
        this.q_id = q_id;
        this.lat = lat;
        this.lon = lon;
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public int getQ_id() {
        return q_id;
    }

    public int getLat() {
        return lat;
    }

    public int getLon() {
        return lon;
    }

    public String getTitle() {
        return title;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setQ_id(int q_id) {
        this.q_id = q_id;
    }

    public void setLat(int lat) {
        this.lat = lat;
    }

    public void setLon(int lon) {
        this.lon = lon;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}