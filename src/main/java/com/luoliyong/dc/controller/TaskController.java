package com.luoliyong.dc.controller;

import com.luoliyong.dc.dao.AirDataDao;

import com.luoliyong.dc.model.AirInfo;
import org.apache.commons.httpclient.HostConfiguration;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.URI;
import org.apache.commons.httpclient.methods.GetMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by  on 2016/2/18.
 */
@Controller
public class TaskController {

    @Autowired
    private AirDataDao airDataDao;

    @RequestMapping("/test")
    public String tast(){

        return null;
    }

}
