package com.test.springboor019.web;

import com.test.springboor019.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Controller
public class UserController {

    @RequestMapping("/if")
    public String condition(Model model){

        model.addAttribute("sex",1);

        model.addAttribute("flag",true);

        model.addAttribute("productType",0);

        return "condition";
    }

    @RequestMapping(value = "/inline")
    public String inline(Model model) {
        model.addAttribute("data","SpringBoot inline");
        return "inline-test";
    }

    @RequestMapping(value = "/literal")
    public String literal(Model model) {

        model.addAttribute("sex",1);
        model.addAttribute("data","SpringBoot Data");
        model.addAttribute("flag",true);

        User user = new User();
        user.setId(1001);
        user.setUsername("lisi");
        model.addAttribute("user",user);

        User userDetail = new User();
        model.addAttribute("userDetail",userDetail);

        return "literal";
    }

    @RequestMapping(value = "/splice")
    public String splice(Model model) {
        model.addAttribute("totalRows",123);
        model.addAttribute("totalPage",13);
        model.addAttribute("currentPage",2);

        return "splice";
    }

    @RequestMapping(value = "/operator")
    public String operator(Model model) {
        model.addAttribute("sex",1);
        model.addAttribute("flag",true);
        return "operator";
    }

    @RequestMapping(value = "/index")
    public String index(HttpServletRequest request, Model model, Integer id) {
        model.addAttribute("username","lisi");

        request.getSession().setAttribute("data","sessionData");

        return "index";
    }

    @RequestMapping(value = "/function")
    public String function(Model model) {

        model.addAttribute("time",new Date());
        model.addAttribute("data","SpringBootHelloWorld");
        return "function";
    }
}
