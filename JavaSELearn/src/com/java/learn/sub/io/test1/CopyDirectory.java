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
			// 是文件时 直接拷贝到目标文件夹
			copyFile(srcFile, desPath);
			System.out.println(srcFile + "是一个文件 拷贝到目标文件夹");
		} else {
			// 是目录时,现在目标文件夹创建新的文件夹
			desPath = createDirectory(srcFile, desPath);

			File[] files = srcFile.listFiles();
			if (files.length > 0) {
				for (File f : files) {
					if (f.isFile()) {
						// 是文件时 直接拷贝到目标文件夹
						copyFile(f, desPath);
						System.out.println(f + "是一个文件 拷贝到目标文件夹");
					} else {
						copyDirectory(f, desPath);
					}
				}
			}

		}
	}

	// 拷贝
	public static void copyFile(File srcFile, String desPath) {
		// 低级流
		FileInputStream fis = null;
		FileOutputStream fos = null;
		// 高级流
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;

		// 开始时间
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
			byte[] b = new byte[1024 * 10];
			while ((i = bis.read(b)) != -1) {
				bos.write(b, 0, i);
			}
			bos.flush();// 刷新此缓冲的输出流。
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
		System.out.println(dFile + " 文件夹创建成功");
		return desPath;
	}

}
