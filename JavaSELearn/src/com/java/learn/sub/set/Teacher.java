package com.java.learn.sub.set;

public class Teacher implements Comparable<Teacher> {
	// 属性
	private String name = "";
	private int age = 0;
	private int salary = 0;

	// getters和setters方法
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	// 重写toString()方法
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", age=" + age + ", salary=" + salary
				+ "]";
	}

	// 带参的构造方法
	public Teacher(String name, int age, int salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	// 重写compareTo()方法 为添加到TreeSet中服务
	@Override
	public int compareTo(Teacher o) {
		if (this.age > o.getAge()) {
			return 1;
		}

		if (this.age < o.getAge()) {
			return -1;
		}
		
		if (this.salary > o.getSalary()) {
			return 1;
		}

		if (this.salary < o.getSalary()) {
			return -1;
		}
		
		if (this.name.compareToIgnoreCase(o.getName()) > 0) {
			return 1;
		}

		if (this.name.compareToIgnoreCase(o.getName()) < 0) {
			return -1;
		}

		return 0;
	}

	// 重写hashCode()方法 为添加到HashSet中服务
	@Override
	public int hashCode() {
		// System.out.println("hashCode()方法被调用：" + this.age + "--" + this.name);
		return (this.age + this.name.toLowerCase().hashCode()) * 31;
	}

	// 重写equals()方法 为添加到HashSet中服务
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (obj instanceof Teacher) {
			Teacher t = (Teacher) obj;
			if (this.age == t.age && this.name.equalsIgnoreCase(t.name)) {
				return true;
			}

		}
		return false;
	}
}
