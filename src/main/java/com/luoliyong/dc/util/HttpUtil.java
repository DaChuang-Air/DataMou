package com.luoliyong.dc.util;

import com.alibaba.druid.util.StringUtils;
import com.luoliyong.dc.constants.Constants;
import org.apache.commons.httpclient.HostConfiguration;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.URI;
import org.apache.commons.httpclient.methods.GetMethod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

/**
 * Created by ���� on 2016/2/25.
 */
public class HttpUtil {
    private static Logger logger = LoggerFactory.getLogger(HttpUtil.class);

    //����������
    private static int count = 0;

    public static String doGet(String http_url) {
        HttpMethod method = null;

        try {
            URI uri = new URI(http_url, true);
            HttpClient client = new HttpClient();
            HostConfiguration hcfg = new HostConfiguration();
            hcfg.setHost(uri);
            client.setHostConfiguration(hcfg);

            // ������֤
            client.getParams().setAuthenticationPreemptive(true);
            // GET����ʽ
            method = new GetMethod(http_url);
            client.executeMethod(method);

            logger.info( new Date() +" state:" + method.getStatusLine());

            if(method.getStatusCode() != 200) {
                logger.error(new Date() + " Error state:" + method.getStatusLine());
                count++ ;

                if (count > 3) {
                    logger.error(new Date() + "��������ʧ��");
                    count = 0;
                    return "";
                }

                Thread.sleep(420000);
                doGet(http_url);
            }

            return method.getResponseBodyAsString();
        } catch (Exception e) {
            logger.error("ϵͳ�쳣����������ʧ��" + e);
        }

        return "";
    }

    public static void main(String[] args) {
        doGet("http://www.pm25.in/api/querys/pm2_5.json?city=zhuhai&token=" + Constants.TOKEN);
        doGet("http://www.pm25.in/api/querys/pm2_5.json?city=zhuhai&token=" + Constants.TOKEN);
    }

}
