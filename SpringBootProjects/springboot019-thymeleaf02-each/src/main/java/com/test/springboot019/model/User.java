package com.test.springboot019.model;


import lombok.Data;

/**
 * 用户实体类
 */
@Data//取代get，set，toString等方法
public class User {

    private Integer id;

    private String nick;

    private String phone;

    private String address;

}
