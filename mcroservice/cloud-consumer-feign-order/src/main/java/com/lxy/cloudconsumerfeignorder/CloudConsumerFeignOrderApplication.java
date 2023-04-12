package com.lxy.cloudconsumerfeignorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * @EnableFeignClients 激活Feign的注解
 */
@SpringBootApplication
@EnableFeignClients
public class CloudConsumerFeignOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerFeignOrderApplication.class, args);
    }

}
