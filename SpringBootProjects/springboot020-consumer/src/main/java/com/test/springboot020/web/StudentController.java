package com.test.springboot020.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.test.springboot020.model.Student;
import com.test.springboot020.web.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class StudentController {

    @Reference(interfaceClass = StudentService.class,version = "1.0.0",check = false)
    private StudentService studentService;

    @RequestMapping(value = "/student/detail/{id}")
    public String studentDetail(Model model,
                                @PathVariable("id") Integer id) {

        //根据学生ID查询详情
        Student student = studentService.queryStudentById(id);

        model.addAttribute("student",student);

        return "studentDetail";
    }
}
