package com.test.springboot019.web;

import com.test.springboot019.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {


    @RequestMapping("/message")
    public String message(Model model){

        model.addAttribute("data","SpringBoot集成Thymeleaf模版引擎");
        return "message";
    }

    @RequestMapping("/user")
    public String user(Model model){
        User user = new User();
        user.setId(1);
        user.setName("张三");
        user.setPhone("13700000000");
        user.setAddress("上海浦东");

        model.addAttribute("user",user);

        return  "user";
    }


    @RequestMapping(value = "/url")
    public String urlExpression(Model model) {

        model.addAttribute("id",1001);
        model.addAttribute("age",28);
        model.addAttribute("username","zhaoliu");

        return "url";
    }


    @RequestMapping(value = "/test")
    public @ResponseBody
    String test(String username) {
        return "请求路径/test,参数是:" + username;
    }

    @RequestMapping(value = "/test1")
    public @ResponseBody String test1(Integer id,String username,Integer age) {
        return "请求路径/test1,参数id=" + id+",username="+username+",age="+age;
    }

    @RequestMapping(value = "/test2/{id}")
    public @ResponseBody String test2(@PathVariable("id") Integer id) {
        return "ID="+id;
    }

    @RequestMapping(value = "/test3/{id}/{username}")
    public @ResponseBody String test3(@PathVariable("id") Integer id,
                                      @PathVariable("username") String username) {
        return "ID="+id+"----username="+username;
    }

    @RequestMapping(value = "/url2")
    public String url2() {
        return "url2";
    }

    @RequestMapping(value = "/property")
    public String property() {
        return "property";
    }
}
