package com.lxy.cloudconsumerconsulorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * @EnableDiscoveryClient consul服务发现
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudConsumerconsulOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerconsulOrderApplication.class, args);
    }

}
