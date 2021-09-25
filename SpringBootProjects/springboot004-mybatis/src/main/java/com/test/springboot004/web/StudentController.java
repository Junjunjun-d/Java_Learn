package com.test.springboot004.web;

import com.test.springboot004.model.Student;
import com.test.springboot004.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

   /* @RequestMapping(value = "/student1")
    public @ResponseBody Object student1() {

        Student student = studentService.queryAllStudent();
        return student;
    }*/

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
        Student student = new Student();
        student.setAge(99);
        student.setId(1);
        student.setName("aa");
        studentService.updateStudentById(student);
        return "更新成功";
    }
}