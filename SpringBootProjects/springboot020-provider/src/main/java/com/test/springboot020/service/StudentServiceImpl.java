package com.test.springboot020.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.test.springboot020.mapper.StudentMapper;
import com.test.springboot020.model.Student;
import com.test.springboot020.web.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Service(interfaceClass = StudentService.class,version="1.0.0",timeout = 15000)
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student queryStudentById(Integer id) {
        return studentMapper.selectByPrimaryKey(id);
    }
}
