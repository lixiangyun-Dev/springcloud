package com.lxy.cloudprovidepayment03.service.impl;

import com.lxy.cloudapicommons.entity.Payment;
import com.lxy.cloudprovidepayment03.mapper.Payment03Mapper;
import com.lxy.cloudprovidepayment03.service.Payment03Service;
import com.lxy.cloudprovidepayment03.service.Payment03Service;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class Payment03ServiceImp implements Payment03Service {

    @Resource
    private Payment03Mapper payment03Mapper;


    @Override
    public int create(Payment payment) {
        return payment03Mapper.create(payment);
    }

    @Override
    public Payment queryById(long id) {
        return payment03Mapper.queryById(id);
    }
}
