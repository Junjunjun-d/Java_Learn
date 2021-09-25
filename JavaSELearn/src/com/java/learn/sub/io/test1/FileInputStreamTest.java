package com.java.learn.sub.io.test1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest {

	public static void test(String fileName) {
		FileInputStream fis = null;

		try {
			fis = new FileInputStream(fileName);

			int fileSize = fis.available();// ��ȡ�ļ���С
			System.out.println("==============" + fileSize);

			int i = 0;
			byte[] b = new byte[fileSize];
			while ((i = fis.read(b)) != -1) {
				String str = new String(b, 0, i);// �ֽ�����ת�ַ���
				System.out.println(str);
				// System.out.println((char) i);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
