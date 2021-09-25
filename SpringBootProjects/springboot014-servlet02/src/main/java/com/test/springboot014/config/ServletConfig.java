package com.test.springboot014.config;

import com.test.springboot014.servlet.MyServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 通过 SpringBoot的配置类实现(组件注册) springboot使用servlet
 * 第二步：编写一个 Spring Boot的配置类 ，在该类中注册 Servlet
 */
@Configuration//将此类作为配置类
public class ServletConfig {

    //@Bean是一个方法级别上的注解,主要用在配置类里
    //相当于一个
    // <beans>
    //      <bean id="" class="">
    // </beans>
    @Bean
    public ServletRegistrationBean myServletRegistrationBean(){

        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new MyServlet(),"/MyServlet");

        return servletRegistrationBean;
    }
}
