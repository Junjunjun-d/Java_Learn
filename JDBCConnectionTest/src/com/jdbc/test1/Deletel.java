package com.jdbc.test1;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Deletel {
	public static void main(String[] args) {
		Connection conn = null;
		Statement st = null;

		try {
			// ��ȡ���Ӷ���
			conn = Conn.getConn();
			// ��ȡ����
			st = conn.createStatement();
			// ����ɾ�����
			String deleteSql = "delete from student where id = 7";
			// ��ȡ���
			int result = st.executeUpdate(deleteSql);
			if (result > 0) {
				System.out.println("ɾ���ɹ�");
			} else {
				System.out.println("ɾ��ʧ��");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
