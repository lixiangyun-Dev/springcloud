package com.lxy.cloudprovidepayment02.service;

import com.lxy.cloudapicommons.entity.Payment;



public interface Payment02Service {

    int create(Payment payment);

    Payment queryById(long id);
}
