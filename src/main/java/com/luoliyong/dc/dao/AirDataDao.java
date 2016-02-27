package com.luoliyong.dc.dao;

import com.luoliyong.dc.model.AirInfo;

/**
 * Created by Á¢ÓÂ on 2016/2/24.
 */
public interface AirDataDao{
    void insert(AirInfo airInfo);
    AirInfo findbyid(int id);
}
