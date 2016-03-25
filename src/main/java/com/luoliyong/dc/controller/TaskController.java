package com.luoliyong.dc.controller;

import com.luoliyong.dc.constants.Constants;
import com.luoliyong.dc.dao.AirDataDao;

import com.luoliyong.dc.dao.UserDao;
import com.luoliyong.dc.model.AirInfo;
import com.luoliyong.dc.model.User;
import com.luoliyong.dc.util.HttpUtil;
import org.apache.commons.httpclient.HostConfiguration;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.URI;
import org.apache.commons.httpclient.methods.GetMethod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;


/**
 * Created by  on 2016/2/18.
 */
@Controller
public class TaskController {
    private Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private AirDataDao airDataDao;

    @Autowired
    private UserDao userDao;

    @RequestMapping("/test")
    public String tast(Model model) {
//       User user = new User();
//        user.setName("����");
//        user.setId("12333");
//        userDao.insert(user);
//        model.addAttribute("name", userDao.findOne("12333").getName());
//        //userDao.findOne("79");
//        return "test";
       // Date date = new Date();
//        String airinfo = HttpUtil.doGet(Constants.PM25_API_BASE_URL + Constants.QUERY_ALL + Constants.TOKEN);
//
//        String aqi = HttpUtil.doGet(Constants.PM25_API_BASE_URL + Constants.AQI_RANKING + Constants.TOKEN);
//
//        AirInfo airInfo = new AirInfo();
//        airInfo.setDate(date);
//        airInfo.setInfo("{\"err\":\"你好\"}");
//        airInfo.setAqi("{\"err\":\"你好\"}");
//
//        airDataDao.insert(airInfo);
        return "test";
    }

}
