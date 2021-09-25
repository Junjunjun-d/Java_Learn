package com.java.learn.sub.student;

public class Student {
	//初始化
	private int age = 10;
	private String name = "小明";
	
	//创建方法以供调用在这使用其对属性进行操作，赋值或者获取值
	public void setAge(int _age){
		if(_age < 0 || _age > 130){
			System.out.println(_age + " 不是有效的年龄");
		}else {
			age = _age;
		}	
	}
	
	public int getAge(){
		return age;
	}
	
	public void setName(String _name){
		name = _name;
	}
	
	public String getName(){
		return name;
	}
	
	//无参构造方法:也可以不构建，系统会默认构建
	//特点: 1.没有任何的返回类型; 2. 构造方法名必须和类名一致
	public Student() {
		System.out.println("无参数的构造方法");
	}
	
	//有参构造方法: 同一个勒种可以有多个构造方法，但是参数的个数，类型和顺序必须不一样(同名不同参)
	public Student(String _name, int _age) {
		System.out.println("有参数的构造方法");
		
		//这里如果没有赋值而初始化有值时,再被调用时如果传参是不起作用的
		name = _name;
		age = _age;
		
	}
	
	public String study(String className) {
		return name + "在学习 " + className + "课程, 他今年的年龄是: " + age;

	}
}
