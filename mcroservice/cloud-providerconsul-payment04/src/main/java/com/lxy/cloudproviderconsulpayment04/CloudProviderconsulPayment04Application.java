package com.lxy.cloudproviderconsulpayment04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * @EnableDiscoveryClient 服务发现
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudProviderconsulPayment04Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudProviderconsulPayment04Application.class, args);
    }

}
