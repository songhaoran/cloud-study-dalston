package com.song.feign;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author songwenhao
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ConsumerFeignApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ConsumerFeignApplication.class).run(args);
    }
}
