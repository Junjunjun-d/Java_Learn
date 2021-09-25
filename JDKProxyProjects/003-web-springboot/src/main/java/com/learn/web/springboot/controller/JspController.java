package com.learn.web.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class JspController{

    @RequestMapping(value = "/hello")
    public @ResponseBody String jsp(Model model){
        model.addAttribute("data","springboot web");
        return "hello";
    }


}
