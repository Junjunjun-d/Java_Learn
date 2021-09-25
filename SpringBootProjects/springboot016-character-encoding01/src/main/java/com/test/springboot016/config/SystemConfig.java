package com.test.springboot016.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;

/**
 * 第二步：创建配置类 SystemConfig
 */
@Configuration  //将此类定义为配置文件
public class SystemConfig {

    @Bean
    public FilterRegistrationBean characterEncodingFilterRegistrationBean() {

        //创建字符编码过滤器
        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
        //设置强制使用指定字符编码
        characterEncodingFilter.setForceEncoding(true);
        //设置指定字符编码
        characterEncodingFilter.setEncoding("UTF-8");


        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();

        //设置字符编码过滤器
        filterRegistrationBean.setFilter(characterEncodingFilter);
        //设置字符编码过滤器路径
        filterRegistrationBean.addUrlPatterns("/*");

        return filterRegistrationBean;
    }
}
