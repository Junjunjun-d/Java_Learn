package com.java.learn.sub.sort;

public class PrintOutIntArray {
	// ��ӡ����������
	public static void printArray(int[] intArray) {
		String arrayString = "[";
		for (int i = 0; i < intArray.length; i++) {
			arrayString = arrayString + intArray[i] + ",";
			System.out.println("��" + (i + 1) + "��Ԫ�ص�ֵ��:" + intArray[i]);
		}
		arrayString = arrayString.substring(0, arrayString.length() - 1) + "]";
		System.out.println("intArray[]�����Ԫ�ص�ֵ��:" + arrayString);
	}
}
