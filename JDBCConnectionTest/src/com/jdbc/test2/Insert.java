package com.jdbc.test2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement ps = null;

		try {
			// 1����ȡ���Ӷ���
			conn = Conn.getConn();

			// 2������������� ���ǲ����������ֵ
			String insertSql = "insert into student values(?, ?, ? )";
			// 3�� ����Ԥ������󣬶�sql����Ƚ���Ԥ����
			ps = conn.prepareStatement(insertSql);
			// 4��֮�������ò���
			ps.setInt(1, 7);
			ps.setString(2, "JACK");
			ps.setInt(3, 23);

			// 5������һ�����д˲����Ľ����Ҫô�ɹ���Ҫôʧ�ܣ�������صĽ��>0���ǳɹ�����֮ʧ��
			int result = ps.executeUpdate();
			if (result > 0) {
				System.out.println("��ӳɹ�");
			} else {
				System.out.println("���ʧ��");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
