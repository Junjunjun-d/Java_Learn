package com.jdbc.test2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 使用preparedStatement (预处理)实现对数据库的增删改查。 连接类不变
 * 
 * @author Administrator
 *
 */
public class Conn {
	// oracle的驱动
	static String driverClass = "oracle.jdbc.driver.OracleDriver";
	// 连接oracle路径方式 “orcl”是要建立连接的数据库名 1521端口
	static String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	static String user = "test";// user是数据库的用户名
	static String password = "test";// 用户登录密码

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
