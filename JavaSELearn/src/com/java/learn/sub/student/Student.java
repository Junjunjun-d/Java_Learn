package com.java.learn.sub.student;

public class Student {
	//��ʼ��
	private int age = 10;
	private String name = "С��";
	
	//���������Թ���������ʹ��������Խ��в�������ֵ���߻�ȡֵ
	public void setAge(int _age){
		if(_age < 0 || _age > 130){
			System.out.println(_age + " ������Ч������");
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
	
	//�޲ι��췽��:Ҳ���Բ�������ϵͳ��Ĭ�Ϲ���
	//�ص�: 1.û���κεķ�������; 2. ���췽�������������һ��
	public Student() {
		System.out.println("�޲����Ĺ��췽��");
	}
	
	//�вι��췽��: ͬһ�����ֿ����ж�����췽�������ǲ����ĸ��������ͺ�˳����벻һ��(ͬ����ͬ��)
	public Student(String _name, int _age) {
		System.out.println("�в����Ĺ��췽��");
		
		//�������û�и�ֵ����ʼ����ֵʱ,�ٱ�����ʱ��������ǲ������õ�
		name = _name;
		age = _age;
		
	}
	
	public String study(String className) {
		return name + "��ѧϰ " + className + "�γ�, �������������: " + age;

	}
}
