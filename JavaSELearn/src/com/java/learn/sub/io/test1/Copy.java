package com.java.learn.sub.io.test1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy {
	/**
	 * ִ���ļ��Ŀ�������
	 * @param srcName  Դ�ļ�
	 * @param desName  Ŀ���ļ�
	 */
	public static void test1(String srcName, String desName) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		long startTime = System.currentTimeMillis();
		try {
			// ��ʼ���ͼ���
			fis = new FileInputStream(srcName);
			fos = new FileOutputStream(desName, true);

			int fileSize = fis.available();// ��ȡ�ļ���С
			// System.out.println("==============" + fileSize);

			int i = 0;
			byte[] b = new byte[fileSize];
			while ((i = fis.read(b)) != -1) {

				fos.write(b, 0, i);
			}

			long endTime = System.currentTimeMillis();
			long usedTime = endTime - startTime;

			System.out.println(desName + " Copy Successfully, Used Time is "
					+ usedTime / 1000.0 + "s");
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

	/**
	 * ִ���ļ��Ŀ�������
	 * @param srcFile  File��ʽ��Դ�ļ�    
	 * @param desPath  Ŀ���ļ���·��
	 */
	public static void test2(File srcFile, String desPath) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		long startTime = System.currentTimeMillis();
		try {
			// ��ȡԴ�ļ����ļ���
			String srcName = srcFile.getName();

			// ȷ��Ŀ���ļ�����Ϣ
			String desFile = desPath + File.separator + srcName;

			// ��ʼ���ͼ���
			fis = new FileInputStream(srcFile);
			fos = new FileOutputStream(desFile, true);

			int fileSize = fis.available();// ��ȡ�ļ���С
			// System.out.println("==============" + fileSize);

			int i = 0;
			byte[] b = new byte[fileSize];
			while ((i = fis.read(b)) != -1) {

				fos.write(b, 0, i);
			}

			long endTime = System.currentTimeMillis();
			long usedTime = endTime - startTime;

			System.out.println(desFile + " Copy Successfully, Used Time is "
					+ usedTime / 1000.0 + "s");
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

	/**
	 * ִ���ļ��Ŀ�������  ʹ�ø߼��� : ʹ�ø���Ļ��� ���ٴ��̶�д���������Ч��
	 * BufferedInputStream��BufferedOutputStream
	 * @param srcFile  File��ʽ��Դ�ļ�    
	 * @param desPath  Ŀ���ļ���·��
	 */
	public static void test3(File srcFile, String desPath) {
		// �ͼ���
		FileInputStream fis = null;
		FileOutputStream fos = null;
		// �߼���
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
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
			byte[] b = new byte[1024 * 1024];// 1m
			while ((i = bis.read(b)) != -1) {
				bos.write(b, 0, i);
			}

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
}
