package com.lxy.cloudprovidepayment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;


/**
 * @EnableEurekaClient Eureka服务端的客户端
 */
@SpringBootApplication
@EnableEurekaClient
public class CloudProvidePaymentApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudProvidePaymentApplication.class, args);
    }

}
