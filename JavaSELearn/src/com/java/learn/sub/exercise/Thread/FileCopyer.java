package com.java.learn.sub.exercise.Thread;

import java.io.File;

public class FileCopyer {
	/**
	 * 把一个文件切成多份拷贝到目标路径
	 * 
	 * @param srcFile
	 *            源文件
	 * @param desPath
	 *            目标路径
	 * @param splitCount
	 *            切割的份数
	 * 
	 */

	public static void start(File srcFile, String desPath, int splitCount) {
		// 获取文件名
		String fileName = srcFile.getName();

		// 判断目标路径是否存在，不存在就新建
		File dFile = new File(desPath);
		if (!dFile.exists()) {
			dFile.mkdirs();

		}

		// 确定目标文件信息
		desPath = desPath + File.separator + fileName;

		// 为了表示文件没有拷贝完成，给文件加一个特殊的后缀
		String tFile = desPath;
		desPath += ".td";

		// 取得文件的长度
		long fileSize = srcFile.length();

		// 根据文件长度和切割份数，计算每一份的大小
		long perWorkerSize = fileSize / splitCount;

		// 计算出第一个工人的开始位置和结束位置
		long startPost = 0L;
		long endtPost = perWorkerSize;

		// 为了统计文件的拷贝进度，把多个工人放到一个数组中
		CopyThread[] cts = new CopyThread[splitCount];

		// 根据切割的份数，创建多个工人
		for (int i = 0; i < splitCount; i++) {
			String name = "工人-" + i;
			CopyThread ct = new CopyThread(startPost, endtPost, name, desPath,
					srcFile);
			cts[i] = ct;

			startPost = endtPost;
			endtPost = startPost + perWorkerSize;
			if (i == splitCount - 2) {
				endtPost = fileSize;
			}
		}

		// 创建统计进度的线程
		new ScheduleThread("统计进度线程", fileSize, cts, tFile);

	}

}
