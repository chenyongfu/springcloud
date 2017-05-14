package com.chen.springcloud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 手动启动-服务注册中心
 * Created by chenyf on 2017/5/14.
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {

    private static Logger logger =  LoggerFactory.getLogger(EurekaServerApplication.class);

    public static void main(String[] args) {
        SpringApplicationBuilder applicationBuilder = new SpringApplicationBuilder(EurekaServerApplication.class);
        applicationBuilder.web(true);
        applicationBuilder.run(args);
        logger.info("--------------------服务注册中心-已启动--------------------");
    }

}
