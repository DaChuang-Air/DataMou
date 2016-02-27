package com.luoliyong.dc.model;


import java.util.Date;

/**
 * Created by Á¢ÓÂ on 2016/2/24.
 */
public class AirInfo {
    private int id;
    private Date date;
    private String info;
    private String aqi;

    public String getAqi() {
        return aqi;
    }

    public void setAqi(String aqi) {
        this.aqi = aqi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
