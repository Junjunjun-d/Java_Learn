package com.java.learn.sub.net;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) {
		Socket client = null;

		try {
			client = new Socket("192.168.1.1", 8080);

			OutputStream os = client.getOutputStream();
			PrintStream ps = new PrintStream(os);
			String string = "��������ã����ǿͻ���";
			ps.println(string);

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (client != null) {
					client.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
