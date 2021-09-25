package com.jdbc.test2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement ps = null;

		try {
			// 1、获取连接对象
			conn = Conn.getConn();
			// 2、创建更新语句 但是不给出具体的值
			String updateSql = "update student set name = ? where id = ?";
			// 3、 创建预处理对象，对sql语句先进行预处理
			ps = conn.prepareStatement(updateSql);
			// 4、之后再设置参数
			ps.setInt(2, 7);
			ps.setString(1, "J3333");

			// 5、返回一个进行此操作的结果，要么成功，要么失败，如果返回的结果>0就是成功，反之失败
			int result = ps.executeUpdate();
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
