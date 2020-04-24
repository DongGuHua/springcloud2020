package com.dong.springcloud.service;

import com.dong.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

/**
 * @Author 董古华
 * @Create 2020/4/5 15:18
 * @see
 */
@Service
public interface PaymentService {
    public int create(Payment payment);
    public Payment query(@Param("id") int id);
}
