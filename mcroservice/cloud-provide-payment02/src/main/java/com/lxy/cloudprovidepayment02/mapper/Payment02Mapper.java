package com.lxy.cloudprovidepayment02.mapper;


import com.lxy.cloudapicommons.entity.Payment;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface Payment02Mapper {

    int create(Payment payment);

    Payment queryById(long id);
}
