package com.jdbc.test1;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {
	public static void main(String[] args) {
		Connection conn = null;
		Statement st = null;
		PreparedStatement ps = null;
		CallableStatement cs = null;

		try {
			// 1、获取连接对象
			conn = Conn.getConn();

			// 2、获取连接
			// st = conn.createStatement();//1.使用Statement预编译模式
			// 3、创建插入语句 String
			// insertSql = "insert into student values(7, 'jack', 25 )";

			String insertSql = "insert into student (id,name,age) values(?,?,?)";

			// ps = conn.prepareStatement(insertSql);//2.使用PrepareStatement预编译模式

			cs = conn.prepareCall(insertSql);// 3.使用CallableStatement预编译模式
			for (int i = 1; i <= 10000; i++) {
				cs.setInt(1, i + 10008);// 下表是从1开始的而不是0
				cs.setString(2, "name" + i);
				cs.setInt(3, 22);
				cs.addBatch();
			}

			cs.executeBatch();// 批量执行

			// 返回一个进行此操作的结果，要么成功，要么失败，如果返回的结果>0就是成功，反之失败
			// int result = st.executeUpdate(insertSql);
			/*
			 * int result = ps.executeUpdate(); if (result > 0) {
			 * System.out.println("添加成功"); } else { System.out.println("添加失败");
			 * }
			 */
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
