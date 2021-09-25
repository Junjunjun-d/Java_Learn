package com.java.learn.sub.exercise.Thread;

import java.io.File;
import java.text.DecimalFormat;

public class ScheduleThread extends Thread {
	private long fileSize;// 文件大小
	private CopyThread[] cts;// 参访拷贝线程的数组
	private String realFileName;// 拷贝文件的真实文件名

	public ScheduleThread(String name, long fileSize, CopyThread[] cts,
			String realFileName) {
		super(name);
		this.fileSize = fileSize;
		this.cts = cts;
		this.realFileName = realFileName;
		this.start();

	}

	/**
	 * 取得所有的拷贝线程的总量
	 * 
	 * @return
	 */
	private long getTotalCopyedSize() {
		long totalSize = 0L;
		for (CopyThread ct : cts) {
			totalSize += ct.getCopyedSize();
		}
		return totalSize;
	}

	public void run() {
		// 为了将下载进度显示成xx.x%的形式，要使用DecimalFormat
		DecimalFormat df = new DecimalFormat("##.0%");

		while (true) {
			// 取得所有拷贝线程的工作量
			long totalSize = getTotalCopyedSize();

			// 拷贝进度 = 已拷贝大小、文件大小
			double schedule = (double) totalSize / (double) fileSize;

			String msg = df.format(schedule);
			System.out.println("文件的拷贝进度：" + msg);

			if (totalSize == fileSize) {
				break;
			}

			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		// 文件拷贝完成后，把我文件名改为真是名称
		File tempFile = new File(realFileName + ".td");
		File trueFile = new File(realFileName);
		System.out.println("重命名文件是否成功：" + tempFile.renameTo(trueFile));
		System.out.println(trueFile + "文件拷贝完成！");

	}
}
