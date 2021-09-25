package com.jdbc.test2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement ps = null;

		try {
			// 1、获取连接对象
			conn = Conn.getConn();

			// 2、创建插入语句 但是不给出具体的值
			String insertSql = "insert into student values(?, ?, ? )";
			// 3、 创建预处理对象，对sql语句先进行预处理
			ps = conn.prepareStatement(insertSql);
			// 4、之后再设置参数
			ps.setInt(1, 7);
			ps.setString(2, "JACK");
			ps.setInt(3, 23);

			// 5、返回一个进行此操作的结果，要么成功，要么失败，如果返回的结果>0就是成功，反之失败
			int result = ps.executeUpdate();
			if (result > 0) {
				System.out.println("添加成功");
			} else {
				System.out.println("添加失败");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
