package com.test.springboot005.service.impl;

import com.test.springboot005.mapper.StudentMapper;
import com.test.springboot005.model.Student;
import com.test.springboot005.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

 /*   @Override
    public Student queryAllStudent(){
        return studentMapper.selectAll();
    }*/

    @Override
    public Student queryStudentById(Integer id) {
        return studentMapper.selectByPrimaryKey(id);
    }

    @Override
    public Integer deleteStudentById(Integer id){
        return studentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Integer insertStudentDetails(Student record) {
        return studentMapper.insert(record);

    }

    @Override
    @Transactional  //添加此注解说明该方法添加的事务管理
    public Integer updateStudentById(Student record){

        int count = studentMapper.updateByPrimaryKey(record);

        System.out.println("更新结果: "+count);
        //在此构造一个除数为0的异常，测试事务是否起作用
        //int a = 10/0;
        return count;
    }

}
