package com.xusong.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import java.util.concurrent.TimeUnit;
/**
 * Created by XuSong on 2017/12/30.
 */
@Component
public class BaseRedisService {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    //现在设计为只接收json格式的数据,需要在外部手动完成数据转化
    public void setString(String key, String json, Long timeout) {
            stringRedisTemplate.opsForValue().set(key, json);
        if (timeout != null) {
            stringRedisTemplate.expire(key, timeout, TimeUnit.SECONDS);
        }
    }

    public Object getString(String key) {
        return stringRedisTemplate.opsForValue().get(key);
    }

    public void delKey(String key) {
        stringRedisTemplate.delete(key);
    }
}
