package com.lxy.cloudconsumerorder.controller;


import com.lxy.cloudapicommons.common.CommonResult;
import com.lxy.cloudapicommons.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Slf4j
@RestController
@RequestMapping
public class OrderController {
    //调用支付订单服务端的ip+端口号
//    public static final  String PAYMENT_URL = "http://localhost:8001";

//    集群版服务配置,通过服务名（mcroservice-payment）调用
    public static final  String PAYMENT_URL = "http://MCROSERVICE-PAYMENT";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/hello")
    public String hello(){
        log.info("hello-order");
        return "hhhh";
    }

    //创建支付订单的接口
    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment){
        return restTemplate.postForObject(PAYMENT_URL+"/payment/create",payment, CommonResult.class);
    }
    //获取id获取支付订单
    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id){
        return restTemplate.getForObject(PAYMENT_URL+"/payment/get/"+id,CommonResult.class);
    }

}
