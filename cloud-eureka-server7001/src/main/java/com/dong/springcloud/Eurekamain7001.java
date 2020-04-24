package com.dong.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author 董古华
 * @Create 2020/4/6 14:09
 * @see
 */
@SpringBootApplication
@EnableEurekaServer
public class Eurekamain7001 {
    public static void main(String[] args) {
        SpringApplication.run(Eurekamain7001.class,args);
    }
}
