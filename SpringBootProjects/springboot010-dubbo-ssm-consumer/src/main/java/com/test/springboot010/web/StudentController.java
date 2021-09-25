package com.test.springboot010.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.test.springboot010.model.Student;
import com.test.springboot010.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {
    @Reference(interfaceName = "com.test.springboot010.service.StudentService",version = "1.0.0",check = false)
    private StudentService studentService;

    @RequestMapping(value = "/student/detail/{id}")
    public String studentDetail(Model model,
                                @PathVariable("id") Integer id) {

        Student student = studentService.queryStudentById(id);

        model.addAttribute("student",student);
        return "studentDetail";
    }

    @GetMapping(value = "/student/{id}")
    public @ResponseBody String student(@PathVariable("id") Integer id) {

        Student student = studentService.queryStudentById(id);

        return student.getName();

    }

    @GetMapping(value = "/student/all/count")
    public @ResponseBody Object allStudentCount() {

        Integer allStudentCount = studentService.queryAllStudentCount();

        return "学生总人数为:"+allStudentCount;
    }
}
