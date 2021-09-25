package com.test.springboot005.web;

import com.test.springboot005.model.Student;
import com.test.springboot005.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;


    @RequestMapping(value = "/student2")
    public @ResponseBody Object student2() {

        Student student = studentService.queryStudentById(1);
        return student;
    }

    @RequestMapping(value = "/student3")
    public @ResponseBody Object student3() {
       studentService.deleteStudentById(8);
        return "删除成功";
    }

     @RequestMapping(value = "/student4")
     public @ResponseBody Object student4() {
        Student student = new Student();
        student.setAge(24);
        student.setId(7);
        student.setName("qq");
        studentService.insertStudentDetails(student);
          return "插入成功";
       }

    @RequestMapping(value = "/student5")
    public @ResponseBody Object student5() {
        Integer count = 0;
        try {
            Student student = new Student();
            student.setAge(11);
            student.setId(1);
            student.setName("aa");
            count =  studentService.updateStudentById(student);
        }catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }
        return count;
    }
}