package com.dzf.mybatis;

import com.dzf.mybatis.model.Student;
import com.dzf.mybatis.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.List;

/**
 * Hello world!
 *
 */
public class SelectApp
{
    public static void main( String[] args ) throws IOException {


        SqlSession sqlSession = MyBatisUtils.getSqlSession();

        String sqlId = "com.dzf.mybatis.mapper.StudentMapper"+"."+"selectAllStudents";

        List<Student> studentList = sqlSession.selectList(sqlId);

        studentList.forEach(stu ->System.out.println(stu));

        sqlSession.close();























    }
}
