package com.song.server;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author songwenhao
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Server01Application {
    public static void main(String[] args) {
        new SpringApplicationBuilder(Server01Application.class).web(true).run(args);
    }
}
