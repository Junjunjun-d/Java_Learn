package com.java.learn.sub.io.test1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {
	public static void test(String fileName) {
		FileOutputStream fos = null;
		try {
			// FileOutputStream(fileName,true)��true ����ʱ �ǿ�����ĩβд�룬 �޴˲���ʱ ֻ���ԭ����ɾ��
			// ����д��
			fos = new FileOutputStream(fileName, true);
			String str = "import com.java.learn.sub.io.test1.FileInputStreamTest1\n";
			
			byte[] b = str.getBytes();
			fos.write(b);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
