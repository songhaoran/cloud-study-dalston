package com.song.eureka;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author songwenhao
 */
@SpringBootApplication
@EnableEurekaServer
public class RegisterEurekaApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(RegisterEurekaApplication.class).web(true).run(args);
    }
}
