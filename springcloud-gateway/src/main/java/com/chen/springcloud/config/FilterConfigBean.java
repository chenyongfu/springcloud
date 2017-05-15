package com.chen.springcloud.config;

import com.chen.springcloud.commons.filter.AccessZuulFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by chenyf on 2017/5/15.
 */
@Configuration
public class FilterConfigBean {

    @Bean
    public AccessZuulFilter accessFilter() {
        return new AccessZuulFilter();
    }

}
