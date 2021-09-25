package com.test.springboot008.service.impl;

import com.test.springboot008.mapper.StudentMapper;
import com.test.springboot008.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    //配置了上面的步骤，Spring Boot将自动配置RedisTemplate，在需要操作redis的类中注入redisTemplate即可。
    //注意：Spring Boot帮我们注入RedisTemplate类，泛型里面只能写 <String, String>、<Object, Object>或者什么都不写
    @Autowired
    private RedisTemplate<Object,Object> redisTemplate;

    @Override
    public Long queryAllStudentCount(){

        //设置redisTemplate对象key的序列化方式
        redisTemplate.setKeySerializer(new StringRedisSerializer());

        //从redis缓存中获取总人数
        Long allStudentCount = (Long) redisTemplate.opsForValue().get("allStudentCount");

        //判断是否为空
        if (null == allStudentCount) {
            //去数据库查询，并存放到redis缓存中
            allStudentCount = studentMapper.selectAllStudentCount();
            redisTemplate.opsForValue().set("allStudentCount",allStudentCount,15, TimeUnit.SECONDS);
        }
        return allStudentCount;
    }


}
