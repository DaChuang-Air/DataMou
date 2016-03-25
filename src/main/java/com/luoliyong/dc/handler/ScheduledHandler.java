package com.luoliyong.dc.handler;

import com.luoliyong.dc.constants.Constants;
import com.luoliyong.dc.dao.AirDataDao;
import com.luoliyong.dc.model.AirInfo;
import com.luoliyong.dc.util.HttpUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by ���� on 2016/2/24.
 */
@Component
public class ScheduledHandler {

    private Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private AirDataDao airDataDao;

    @Scheduled(cron="0 2 */1 * * ? ")
    public void collectAllData() {
        try {
            Date date = new Date();
            String airinfo = HttpUtil.doGet(Constants.PM25_API_BASE_URL + Constants.QUERY_ALL + Constants.TOKEN);

            String aqi = HttpUtil.doGet(Constants.PM25_API_BASE_URL + Constants.AQI_RANKING + Constants.TOKEN);

            AirInfo airInfo = new AirInfo();
            airInfo.setDate(date);
            airInfo.setInfo(airinfo);
            airInfo.setAqi(aqi);

            airDataDao.insert(airInfo);

            logger.info("Insert success");
        } catch (Exception e) {
            logger.error("", e);
        }
    }
}
