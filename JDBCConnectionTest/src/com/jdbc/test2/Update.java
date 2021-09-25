package com.jdbc.test2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement ps = null;

		try {
			// 1����ȡ���Ӷ���
			conn = Conn.getConn();
			// 2������������� ���ǲ����������ֵ
			String updateSql = "update student set name = ? where id = ?";
			// 3�� ����Ԥ������󣬶�sql����Ƚ���Ԥ����
			ps = conn.prepareStatement(updateSql);
			// 4��֮�������ò���
			ps.setInt(2, 7);
			ps.setString(1, "J3333");

			// 5������һ�����д˲����Ľ����Ҫô�ɹ���Ҫôʧ�ܣ�������صĽ��>0���ǳɹ�����֮ʧ��
			int result = ps.executeUpdate();
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
