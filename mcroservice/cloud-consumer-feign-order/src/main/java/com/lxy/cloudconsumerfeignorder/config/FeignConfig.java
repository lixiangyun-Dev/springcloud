package com.lxy.cloudconsumerfeignorder.config;


import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {
    /**
     * feignClient配置日志级别
     *Logger有四种类型：
     * NONE：默认的，不显示任何日志。
     * BASIC：仅记录请求方法、URL、响应状态及执行时间。
     * HEADERS：除了BASIC中定义的信息之外，还有请求和响应的有信息。
     * FULL：除了BASIC中定义的信息之外，还有请求和响应的正文及元数据。
     * 通过注册Bean来设置日志记录级别！
     * @return
     */
    @Bean
    public feign.Logger.Level feignLoggerLevel() {
        // 请求和响应的头信息,请求和响应的正文及元数据
        return Logger.Level.FULL;
    }

}
