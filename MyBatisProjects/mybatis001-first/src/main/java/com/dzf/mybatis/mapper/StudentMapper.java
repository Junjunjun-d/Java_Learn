package com.dzf.mybatis.mapper;

import com.dzf.mybatis.model.Student;

import java.util.List;

/**
 * @Author: DZF
 * @Date: 2021-08-09 22:55
 * @Description: com.dzf.mybatis.mapper
 * @Version: 1.0
 */
public interface StudentMapper {

    //查询所有的学生
    List<Student> selectAllStudents();

    //插入方法
    //参数： student ,表示要插入到数据库的数据
    //返回值： int ， 表示执行insert操作后的 影响数据库的行数
    public int insertStudent(Student student);

}
