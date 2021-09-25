package com.java.learn.sub.exercise.array;

import java.util.List;

/**
 * 
 * @author Administrator
 * Question 类  试题类
 * 属性：题号  题目描述   若干选项  正确答案   该题的分数
 * 提示： 若干选项用ArrayList
 */
public class Question {
	private int qn;// 题号
	private int score;// 该题的分数
	private String describes;// 题目描述
	private String correctAnswer;// 正确答案
	private List<String> al;// 若干选项

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
