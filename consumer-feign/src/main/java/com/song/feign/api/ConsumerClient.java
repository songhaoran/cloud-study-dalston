package com.song.feign.api;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Song
 * @date 2020/06/27
 */
//绑定该接口对应compute-service服务,指定断路时回调类
@FeignClient(value = "common-service", fallback = ConsumerClientFallback.class)
public interface ConsumerClient {

    /**
     * 调用service的方法
     *
     * @param a
     * @param b
     * @return
     */
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    Integer add(@RequestParam("a") Integer a, @RequestParam("b") Integer b);
}
