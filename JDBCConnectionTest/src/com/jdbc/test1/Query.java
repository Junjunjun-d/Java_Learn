package com.jdbc.test1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Query {

	public static void main(String[] args) {
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;

		try {
			// 1、获取连接对象
			conn = Conn.getConn();
			// 2、创建statement类对象，用来执行SQL语句！！
			st = conn.createStatement();
			// 3、创建sql查询语句
			String sql = "select * from student";
			// 4、执行sql语句并且换回一个查询的结果集
			rs = st.executeQuery(sql);
			while (rs.next()) {
				int id = rs.getInt("ID");
				int age = rs.getInt("AGE");
				String name = rs.getString("NAME");
				System.out.println("id=" + id + "--" + "name=" + name + "--" + "age=" + age);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
