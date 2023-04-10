package com.lxy.cloudprovidepayment.mapper;


import com.lxy.cloudapicommons.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
public interface PaymentMapper {

    int create(Payment payment);

    Payment queryById(long id);
}
