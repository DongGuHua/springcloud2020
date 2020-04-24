package com.dong.springcloud.server;

import com.dong.springcloud.entity.PaymentResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author 董古华
 * @Create 2020/4/19 13:40
 * @see
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {
    @GetMapping(value = "/payment/select/{id}")
    public PaymentResult query(@PathVariable("id") int id);
}
