package com.chen.springcloud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 服务提供者
 * Created by chenyf on 2017/5/14.
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ComputeServiceApplication {

    private static Logger logger =  LoggerFactory.getLogger(ComputeServiceApplication.class);

    public static void main(String[] args) {
        SpringApplicationBuilder applicationBuilder = new SpringApplicationBuilder(ComputeServiceApplication.class);
        applicationBuilder.web(true);
        applicationBuilder.run(args);
        logger.info("--------------------计算服务-已启动--------------------");
    }

}
