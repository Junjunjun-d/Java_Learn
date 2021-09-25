package com.test.springboot015.filter;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * 第一步：通过注解方式创建一个 Filer
 */
@WebFilter(urlPatterns = "/MyFilter")
public class MyFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        System.out.println("-------------您已进入过滤器01---------------");

        chain.doFilter(request,response);
    }
}
