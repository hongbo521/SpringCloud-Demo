package org.bruce.microservice.userservice;

import org.bruce.microservice.userservice.entity.User;
import org.bruce.microservice.userservice.repository.UserRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.stream.Stream;

/**
 * @author: bruce.hong
 * @time: 2021/7/7 下午 2:50
 */
@SpringBootApplication
public class ProviderUserApplication {
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }


    public static void main(String[] args) {
        SpringApplication.run(ProviderUserApplication.class, args);
    }

}
