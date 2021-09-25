package com.java.learn.sub.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		ServerSocket ss = null;
		try {
			ss = new ServerSocket(8080);
			System.out.println("�������Ծ��������ȴ�����......");
			while (true) {

				Socket socket = ss.accept();

				// ��ȡ�ͻ��˵�ַ��Ϣ
				String clientAddr = ss.getInetAddress().getHostAddress();

				// Ϊ�˽��տͻ��˷��͵����ݣ�Ҫ��ȡ������
				InputStream is = socket.getInputStream();
				BufferedReader br = new BufferedReader(
						new InputStreamReader(is));
				String s = br.readLine();
				System.out.println("�������ӵ�" + clientAddr + "�������ǣ�" + s);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (ss != null) {
					ss.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
