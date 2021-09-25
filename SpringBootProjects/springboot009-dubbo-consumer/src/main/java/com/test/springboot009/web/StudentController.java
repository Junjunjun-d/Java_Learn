package com.test.springboot009.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.test.springboot009.service.StudentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Reference(interfaceClass = StudentService.class, version = "1.0.0", check = false)
    private StudentService studentService;

    @RequestMapping("/student/count")
    public Object studentCount(){

        Integer allStudentCount = studentService.queryAllStudentCount();

        return  "学生总人数为： "+allStudentCount;
    }
}





















