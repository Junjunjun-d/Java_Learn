package com.jdbc.test2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Deletel {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement ps = null;

		try {
			// 1����ȡ���Ӷ���
			conn = Conn.getConn();
			// 2������ɾ����� ���ǲ����������ֵ
			String updateSql = "delete from student where id = ?";
			// 3�� ����Ԥ������󣬶�sql����Ƚ���Ԥ����
			ps = conn.prepareStatement(updateSql);
			// 4��֮�������ò���
			ps.setInt(1, 7);

			// 5������һ�����д˲����Ľ����Ҫô�ɹ���Ҫôʧ�ܣ�������صĽ��>0���ǳɹ�����֮ʧ��
			int result = ps.executeUpdate();
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
