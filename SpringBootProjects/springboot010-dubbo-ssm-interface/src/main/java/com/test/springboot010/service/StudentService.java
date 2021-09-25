package com.test.springboot010.service;

import com.test.springboot010.model.Student;

public interface StudentService {

    /**
     * 根据学生ID查询详情
     * @param id
     * @return
     */
    Student queryStudentById(Integer id);

    /**
     * 获取学生总人数
     * @return
     */
    Integer queryAllStudentCount();

}
