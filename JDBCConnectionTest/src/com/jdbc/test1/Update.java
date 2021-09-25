package com.jdbc.test1;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {
	public static void main(String[] args) {
		Connection conn = null;
		Statement st = null;

		try {
			// 1、获取连接对象
			conn = Conn.getConn();
			// 2、获取连接
			st = conn.createStatement();
			// 3、创建更新语句
			String updateSql = "update student set age = 12 where id = 7";
			// 返回一个进行此操作的结果，要么成功，要么失败，如果返回的结果>0就是成功，反之失败
			int result = st.executeUpdate(updateSql);
			if (result > 0) {
				System.out.println("更新成功");
			} else {
				System.out.println("更新失败");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
