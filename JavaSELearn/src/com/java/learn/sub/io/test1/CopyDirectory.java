package com.java.learn.sub.io.test1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDirectory {

	public static void copyDirectory(File srcFile, String desPath) {
		if (srcFile.isFile()) {
			// ���ļ�ʱ ֱ�ӿ�����Ŀ���ļ���
			copyFile(srcFile, desPath);
			System.out.println(srcFile + "��һ���ļ� ������Ŀ���ļ���");
		} else {
			// ��Ŀ¼ʱ,����Ŀ���ļ��д����µ��ļ���
			desPath = createDirectory(srcFile, desPath);

			File[] files = srcFile.listFiles();
			if (files.length > 0) {
				for (File f : files) {
					if (f.isFile()) {
						// ���ļ�ʱ ֱ�ӿ�����Ŀ���ļ���
						copyFile(f, desPath);
						System.out.println(f + "��һ���ļ� ������Ŀ���ļ���");
					} else {
						copyDirectory(f, desPath);
					}
				}
			}

		}
	}

	// ����
	public static void copyFile(File srcFile, String desPath) {
		// �ͼ���
		FileInputStream fis = null;
		FileOutputStream fos = null;
		// �߼���
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;

		// ��ʼʱ��
		long startTime = System.currentTimeMillis();

		try {
			// ��ȡԴ�ļ����ļ���
			String srcName = srcFile.getName();

			// ȷ��Ŀ���ļ�����Ϣ
			String desFile = desPath + File.separator + srcName;

			// ��ʼ���ͼ���
			fis = new FileInputStream(srcFile);
			fos = new FileOutputStream(desFile, true);

			// ��ʼ���߼���
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);

			int fileSize = fis.available();// ��ȡ�ļ���С
			// System.out.println("==============" + fileSize);

			int i = 0;
			// ����һ�ζ�ȡ�Ĵ�С ����
			byte[] b = new byte[1024 * 10];
			while ((i = bis.read(b)) != -1) {
				bos.write(b, 0, i);
			}
			bos.flush();// ˢ�´˻�����������
			long endTime = System.currentTimeMillis();
			long usedTime = endTime - startTime;

			System.out.println(desFile + " Copy Successfully, Used Time is "
					+ usedTime / 1000.0 + "s");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static String createDirectory(File srcFile, String desPath) {
		String dFile = srcFile.getName();
		desPath = desPath + File.separator + dFile;
		File file = new File(desPath);
		file.mkdir();
		System.out.println(dFile + " �ļ��д����ɹ�");
		return desPath;
	}

}
