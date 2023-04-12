package com.lxy.cloudconsumerfeignorder.controller;


import com.lxy.cloudapicommons.common.CommonResult;
import com.lxy.cloudapicommons.entity.Payment;
import com.lxy.cloudconsumerfeignorder.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class OrderFeignController {
    @Resource
    private PaymentService paymentService;
    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        CommonResult result = paymentService.queryById(id);
        log.info("result开始调用："+result);
        return result;
    }


    @GetMapping("/consumer/feign/timeout")
    public String PaymentFeignTimeOut() throws InterruptedException {
        log.info("PaymentFeignTimeOut开始调用...");
        return paymentService.PaymentFeignTimeOut();
    }

}
