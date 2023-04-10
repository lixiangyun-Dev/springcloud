package com.lxy.cloudprovidepayment02.service.impl;

import com.lxy.cloudapicommons.entity.Payment;
import com.lxy.cloudprovidepayment02.mapper.Payment02Mapper;
import com.lxy.cloudprovidepayment02.service.Payment02Service;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class Payment02ServiceImp implements Payment02Service {

    @Resource
    private Payment02Mapper payment02Mapper;


    @Override
    public int create(Payment payment) {
        return payment02Mapper.create(payment);
    }

    @Override
    public Payment queryById(long id) {
        return payment02Mapper.queryById(id);
    }
}
