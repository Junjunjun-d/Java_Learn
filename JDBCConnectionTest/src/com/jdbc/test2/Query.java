package com.jdbc.test2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Query {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			// 1、获取连接对象
			conn = Conn.getConn();
			// 2、创建sql查询语句 但先不给出要查询的记录的id
			String sql = "select * from student where id = ?";
			// 3、 创建预处理对象，对sql语句先进行预处理
			ps = conn.prepareStatement(sql);
			// 之后再设置参数id
			ps.setInt(1, 1);
			// 4、执行sql语句并且换回一个查询的结果集
			rs = ps.executeQuery();
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
