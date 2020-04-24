package com.dong.springcloud.service.imp;

import com.dong.springcloud.Dao.PaymentDao;
import com.dong.springcloud.entity.Payment;
import com.dong.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author dongguhua
 * @Create 2020/4/5 15:19
 * @see
 */
@Service
@Slf4j
public class PaymentServiceImp implements PaymentService {
    @Resource
    public PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment query(int id) {
        return paymentDao.query(id);
    }
}
