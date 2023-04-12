package com.lxy.cloudprovidepayment03.controller;

import com.lxy.cloudapicommons.common.CommonResult;
import com.lxy.cloudapicommons.entity.Payment;
import com.lxy.cloudprovidepayment03.service.Payment03Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


@Slf4j
@RestController
@RequestMapping("payment")
public class PaymentControler {
    @Resource
    private Payment03Service payment03Service;

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/hello")
    public String Hello(){
        log.info("hello-provide");
        return "ni hao";
    }

    @PostMapping("/create")
    public CommonResult create(@RequestBody Payment dept){
        int i = payment03Service.create(dept);
        log.info("***************插入成功*******"+i);
        if(i>0){
            return new CommonResult(200,"插入数据库成功"+serverPort,i);
        }else{
            return new CommonResult(444,"插入数据库失败",null);
        }
    }


    @GetMapping("/get/{id}")
    public CommonResult queryById(@PathVariable("id") Long id){
        Payment payment = payment03Service.queryById(id);
        log.info("***************查询成功*********"+payment);
        if(payment!=null){
            return new CommonResult(200,"查询成功"+serverPort,payment);
        }else{
            return new CommonResult(444,"查询失败",null);
        }
    }


}
