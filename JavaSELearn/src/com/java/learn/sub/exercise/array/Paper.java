package com.java.learn.sub.exercise.array;

import java.util.HashMap;

/**
 * 
 * @author Administrator
 * Paper 类  考卷类
 * 属性：若干试题
 * 提示：试题采用HashMap存放， key为String 表示题号   value为试题对象
 */
public class Paper {
	private HashMap<String, Question> hMap;// 若干试题

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
