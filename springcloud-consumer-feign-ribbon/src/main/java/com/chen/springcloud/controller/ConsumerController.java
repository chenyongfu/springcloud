package com.chen.springcloud.controller;

import com.chen.springcloud.service.RpcComputeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 服务消费者-ribbon
 * Created by chenyf on 2017/5/14.
 */
@RestController
public class ConsumerController {

    private final Logger logger = LoggerFactory.getLogger(ConsumerController.class);

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    RpcComputeService rpcComputeService;

    @RequestMapping(value = "/add1", method = RequestMethod.GET)
    public Integer add1() {
        return rpcComputeService.add(10, 20);
    }

    @RequestMapping(value = "/add2", method = RequestMethod.GET)
    public String add2() {
        return restTemplate.getForEntity("http://COMPUTE-SERVICE/add?a=10&b=20", String.class).getBody();
    }

}
