package com.jdbc.test1;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {
	public static void main(String[] args) {
		Connection conn = null;
		Statement st = null;

		try {
			// 1����ȡ���Ӷ���
			conn = Conn.getConn();
			// 2����ȡ����
			st = conn.createStatement();
			// 3�������������
			String updateSql = "update student set age = 12 where id = 7";
			// ����һ�����д˲����Ľ����Ҫô�ɹ���Ҫôʧ�ܣ�������صĽ��>0���ǳɹ�����֮ʧ��
			int result = st.executeUpdate(updateSql);
			if (result > 0) {
				System.out.println("���³ɹ�");
			} else {
				System.out.println("����ʧ��");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
