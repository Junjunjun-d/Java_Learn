package com.java.learn.sub.exercise.array;

import java.util.List;

/**
 * 
 * @author Administrator
 * Question ��  ������
 * ���ԣ����  ��Ŀ����   ����ѡ��  ��ȷ��   ����ķ���
 * ��ʾ�� ����ѡ����ArrayList
 */
public class Question {
	private int qn;// ���
	private int score;// ����ķ���
	private String describes;// ��Ŀ����
	private String correctAnswer;// ��ȷ��
	private List<String> al;// ����ѡ��

	public int getQn() {
		return qn;
	}

	public void setQn(int qn) {
		this.qn = qn;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getDescribes() {
		return describes;
	}

	public void setDescribes(String describes) {
		this.describes = describes;
	}

	public String getCorrectAnswer() {
		return correctAnswer;
	}

	public void setCorrectAnswer(String correctAnswer) {
		this.correctAnswer = correctAnswer;
	}

	public List<String> getAl() {
		return al;
	}

	public void setAl(List<String> al) {
		this.al = al;
	}

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Question(int qn, int score, String describes, String correctAnswer,
			List<String> al) {
		super();
		this.qn = qn;
		this.score = score;
		this.describes = describes;
		this.correctAnswer = correctAnswer;
		this.al = al;
	}

}
