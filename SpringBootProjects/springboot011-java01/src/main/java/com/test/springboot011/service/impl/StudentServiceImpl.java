package com.test.springboot011.service.impl;

import com.test.springboot011.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public String sayHello() {
        return "Hello SpringBoot Java!";
    }
}
