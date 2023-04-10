package com.lxy.cloudeurekaserver02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
 * Eureka的服务端@EnableEurekaServer
 */
@SpringBootApplication
@EnableEurekaServer
public class CloudEurekaServer02Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudEurekaServer02Application.class, args);
    }

}
