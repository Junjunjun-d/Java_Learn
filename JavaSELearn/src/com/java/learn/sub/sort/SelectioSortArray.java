package com.java.learn.sub.sort;

public class SelectioSortArray {
	// 选择排序法排序数组
	public static int[] sortArray(int[] intArray) {

		for (int i = 0; i < intArray.length; i++) {
			int minIndex = i;
			for (int j = i + 1; j < intArray.length; j++) {
				if (intArray[j] < intArray[minIndex]) {
					minIndex = j;
				}

				if (minIndex != i) {
					int temp = intArray[i];
					intArray[i] = intArray[minIndex];
					intArray[minIndex] = temp;
				}
			}
		}
		return intArray;
	}

}
