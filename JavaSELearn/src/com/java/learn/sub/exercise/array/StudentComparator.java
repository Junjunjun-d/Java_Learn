package com.java.learn.sub.exercise.array;

import java.util.Comparator;

/**
 * 给学生按分数排名
 */

public class StudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getScores()<o2.getScores()){
			return 1;
		}
		if(o1.getScores()>o2.getScores()){
			return -1;
		}
		
		return o1.getName().compareToIgnoreCase(o2.getName());
	}

}
