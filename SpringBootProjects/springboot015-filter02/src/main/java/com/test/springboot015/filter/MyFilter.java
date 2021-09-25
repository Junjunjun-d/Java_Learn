package com.test.springboot015.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * 第一步：创建一个普通的 Filter
 */
public class MyFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("-------------------您已进入过滤器-222-------------------");
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
