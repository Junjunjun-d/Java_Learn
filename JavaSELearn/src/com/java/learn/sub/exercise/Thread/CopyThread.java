package com.java.learn.sub.exercise.Thread;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class CopyThread extends Thread {
	private long startPost;// ��ʼ������λ��
	private long endPost;// ������λ��
	private long copyedPost;// �ѿ�����λ��
	private String name;// ���˵�����
	private String desFile;// Ŀ���ļ�
	private File srcFile;// Դ�ļ�

	/**
	 * �������˵Ĺ��췽��
	 * 
	 * @param startPost
	 *            ��ʼ������λ��
	 * @param endPost
	 *            ������λ��
	 * @param copyedPost
	 *            �ѿ�����λ��
	 * @param name
	 *            ���˵�����
	 * @param desFile
	 *            Ŀ���ļ�
	 * @param srcFile
	 *            Դ�ļ�
	 */
	public CopyThread(long startPost, long endPost, String name,
			String desFile, File srcFile) {
		super();
		this.startPost = startPost;
		this.endPost = endPost;
		this.name = name;
		this.desFile = desFile;
		this.srcFile = srcFile;

		this.copyedPost = startPost;// ��copyedPost��ֵ
		this.start();

	}

	public void run() {
		// ��/д�ļ��������
		RandomAccessFile rafi = null;
		RandomAccessFile rafo = null;

		try {
			rafi = new RandomAccessFile(srcFile, "r");
			rafo = new RandomAccessFile(desFile, "rw");

			rafi.seek(startPost);// ��ʼ����λ��
			rafo.seek(startPost);// ��ʼд��λ��

			// �����Զ��建����
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
