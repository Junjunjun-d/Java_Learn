package com.java.learn.sub.exercise.array;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * 
 * @author Administrator
 * Exam 类  考试类
 * 属性：若干学生  一张考卷
 * 提示：学生采用HashMap存放
 * 
 * 问题：为Exam类添加一个方法，用来为所有学生判卷，并打印成绩排名(名次、姓名)
 */
public class Exam {
	private Set<Student> set = new HashSet<Student>();
	private Paper pp = new Paper();

	// 打印学生考试成绩排名而准备的treeset
	private TreeSet<Student> tSet = new TreeSet<Student>(
			new StudentComparator());


	public Set<Student> getSet() {
		return set;
	}

	public void setSet(Set<Student> set) {
		this.set = set;
	}

	public Paper getPp() {
		return pp;
	}

	public void setPp(Paper pp) {
		this.pp = pp;
	}

	public Exam() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Exam(Set<Student> set, Paper pp) {
		super();
		this.set = set;
		this.pp = pp;
	}

	// 判卷
	public void judge() {
		// 取出试卷中存放题目的map集合
		Map<String, Question> map1 = pp.gethMap();

		// 遍历考试中的set集合，取出每个学生，为每个学生判卷
		for (Student s : set) {
			int sumScore = 0;//学生成绩
			// 取出学生答卷
			AnswerSheet as = s.getAw();
			// 取出答卷中存放的答题结果的map集合，key是题号 value是答案
			Map<String, String> map2 = as.gethMap();

			// 为了遍历学生所有的答题结果，而取出的所有题号的set集合
			Set<String> set1 = map2.keySet();
			Iterator<String> it1 = set1.iterator();
			while (it1.hasNext()) {
				
				
				// 学生回答问题的题号
				String qNo = it1.next();

				// 取出学生该题号的答案
				String qAnswer = map2.get(qNo);

				// 从试卷中取出改题号对应的question
				Question question = map1.get(qNo);

				// 取出该题目的做正确答案
				String correct = question.getCorrectAnswer();

				if (correct.equalsIgnoreCase(qAnswer)) {
					sumScore += question.getScore();
				}
			}

			// 设置学生的考试成绩
			s.setScores(sumScore);
			// 为了统计学生排名，把判好分的学生添加的treeset集合中
			tSet.add(s);
		}
	}

	// 打印考试排名
	public void printScore() {
		int mingCi = 1;

		for (Student s : tSet) {
			System.out.println("第" + mingCi + "名: " + s.toString());
			mingCi++;
		}
	}

}
