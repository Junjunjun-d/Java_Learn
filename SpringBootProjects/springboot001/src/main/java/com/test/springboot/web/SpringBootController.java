package com.test.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SpringBootController {

    @RequestMapping(value = "/SpringBoot/say")
    public @ResponseBody String say() {
        return "Hello SpringBoot!";
    }
}
