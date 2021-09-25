package com.test.springboot008.mapper;

import com.test.springboot008.model.Student;

public interface StudentMapper {
    /**
     * 获取学生总人数
     * @return
     */
    Long selectAllStudentCount();

    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}