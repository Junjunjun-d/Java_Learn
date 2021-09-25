package com.java.learn.sub.exercise.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class ArrayTestMethods {
	public static void test() {
		// 添加选项
		List<String> list1 = new ArrayList<String>();
		list1.add("1");
		list1.add("2");
		list1.add("3");
		list1.add("4");

		// 创建10题目
		Question q1 = new Question(1, 10, "sdasfafas", "2", list1);
		Question q2 = new Question(2, 10, "sda", "2", list1);
		Question q3 = new Question(3, 10, "sdasfsfafas", "2", list1);
		Question q4 = new Question(4, 10, "sdasffdfdfafas", "2", list1);
		Question q5 = new Question(5, 10, "sdasfdfdfdfafas", "2", list1);
		Question q6 = new Question(6, 10, "sdasffdeedxafas", "2", list1);
		Question q7 = new Question(7, 10, "sdasdfdfdffafas", "2", list1);
		Question q8 = new Question(8, 10, "sdasfaffssACXCas", "2", list1);
		Question q9 = new Question(9, 10, "sdasfaSSSfas", "2", list1);
		Question q10 = new Question(10, 10, "sdasXVZfafas", "2", list1);

		// 创建学生1答卷
		HashMap<String, String> map1 = new HashMap<String, String>();
		map1.put("1", "2");
		map1.put("2", "2");
		map1.put("3", "2");
		map1.put("4", "2");
		map1.put("5", "2");
		map1.put("6", "2");
		map1.put("7", "2");
		map1.put("8", "2");
		map1.put("9", "2");
		map1.put("10", "2");
		AnswerSheet answerSheet1 = new AnswerSheet(map1);

		// 创建学生2答卷
		HashMap<String, String> map2 = new HashMap<String, String>();
		map2.put("1", "2");
		map2.put("2", "1");
		map2.put("3", "1");
		map2.put("4", "1");
		map2.put("5", "2");
		map2.put("6", "2");
		map2.put("7", "2");
		map2.put("8", "2");
		map2.put("9", "2");
		map2.put("10", "2");
		AnswerSheet answerSheet2 = new AnswerSheet(map2);

		// 创建学生3答卷
		HashMap<String, String> map3 = new HashMap<String, String>();
		map3.put("1", "2");
		map3.put("2", "1");
		map3.put("3", "1");
		map3.put("4", "1");
		map3.put("5", "2");
		map3.put("6", "2");
		map3.put("7", "2");
		map3.put("8", "3");
		map3.put("9", "2");
		map3.put("10", "4");
		AnswerSheet answerSheet3 = new AnswerSheet(map3);

		// 创建一套试卷
		HashMap<String, Question> map = new HashMap<String, Question>();
		map.put("1", q1);
		map.put("2", q2);
		map.put("3", q3);
		map.put("4", q4);
		map.put("5", q5);
		map.put("6", q6);
		map.put("7", q7);
		map.put("8", q8);
		map.put("9", q9);
		map.put("10", q10);
		Paper pp = new Paper(map);

		// 创建学生
		Student s1 = new Student("s1", pp, answerSheet1);
		Student s2 = new Student("s2", pp, answerSheet2);
		Student s3 = new Student("s3", pp, answerSheet3);

		// 将学生添加到set中
		HashSet<Student> hashSet = new HashSet<Student>();
		hashSet.add(s1);
		hashSet.add(s2);
		hashSet.add(s3);

		// 创建一个考试
		Exam exam = new Exam(hashSet, pp);

		// 判卷
		exam.judge();
		// 打印排名
		exam.printScore();
	}
}
