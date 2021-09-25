package com.java.learn.sub.set;

public class Teacher implements Comparable<Teacher> {
	// ����
	private String name = "";
	private int age = 0;
	private int salary = 0;

	// getters��setters����
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

	// ��дtoString()����
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", age=" + age + ", salary=" + salary
				+ "]";
	}

	// ���εĹ��췽��
	public Teacher(String name, int age, int salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	// ��дcompareTo()���� Ϊ��ӵ�TreeSet�з���
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

	// ��дhashCode()���� Ϊ��ӵ�HashSet�з���
	@Override
	public int hashCode() {
		// System.out.println("hashCode()���������ã�" + this.age + "--" + this.name);
		return (this.age + this.name.toLowerCase().hashCode()) * 31;
	}

	// ��дequals()���� Ϊ��ӵ�HashSet�з���
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
