package com.song.ribbon.api;

import com.song.ribbon.service.ConsumerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Song
 * @date 2020/06/27
 */
@RestController
@Slf4j
public class ConsumerController {

    @Autowired
    private ConsumerService consumerService;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add() {
        String add = consumerService.add();
        log.info("[add]result->{}", add);
        return add;
    }
}
