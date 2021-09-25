package com.test.springboot004.service;

import com.test.springboot004.model.Student;

public interface StudentService {
   /**
     * 获取所有学生详情
     *
     * @return
     *//*
    Student queryAllStudent();*/
    /**
     * 根据学生标识获取学生详情
     *
     * @param id
     *
     * @return
     */
    Student queryStudentById(Integer id);

    /**
     * 根据学生标识删除学生详情
     *
     * @param id
     *
     * @return
     */
    void deleteStudentById(Integer id);

    /**
     * 插入一条数据
     *
     * @param id
     *
     * @return
     */
    void insertStudentDetails(Student record);

    /**
     * 根据学生标识更新学生详情
     *
     * @param id
     *
     * @return
     */
    void updateStudentById(Student record);
}
