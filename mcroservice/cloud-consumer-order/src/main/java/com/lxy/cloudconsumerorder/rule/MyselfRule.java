package com.lxy.cloudconsumerorder.rule;


import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyselfRule {

    @Bean
    public IRule myRule(){
//        return new RoundRobinRule();   //轮询
//        return new RandomRule();         //随机
        return new RetryRule();          //
    }
}
