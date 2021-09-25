package com.jdbc.test3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * 使用配置文件配置数据库连接 这种方式便于修改数据库连接
 * 
 * jdbc.properties
 * 
 * @author Administrator
 *
 */
public class Conn {
	// oracle的驱动
	static String driverClass = null;
	// 连接oracle路径方式 “orcl”是要建立连接的数据库名 1521端口
	static String url = null;
	static String user = null;// user是数据库的用户名
	static String password = null;// 用户登录密码

	// 设置成静态代码块，先于主程序则执行,使其在主程序运行时文件就已经被读取
	static {
		try {
			// 1、创建一个properties对象，用于一会获取之前文本里面的配置信息
			Properties pp = new Properties();
			// 2、创建一个输入流，把文本里的信息写入输入流中
			FileInputStream is = new FileInputStream("jdbc.properties");
			// 3、properties.load()方法获取输入流
			pp.load(is);
			// 4、获取键值对的信息
			driverClass = pp.getProperty("driverClass");
			url = pp.getProperty("url");
			user = pp.getProperty("user");
			password = pp.getProperty("password");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConn() {// 为了方便下面的讲解，这里专门建立了一个用于数据库连接的一个方法
		Connection conn = null;
		try {
			// 首先建立驱动
			Class.forName(driverClass);

			// 驱动成功后进行连接
			conn = DriverManager.getConnection(url, user, password);

			System.out.println("连接成功");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;// 返回一个连接
	}

}
