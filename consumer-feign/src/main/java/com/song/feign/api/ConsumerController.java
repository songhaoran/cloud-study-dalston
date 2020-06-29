package com.song.feign.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 *
 * @author Song
 * @date 2020/06/27
 */
@RestController
@Slf4j
public class ConsumerController {

    @Resource
    private ConsumerClient consumerClient;


    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add() {
        log.info("[add]");
        return consumerClient.add(10, 20);
    }
}
