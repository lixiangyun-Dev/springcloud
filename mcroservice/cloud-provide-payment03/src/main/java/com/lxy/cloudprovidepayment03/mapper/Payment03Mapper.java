package com.lxy.cloudprovidepayment03.mapper;


import com.lxy.cloudapicommons.entity.Payment;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface Payment03Mapper {

    int create(Payment payment);

    Payment queryById(long id);
}
