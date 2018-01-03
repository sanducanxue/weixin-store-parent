package com.xusong.mqproducter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;

import java.util.Collections;
import java.util.List;

/**
 * Created by XuSong on 2017/12/31.
 */
public class MqProducter {
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    public void sendMess(String aaa, String json) {
        List<String> list = Collections.singletonList("aaa");


        //jmsMessagingTemplate.convertAndSend(destination, json);
    }
}
