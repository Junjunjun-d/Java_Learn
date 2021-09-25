package com.test.springboot018.service.impl;

import com.test.springboot018.mapper.StudentMapper;
import com.test.springboot018.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Integer queryStudentCount() {
        return studentMapper.selectStudentCount();
    }
}
