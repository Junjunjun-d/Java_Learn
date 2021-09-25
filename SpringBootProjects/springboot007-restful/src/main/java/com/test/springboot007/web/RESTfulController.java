package com.test.springboot007.web;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class RESTfulController {
    /**
     *  添加学生
     *  请求地址：http://localhost:9090/springBoot/student/cc/66
     *  请求方式：POST
     *  @param name
     *  @param age
     *  @return
     */
    @PostMapping(value = "/springBoot/student/{name}/{age}")
    public Object addStudent(@PathVariable("name") String name,@PathVariable("age") Integer age){

        Map<String, Object> retMap = new HashMap<String, Object>();
        retMap.put("name",name);
        retMap.put("age",age);
        return retMap;
    }

    /**
     * 删除学生
     * 请求地址：http://localhost:9090/springBoot/student/1
     * 请求方式：Delete
     * @param id
     * @return
     */
    @DeleteMapping(value = "/springBoot/student/{id}")
    public Object removeStudent(@PathVariable("id") Integer id) {

        return "删除的学生id为：" + id;

    }

    /**
     * 修改学生信息
     * 请求地址：http://localhost:9090/springBoot/student/2
     * 请求方式：Put
     * @param id
     * @return
     */
    @PutMapping(value = "/springBoot/student/{id}")
    public Object modifyStudent(@PathVariable("id") Integer id) {

        return "修改学生的id为" + id;

    }

    /**
     * 根据id查询学生信息
     * 请求地址：http://localhost:9090/springBoot/student/2
     * 请求方式：Get
     * @param id
     * @return
     */
    @GetMapping(value = "/springBoot/student/{id}")
    public Object queryStudent(@PathVariable("id") Integer id) {

        return "查询学生的id为" + id;

    }
}

