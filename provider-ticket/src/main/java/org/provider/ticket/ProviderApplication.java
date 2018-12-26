package org.provider.ticket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication
@EnableEurekaClient//本服务启动后会自动注册进eureka服务中
@ComponentScan("org.provider") //类似于Spring的基础类扫描包，用来扫描实体，接口和控制器
public class ProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }
}
