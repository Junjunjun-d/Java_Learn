package com.java.learn.sub.exercise.array;

import java.util.HashMap;

/**
 * 
 * @author Administrator
 * AnswerSheet 类  答卷类
 * 属性：每道题的答案
 * 提示：答卷中每道题的答案采用HashMap存放， key为String 表示题号   value为学生的答案
 */
public class AnswerSheet {
	private HashMap<String, String> hMap;// 每道题的答案

	public HashMap<String, String> gethMap() {
		return hMap;
	}

	public void sethMap(HashMap<String, String> hMap) {
		this.hMap = hMap;
	}

	public AnswerSheet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AnswerSheet(HashMap<String, String> hMap) {
		super();
		this.hMap = hMap;
	}

}
