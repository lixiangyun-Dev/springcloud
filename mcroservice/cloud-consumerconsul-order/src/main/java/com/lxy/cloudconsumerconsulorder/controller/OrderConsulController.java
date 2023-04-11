package com.lxy.cloudconsumerconsulorder.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@Slf4j
public class OrderConsulController {
    public static final  String PAYMENT_URL = "http://cloud-provider-payment";
    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/consul")
    public String getPayment(){
        log.info("restTemplate开始调用：/consumer/payment/consul");
        return restTemplate.getForObject(PAYMENT_URL+"/payment/consul/",String.class);
    }
}
