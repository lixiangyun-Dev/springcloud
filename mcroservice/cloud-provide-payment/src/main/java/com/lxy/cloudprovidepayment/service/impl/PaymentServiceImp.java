package com.lxy.cloudprovidepayment.service.impl;

import com.lxy.cloudapicommons.entity.Payment;
import com.lxy.cloudprovidepayment.mapper.PaymentMapper;
import com.lxy.cloudprovidepayment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class PaymentServiceImp implements PaymentService {

    @Resource
    private PaymentMapper paymentMapper;


    @Override
    public int create(Payment payment) {
        return paymentMapper.create(payment);
    }

    @Override
    public Payment queryById(long id) {
        return paymentMapper.queryById(id);
    }
}
