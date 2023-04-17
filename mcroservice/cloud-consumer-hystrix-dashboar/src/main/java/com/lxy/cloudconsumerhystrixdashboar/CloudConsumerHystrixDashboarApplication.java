package com.lxy.cloudconsumerhystrixdashboar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;


/**
 * @EnableHystrixDashboard 启用实时的监控
 */
@SpringBootApplication
@EnableHystrixDashboard
public class CloudConsumerHystrixDashboarApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerHystrixDashboarApplication.class, args);
    }

}
