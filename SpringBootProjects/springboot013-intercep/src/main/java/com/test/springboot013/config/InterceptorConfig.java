package com.test.springboot013.config;

import com.test.springboot013.interceptor.UserInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration  //定义此类为配置文件(即相当于之前的xml配置文件)
public class InterceptorConfig implements WebMvcConfigurer {

    //mvc:interceptors
    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        //定义需要拦截的路径: 要拦截user下的所有访问请求,必须用户登录后才可访问,
        // 但是这样拦截的路径中有一些是不需要用户登录也可访问的
        String[] addPathPatterns = {
            "/user/**"
        };

        //定义不需要拦截的路径: 要排除的路径,排除的路径说明不需要用户登录也可访问
        String[] excludePathPatterns = {
            "/user/out", "/user/error","/user/login"
        };


        registry.addInterceptor(new UserInterceptor())//添加要注册的拦截器对象
                .addPathPatterns(addPathPatterns)//添加需要拦截的路径
                .excludePathPatterns(excludePathPatterns);//添加不需要拦截的路径
    }
}
