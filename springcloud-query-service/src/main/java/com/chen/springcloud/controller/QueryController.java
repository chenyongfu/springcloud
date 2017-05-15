package com.chen.springcloud.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chenyf on 2017/5/14.
 */
@RestController
public class QueryController {

    private final Logger logger = LoggerFactory.getLogger(QueryController.class);

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/query" ,method = RequestMethod.GET)
    public String add(@RequestParam String key) {
        ServiceInstance instance = client.getLocalServiceInstance();
        logger.info("/query, host:" + instance.getHost() + ", service_id:" + instance.getServiceId() + ", key:" + key);
        return "QueryController-"+ key;
    }

}