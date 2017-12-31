package com.xusong.service;

import com.xusong.MemberClientApp;
import lombok.extern.log4j.Log4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by XuSong on 2017/12/30.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MemberClientApp.class)
@Log4j
public class BaseRedisServiceTest {

    @Autowired
    BaseRedisService baseRedisService;
    @Test
    public void setString() throws Exception {
        baseRedisService.setString("father","xumingcai",null);
    }

    @Test
    public void getString() throws Exception {
    }

    @Test
    public void delKey() throws Exception {
    }

}