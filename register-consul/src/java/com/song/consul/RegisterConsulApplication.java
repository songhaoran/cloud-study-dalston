package com.song.consul;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author songwenhao
 */
@SpringBootApplication
public class RegisterConsulApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(RegisterConsulApplication.class).web(true).run(args);
    }
}
