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
	 * 执行文件的拷贝操作
	 * @param srcName  源文件
	 * @param desName  目标文件
	 */
	public static void test1(String srcName, String desName) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		long startTime = System.currentTimeMillis();
		try {
			// 初始化低级流
			fis = new FileInputStream(srcName);
			fos = new FileOutputStream(desName, true);

			int fileSize = fis.available();// 获取文件大小
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
	 * 执行文件的拷贝操作
	 * @param srcFile  File格式的源文件    
	 * @param desPath  目标文件的路径
	 */
	public static void test2(File srcFile, String desPath) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		long startTime = System.currentTimeMillis();
		try {
			// 获取源文件的文件名
			String srcName = srcFile.getName();

			// 确定目标文件的信息
			String desFile = desPath + File.separator + srcName;

			// 初始化低级流
			fis = new FileInputStream(srcFile);
			fos = new FileOutputStream(desFile, true);

			int fileSize = fis.available();// 获取文件大小
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
	 * 执行文件的拷贝操作  使用高级流 : 使用更大的缓存 减少磁盘读写次数，提高效率
	 * BufferedInputStream和BufferedOutputStream
	 * @param srcFile  File格式的源文件    
	 * @param desPath  目标文件的路径
	 */
	public static void test3(File srcFile, String desPath) {
		// 低级流
		FileInputStream fis = null;
		FileOutputStream fos = null;
		// 高级流
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		long startTime = System.currentTimeMillis();
		try {
			// 获取源文件的文件名
			String srcName = srcFile.getName();

			// 确定目标文件的信息
			String desFile = desPath + File.separator + srcName;

			// 初始化低级流
			fis = new FileInputStream(srcFile);
			fos = new FileOutputStream(desFile, true);

			// 初始化高级流
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);

			int fileSize = fis.available();// 获取文件大小
			// System.out.println("==============" + fileSize);

			int i = 0;
			// 控制一次读取的大小 缓存
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
