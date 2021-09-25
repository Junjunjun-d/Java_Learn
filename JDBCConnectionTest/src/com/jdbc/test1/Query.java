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
			// 1����ȡ���Ӷ���
			conn = Conn.getConn();
			// 2������statement���������ִ��SQL��䣡��
			st = conn.createStatement();
			// 3������sql��ѯ���
			String sql = "select * from student";
			// 4��ִ��sql��䲢�һ���һ����ѯ�Ľ����
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
