package com.java.learn.sub.exercise.Thread;

import java.io.File;
import java.text.DecimalFormat;

public class ScheduleThread extends Thread {
	private long fileSize;// �ļ���С
	private CopyThread[] cts;// �ηÿ����̵߳�����
	private String realFileName;// �����ļ�����ʵ�ļ���

	public ScheduleThread(String name, long fileSize, CopyThread[] cts,
			String realFileName) {
		super(name);
		this.fileSize = fileSize;
		this.cts = cts;
		this.realFileName = realFileName;
		this.start();

	}

	/**
	 * ȡ�����еĿ����̵߳�����
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
		// Ϊ�˽����ؽ�����ʾ��xx.x%����ʽ��Ҫʹ��DecimalFormat
		DecimalFormat df = new DecimalFormat("##.0%");

		while (true) {
			// ȡ�����п����̵߳Ĺ�����
			long totalSize = getTotalCopyedSize();

			// �������� = �ѿ�����С���ļ���С
			double schedule = (double) totalSize / (double) fileSize;

			String msg = df.format(schedule);
			System.out.println("�ļ��Ŀ������ȣ�" + msg);

			if (totalSize == fileSize) {
				break;
			}

			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		// �ļ�������ɺ󣬰����ļ�����Ϊ��������
		File tempFile = new File(realFileName + ".td");
		File trueFile = new File(realFileName);
		System.out.println("�������ļ��Ƿ�ɹ���" + tempFile.renameTo(trueFile));
		System.out.println(trueFile + "�ļ�������ɣ�");

	}
}
