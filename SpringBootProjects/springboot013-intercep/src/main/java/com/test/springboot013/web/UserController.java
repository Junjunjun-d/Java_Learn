package com.test.springboot013.web;

import com.test.springboot013.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;


@Controller
@RequestMapping(value = "/user")
public class UserController {


    //用户登录的请求,需要排除
    @RequestMapping(value = "/login")
    public @ResponseBody Object login(HttpServletRequest request) {
        //将用户的信息存放到session中
        User user = new User();
        user.setId(1001);
        user.setUserName("zhangsan");
        request.getSession().setAttribute("user",user);

        return "login SUCCESS";
    }

    //该请求需要用户登录之后才可访问
    @RequestMapping(value = "/center")
    public @ResponseBody Object center() {
        return "See Center Message";
    }

    //该请求不登录也可访问
    @RequestMapping(value = "/out")
    public @ResponseBody Object out() {
        return "Out see anytime";
    }

    //如果用户未登录访问了需要登录才可访问的请求,之后会跳转至该请求路径
    //该请求路径不需要用户登录也可访问
    @RequestMapping(value = "/error")
    public @ResponseBody Object error() {
        return "error";
    }
}
