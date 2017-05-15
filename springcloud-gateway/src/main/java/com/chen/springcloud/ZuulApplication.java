package com.chen.springcloud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 服务网关-权限控制
 * Created by chenyf on 2017/5/14.
 */
@EnableZuulProxy
@SpringCloudApplication
public class ZuulApplication {

    private static Logger logger =  LoggerFactory.getLogger(ZuulApplication.class);

    public static void main(String[] args) {
        SpringApplicationBuilder applicationBuilder = new SpringApplicationBuilder(ZuulApplication.class);
        applicationBuilder.web(true);
        applicationBuilder.run(args);
        logger.info("--------------------服务网关-已启动--------------------");
    }

}
