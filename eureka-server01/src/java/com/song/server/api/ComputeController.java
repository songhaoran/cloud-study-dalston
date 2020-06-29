package com.song.server.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.netflix.eureka.serviceregistry.EurekaRegistration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Song
 * @date 2020/06/27
 */
@RestController
@Slf4j
public class ComputeController {

    @Resource
    private EurekaRegistration eurekaRegistration;

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public int add(@RequestParam("a") Integer a,
                   @RequestParam("b") Integer b
    ) {
        String hostName = eurekaRegistration.getInstanceConfig().getHostName(true);
        String serviceId = eurekaRegistration.getServiceId();
        log.info("[add]host->{},service_id->{}", hostName, serviceId);
        return a + b;
    }
}
