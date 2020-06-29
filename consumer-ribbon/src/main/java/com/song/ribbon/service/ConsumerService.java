package com.song.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Song
 * @date 2020/06/27
 */
@Component
@Slf4j
public class ConsumerService {

    @Autowired
    private RestTemplate restTemplate;

    //注解指定断路时的回调方法
    @HystrixCommand(fallbackMethod = "fallback")
    public String add() {
        ResponseEntity<String> entity = restTemplate.getForEntity("http://COMMON-SERVICE/get?a=10&b=20", String.class);
        return entity.getBody();
    }

    private String fallback() {
        return "error";
    }
}
