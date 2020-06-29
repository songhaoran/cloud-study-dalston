package com.song.config.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Song on 2020/06/27.
 */
@RestController
@Slf4j
public class TestController {

    @Value("${from}")
    private String from;

    @RequestMapping(value = "/from", method = RequestMethod.GET)
    public String from() {
        return from;
    }
}
