package com.song.zuul;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author songwenhao
 */
//相当于 @SpringBootApplication + @EnableDiscoveryClient+ @EnableCircuitBreaker
@SpringCloudApplication
@EnableZuulProxy
public class GatewayZuulApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(GatewayZuulApplication.class).web(true).run(args);
    }

}
