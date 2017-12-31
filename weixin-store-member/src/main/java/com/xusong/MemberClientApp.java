package com.xusong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by XuSong on 2017/12/28.
 */
@SpringBootApplication
@EnableEurekaClient
public class MemberClientApp {
    public static void main(String[] args) {
        SpringApplication.run(MemberClientApp.class, args);
    }
}
