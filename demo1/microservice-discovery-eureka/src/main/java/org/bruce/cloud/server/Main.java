package org.bruce.cloud.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author: bruce.hong
 * @time: 2021/7/7 上午 11:19
 */
@SpringBootApplication
@EnableEurekaServer
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
