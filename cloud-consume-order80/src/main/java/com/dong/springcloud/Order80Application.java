package com.dong.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author dongguhua
 * @Create 2020/4/5 13:58
 * @see
 */
@SpringBootApplication
@EnableEurekaClient
public class Order80Application {
    public static void main(String[] args) {
        SpringApplication.run(Order80Application.class,args);
    }
}
