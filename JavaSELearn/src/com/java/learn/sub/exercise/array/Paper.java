package com.java.learn.sub.exercise.array;

import java.util.HashMap;

/**
 * 
 * @author Administrator
 * Paper ��  ������
 * ���ԣ���������
 * ��ʾ���������HashMap��ţ� keyΪString ��ʾ���   valueΪ�������
 */
public class Paper {
	private HashMap<String, Question> hMap;// ��������

	public HashMap<String, Question> gethMap() {
		return hMap;
	}

	public void sethMap(HashMap<String, Question> hMap) {
		this.hMap = hMap;
	}

	public Paper() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Paper(HashMap<String, Question> hMap) {
		super();
		this.hMap = hMap;
	}
}
