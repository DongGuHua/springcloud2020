package com.dong.springcloud.controller;

import com.dong.rule.Myrule;
import com.dong.springcloud.entity.Payment;
import com.dong.springcloud.entity.PaymentResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Author 董古华
 * @Create 2020/4/5 20:21
 * @see  最原始的服务调用方式 使用resttemplate
 */
@RestController
@Slf4j
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration = Myrule.class)
public class OrderController {

    public static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";
    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consume/payment/create")
    public PaymentResult<Payment> create(Payment payment){
        return restTemplate.postForObject(PAYMENT_URL+"/payment/create",payment,PaymentResult.class);
    }

    @GetMapping("/consume/payment/select/{id}")
    public PaymentResult<Payment> query(@PathVariable("id") int id){
        return restTemplate.getForObject(PAYMENT_URL+"/payment/select/"+id,PaymentResult.class);
    }
}
