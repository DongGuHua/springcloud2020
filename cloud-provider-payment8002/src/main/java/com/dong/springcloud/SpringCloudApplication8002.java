package com.dong.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author 董古华
 * @Create 2020/4/5 13:58
 * @see
 */
@SpringBootApplication
@EnableEurekaClient
public class SpringCloudApplication8002 {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudApplication8002.class,args);
    }
}
