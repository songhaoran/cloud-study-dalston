package com.song.feign.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 *
 * @author Song
 * @date 2020/06/27
 */
@Component
@Slf4j
public class ConsumerClientFallback implements ConsumerClient {

    @Override
    public Integer add(Integer a, Integer b) {
        return -9999;
    }
}
