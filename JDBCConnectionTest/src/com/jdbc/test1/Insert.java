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
			// 1����ȡ���Ӷ���
			conn = Conn.getConn();

			// 2����ȡ����
			// st = conn.createStatement();//1.ʹ��StatementԤ����ģʽ
			// 3������������� String
			// insertSql = "insert into student values(7, 'jack', 25 )";

			String insertSql = "insert into student (id,name,age) values(?,?,?)";

			// ps = conn.prepareStatement(insertSql);//2.ʹ��PrepareStatementԤ����ģʽ

			cs = conn.prepareCall(insertSql);// 3.ʹ��CallableStatementԤ����ģʽ
			for (int i = 1; i <= 10000; i++) {
				cs.setInt(1, i + 10008);// �±��Ǵ�1��ʼ�Ķ�����0
				cs.setString(2, "name" + i);
				cs.setInt(3, 22);
				cs.addBatch();
			}

			cs.executeBatch();// ����ִ��

			// ����һ�����д˲����Ľ����Ҫô�ɹ���Ҫôʧ�ܣ�������صĽ��>0���ǳɹ�����֮ʧ��
			// int result = st.executeUpdate(insertSql);
			/*
			 * int result = ps.executeUpdate(); if (result > 0) {
			 * System.out.println("��ӳɹ�"); } else { System.out.println("���ʧ��");
			 * }
			 */
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
