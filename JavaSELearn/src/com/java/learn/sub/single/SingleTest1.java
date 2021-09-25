package com.java.learn.sub.single;
/**
 * 
 * @author Administrator
 * ����ʽ
 */
public class SingleTest1 {
	// ˽�л����췽��
	private SingleTest1() {
	};

	// ˽�в���̬�������
	private static SingleTest1 singleTest = new SingleTest1();

	// ���干�в���̬�ķ��������ظö���
	public static SingleTest1 getTest() {

		return singleTest;
	}
}

/**
 * ����ʽ
 */
class SingleTest2 {
	// ˽�л����췽��
	private SingleTest2() {
	};

	// ˽�в���̬�������,���ǲ�����������
	private static SingleTest2 s = null;

	// ���干�в���̬�ķ��������ظö���
	public static SingleTest2 getSingleTest2() {
		if(s == null){
			s = new SingleTest2();
		}
		return s;
	}
}