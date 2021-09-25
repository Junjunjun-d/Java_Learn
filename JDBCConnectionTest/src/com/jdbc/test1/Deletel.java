package com.jdbc.test1;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Deletel {
	public static void main(String[] args) {
		Connection conn = null;
		Statement st = null;

		try {
			// 获取连接对象
			conn = Conn.getConn();
			// 获取连接
			st = conn.createStatement();
			// 创建删除语句
			String deleteSql = "delete from student where id = 7";
			// 获取结果
			int result = st.executeUpdate(deleteSql);
			if (result > 0) {
				System.out.println("删除成功");
			} else {
				System.out.println("删除失败");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
