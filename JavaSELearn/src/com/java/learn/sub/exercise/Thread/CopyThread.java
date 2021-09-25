package com.java.learn.sub.exercise.Thread;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class CopyThread extends Thread {
	private long startPost;// 开始拷贝的位置
	private long endPost;// 结束的位置
	private long copyedPost;// 已拷贝的位置
	private String name;// 工人的名字
	private String desFile;// 目标文件
	private File srcFile;// 源文件

	/**
	 * 拷贝工人的构造方法
	 * 
	 * @param startPost
	 *            开始拷贝的位置
	 * @param endPost
	 *            结束的位置
	 * @param copyedPost
	 *            已拷贝的位置
	 * @param name
	 *            工人的名字
	 * @param desFile
	 *            目标文件
	 * @param srcFile
	 *            源文件
	 */
	public CopyThread(long startPost, long endPost, String name,
			String desFile, File srcFile) {
		super();
		this.startPost = startPost;
		this.endPost = endPost;
		this.name = name;
		this.desFile = desFile;
		this.srcFile = srcFile;

		this.copyedPost = startPost;// 给copyedPost赋值
		this.start();

	}

	public void run() {
		// 读/写文件的随机流
		RandomAccessFile rafi = null;
		RandomAccessFile rafo = null;

		try {
			rafi = new RandomAccessFile(srcFile, "r");
			rafo = new RandomAccessFile(desFile, "rw");

			rafi.seek(startPost);// 开始读的位置
			rafo.seek(startPost);// 开始写的位置

			// 设置自定义缓冲区
			int i = 0;
			byte[] b = new byte[102 * 1024 * 8];

			while ((this.copyedPost < this.endPost)
					&& ((i = rafi.read(b)) != -1)) {
				if (copyedPost + i >= endPost) {
					i = (int) (endPost - copyedPost);
				}
				rafo.write(b, 0, i);
				copyedPost += i;
				Thread.sleep(20);

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			if (rafi != null) {
				try {
					rafi.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			if (rafo != null) {
				try {
					rafo.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public long getCopyedSize() {
		return this.copyedPost - this.startPost;
	}
}
