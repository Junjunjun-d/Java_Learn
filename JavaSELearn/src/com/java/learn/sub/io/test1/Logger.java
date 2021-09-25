package com.java.learn.sub.io.test1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
	// 全局变量必须加static 否则无法被static修饰的方法使用
	private static String fileName = "D:\\log.txt";

	public static void log(Throwable t) {
		FileOutputStream fos = null;
		PrintStream ps = null;

		try {
			fos = new FileOutputStream(fileName, true);
			ps = new PrintStream(fos);
			// 获取打印时间
			String timeInfo = getTimeInfo();
			ps.print(timeInfo + "  ");

			t.printStackTrace(ps);
			ps.println();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

	public static void log(String msg) {
		FileOutputStream fos = null;
		PrintStream ps = null;

		try {
			fos = new FileOutputStream(fileName, true);
			ps = new PrintStream(fos);

			// 获取打印时间
			String timeInfo = getTimeInfo();
			ps.print(timeInfo + "  ");

			ps.println(msg);
			ps.println();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	private static String getTimeInfo() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		return sdf.format(date);
	}
}
