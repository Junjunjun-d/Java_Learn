package com.test.springboot008.web;

import com.test.springboot008.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class RedisController {
    @Autowired
    private StudentService studentService;
    /**
     * 请求地址：http://localhost:9090/springboot/allStudentCount
     * @param request
     * @return
     */
    @GetMapping(value = "/springboot/allStudentCount")
    public Object allStudentCount(HttpServletRequest request) {

        Long allStudentCount = studentService.queryAllStudentCount();
        return "学生总人数：" + allStudentCount;

    }
}
