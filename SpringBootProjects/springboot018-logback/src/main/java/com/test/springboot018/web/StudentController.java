package com.test.springboot018.web;

import com.test.springboot018.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Slf4j
public class StudentController {

    @Autowired
    private StudentService studentService;
    private Logger log;

    @RequestMapping(value = "/student/count")
    public @ResponseBody String studentCount() {

        //log.trace("查询当前学生总人数");
        //log.debug("查询当前学生总人数");
        //log.info("查询当前学生总人数");
        //log.warn("查询当前学生总人数");
        //log.error("查询当前学生总人数");

        //log.info("-----------查询开始------------");
        Integer studentCount = studentService.queryStudentCount();
        //log.info("-----------查询结束------------");

        return "学生总人数为:" + studentCount;
    }
}
