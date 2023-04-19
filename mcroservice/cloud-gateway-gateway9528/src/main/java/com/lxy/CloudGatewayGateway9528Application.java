package com.lxy;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CloudGatewayGateway9528Application {
    public static void main(String[] args) {
        SpringApplication.run(CloudGatewayGateway9528Application.class, args);
    }
}