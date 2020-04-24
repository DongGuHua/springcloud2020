package com.dong.springcloud.Dao;

import com.dong.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author 董古华
 * @Create 2020/4/5 14:45
 * @see
 */
@Mapper
public interface PaymentDao {
    public int create(Payment payment);
    public Payment query(@Param("id") int id);
}
