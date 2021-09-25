package com.test.springboot006.web;

import org.springframework.web.bind.annotation.*;

/**
 * 该案例主要演示了使用Spring提供的不同注解接收不同类型的请求
 */
//@RestController = @Controller + @ResponseBody 相当于给方法加了@ResponseBody注解，所以是不能跳转页面的，只能返回字符串或者json数据
@RestController
public class MVCController {
    @GetMapping(value = "/query")
    public String get() {
        return "@GetMapping注解,通常查询时使用";
    }

    // 其他请求需要使用postman工具验证
    // 因为通过浏览器输入地址，默认发送的只能是get请求，通过 Postman工具，可以模拟
    //发送不同类型的请求，并查询结果，在安装的时候，有些机器可能会需要安装 MicroSort .NET Framework
    @PostMapping(value = "/add")
    public String add() {
        return "@PostMapping注解，通常新增时使用";
    }

    @PutMapping(value = "/modify")
    public String modify() {
        return "@PutMapping注解，通常更新数据时使用";
    }

    @DeleteMapping(value = "/remove")
    public String remove() {
        return "@DeleteMapping注解，通常删除数据时使用";
    }
}

