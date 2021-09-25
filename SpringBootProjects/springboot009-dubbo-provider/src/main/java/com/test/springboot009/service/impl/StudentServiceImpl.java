package com.test.springboot009.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.test.springboot009.service.StudentService;
import org.springframework.stereotype.Component;

@Component
@Service(interfaceClass = StudentService.class,version = "1.0.0", timeout = 15000)
public class StudentServiceImpl implements StudentService {
    @Override
    public Integer queryAllStudentCount() {
        //调用数据持久层获取数据
        return 1234;
    }
}
