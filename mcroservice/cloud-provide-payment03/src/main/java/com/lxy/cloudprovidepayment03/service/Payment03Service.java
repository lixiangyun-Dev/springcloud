package com.lxy.cloudprovidepayment03.service;

import com.lxy.cloudapicommons.entity.Payment;



public interface Payment03Service {

    int create(Payment payment);

    Payment queryById(long id);
}
