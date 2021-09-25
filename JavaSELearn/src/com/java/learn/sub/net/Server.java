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
			System.out.println("服务器以经启动，等待链接......");
			while (true) {

				Socket socket = ss.accept();

				// 获取客户端地址信息
				String clientAddr = ss.getInetAddress().getHostAddress();

				// 为了接收客户端发送的数据，要获取输入流
				InputStream is = socket.getInputStream();
				BufferedReader br = new BufferedReader(
						new InputStreamReader(is));
				String s = br.readLine();
				System.out.println("服务器接到" + clientAddr + "的数据是：" + s);
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
