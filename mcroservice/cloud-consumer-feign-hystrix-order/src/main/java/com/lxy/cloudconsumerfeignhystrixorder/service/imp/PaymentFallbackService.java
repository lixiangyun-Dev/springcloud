package com.lxy.cloudconsumerfeignhystrixorder.service.imp;

import com.lxy.cloudconsumerfeignhystrixorder.service.PaymentHystrixService;
import org.springframework.stereotype.Component;


/**
 * 新建一个类PaymentFallbackService，
 * 实现该业务类PaymentHystrixService接口，
 * 统一为接口里面的方法进行异常处理
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "PaymentFallbackService fall  paymentInfo_OK 服务器出现故障";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "PaymentFallbackService fall  paymentInfo_TimeOut 服务器出现故障";
    }
}
