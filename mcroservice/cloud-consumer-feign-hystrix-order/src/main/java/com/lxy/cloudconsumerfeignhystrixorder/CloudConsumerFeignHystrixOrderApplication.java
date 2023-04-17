package com.lxy.cloudconsumerfeignhystrixorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableCircuitBreaker
public class CloudConsumerFeignHystrixOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerFeignHystrixOrderApplication.class, args);
    }

}
