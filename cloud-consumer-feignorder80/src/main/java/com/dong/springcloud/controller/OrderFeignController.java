package com.dong.springcloud.controller;

import com.dong.springcloud.entity.Payment;
import com.dong.springcloud.entity.PaymentResult;
import com.dong.springcloud.server.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author 董古华
 * @Create 2020/4/19 13:42
 * @see
 */
@RestController
@Slf4j
public class OrderFeignController {
    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping("/consume/payment/select/{id}")
    public PaymentResult<Payment> query(@PathVariable("id") int id){
        return paymentFeignService.query(id);
    }
}
