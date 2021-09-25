package com.java.learn.sub.exercise.array;

/**
 * 
 * @author Administrator
 * Student �� ѧ����
 * ���ԣ� ����  һ�Ŵ��  һ�ſ���  ѧ���Ŀ��Գɼ�
 * 
 */
public class Student {
	private String name;// ����
	private Paper pp = new Paper();// һ�ſ���
	private AnswerSheet aw = new AnswerSheet();// һ�Ŵ��
	private int scores;// ѧ���Ŀ��Գɼ�

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
		return name + " �ɼ�: " + this.scores;
	}
}
