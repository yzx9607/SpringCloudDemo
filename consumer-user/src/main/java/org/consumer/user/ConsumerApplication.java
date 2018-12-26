package org.consumer.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;
@ComponentScan("org.consumer")
@EnableDiscoveryClient//开启发现服务功能
@SpringBootApplication
public class ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }

    @LoadBalanced//开启负载均衡机制
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
        // 用来发送http请求
    }
}