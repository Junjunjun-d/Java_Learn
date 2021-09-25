package com.test.springboot.web;

import com.test.springboot.config.ConfigInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SpringBootController {
    /*@Value("${school.name}")
    private String schoolName;

    @Value("${website}")
    private String website;*/

    @Autowired
    private ConfigInfo configInfo;

    @RequestMapping(value = "/say")
    public @ResponseBody String say(){
        return configInfo.getName()+"==----"+configInfo.getWebsite();
    }

}
