package com.java.learn.sub.exercise.array;

/**
 * 
 * @author Administrator
 * Student 类 学生类
 * 属性： 姓名  一张答卷  一张考卷  学生的考试成绩
 * 
 */
public class Student {
	private String name;// 姓名
	private Paper pp = new Paper();// 一张考卷
	private AnswerSheet aw = new AnswerSheet();// 一张答卷
	private int scores;// 学生的考试成绩

	@Override
	public int hashCode() {
		return this.name.toLowerCase().hashCode() * 31;
	}

	@Override
	public boolean equals(Object obj){
		if(this == obj){
			return true;
		}
		if (obj instanceof Student) {
			Student student = (Student) obj;
			if (student.name.equalsIgnoreCase(this.name)) {
				return true;
			}
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Paper getPp() {
		return pp;
	}

	public void setPp(Paper pp) {
		this.pp = pp;
	}

	public AnswerSheet getAw() {
		return aw;
	}

	public void setAw(AnswerSheet aw) {
		this.aw = aw;
	}

	public int getScores() {
		return scores;
	}

	public void setScores(int scores) {
		this.scores = scores;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, Paper pp, AnswerSheet aw) {
		super();
		this.name = name;
		this.pp = pp;
		this.aw = aw;
	}

	@Override
	public String toString() {
		return name + " 成绩: " + this.scores;
	}
}
