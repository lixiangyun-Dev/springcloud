package com.lxy.cloudprovidepayment.service;

import com.lxy.cloudapicommons.entity.Payment;



public interface PaymentService {

    int create(Payment payment);

    Payment queryById(long id);
}
