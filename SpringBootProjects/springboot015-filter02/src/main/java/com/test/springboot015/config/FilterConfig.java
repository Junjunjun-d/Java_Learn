package com.test.springboot015.config;

import com.test.springboot015.filter.MyFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 第二步：编写一个 Spring Boot的配置类 ，在该类中注册 Filter
 */
@Configuration  //定义此类为配置类
public class FilterConfig {

    @Bean
    public FilterRegistrationBean myFilterRegistrationBean() {

        //注册过滤器
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new MyFilter());

        //添加过滤路径
        filterRegistrationBean.addUrlPatterns("/user");

        return filterRegistrationBean;
    }
}
