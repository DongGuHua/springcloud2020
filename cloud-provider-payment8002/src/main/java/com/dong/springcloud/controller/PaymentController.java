package com.dong.springcloud.controller;

import com.dong.springcloud.entity.Payment;
import com.dong.springcloud.entity.PaymentResult;
import com.dong.springcloud.service.imp.PaymentServiceImp;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Author 董古华
 * @Create 2020/4/5 15:21
 * @see
 */
@RestController
@Slf4j
public class PaymentController {
    @Resource
    public PaymentServiceImp paymentServiceImp;

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/payment/select/{id}")
    public PaymentResult query(@PathVariable("id") int id){
        Payment payment = paymentServiceImp.query(id);
        if(!payment.equals("") && payment!=null){
            return new PaymentResult(200,"查询成功,当前端口为："+serverPort,payment);
        }
        return new PaymentResult(100,"查询失败没有对应id："+id);
    }

    @PostMapping(value = "/payment/create")
    public PaymentResult create(@RequestBody Payment payment){
        int i = paymentServiceImp.create(payment);
        if(i>0){
            return new PaymentResult(200,"新增成功");
        }
        return new PaymentResult(100,"新增失败");
    }
}
