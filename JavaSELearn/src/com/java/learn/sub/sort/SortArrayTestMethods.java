package com.java.learn.sub.sort;


public class SortArrayTestMethods {
	// ѡ�������ӡ���
	public static void selectionSort() {
		int[] intArray = { 9, 8, 2, 41, 36, 1 };
		PrintOutIntArray.printArray(SelectioSortArray.sortArray(intArray));
	}
	// ð�������ӡ���
	public static void bubblingSort() {
		PrintOutIntArray.printArray(SelectioSortArray.sortArray(GetRandomArray
				.getArrays()));
	}



}
