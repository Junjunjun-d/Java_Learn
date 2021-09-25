package com.test.springboot004.service.impl;

import com.test.springboot004.mapper.StudentMapper;
import com.test.springboot004.model.Student;
import com.test.springboot004.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public void deleteStudentById(Integer id){
        studentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void insertStudentDetails(Student record) {
        studentMapper.insert(record);
    }

    @Override
    public void updateStudentById(Student record){
        studentMapper.updateByPrimaryKey(record);
    }

}
