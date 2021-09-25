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
			// 1����ȡ���Ӷ���
			conn = Conn.getConn();
			// 2������sql��ѯ��� ���Ȳ�����Ҫ��ѯ�ļ�¼��id
			String sql = "select * from student where id = ?";
			// 3�� ����Ԥ������󣬶�sql����Ƚ���Ԥ����
			ps = conn.prepareStatement(sql);
			// ֮�������ò���id
			ps.setInt(1, 1);
			// 4��ִ��sql��䲢�һ���һ����ѯ�Ľ����
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
