package com.java.learn.sub.exercise.Thread;

import java.io.File;

public class FileCopyer {
	/**
	 * ��һ���ļ��гɶ�ݿ�����Ŀ��·��
	 * 
	 * @param srcFile
	 *            Դ�ļ�
	 * @param desPath
	 *            Ŀ��·��
	 * @param splitCount
	 *            �и�ķ���
	 * 
	 */

	public static void start(File srcFile, String desPath, int splitCount) {
		// ��ȡ�ļ���
		String fileName = srcFile.getName();

		// �ж�Ŀ��·���Ƿ���ڣ������ھ��½�
		File dFile = new File(desPath);
		if (!dFile.exists()) {
			dFile.mkdirs();

		}

		// ȷ��Ŀ���ļ���Ϣ
		desPath = desPath + File.separator + fileName;

		// Ϊ�˱�ʾ�ļ�û�п�����ɣ����ļ���һ������ĺ�׺
		String tFile = desPath;
		desPath += ".td";

		// ȡ���ļ��ĳ���
		long fileSize = srcFile.length();

		// �����ļ����Ⱥ��и����������ÿһ�ݵĴ�С
		long perWorkerSize = fileSize / splitCount;

		// �������һ�����˵Ŀ�ʼλ�úͽ���λ��
		long startPost = 0L;
		long endtPost = perWorkerSize;

		// Ϊ��ͳ���ļ��Ŀ������ȣ��Ѷ�����˷ŵ�һ��������
		CopyThread[] cts = new CopyThread[splitCount];

		// �����и�ķ����������������
		for (int i = 0; i < splitCount; i++) {
			String name = "����-" + i;
			CopyThread ct = new CopyThread(startPost, endtPost, name, desPath,
					srcFile);
			cts[i] = ct;

			startPost = endtPost;
			endtPost = startPost + perWorkerSize;
			if (i == splitCount - 2) {
				endtPost = fileSize;
			}
		}

		// ����ͳ�ƽ��ȵ��߳�
		new ScheduleThread("ͳ�ƽ����߳�", fileSize, cts, tFile);

	}

}
