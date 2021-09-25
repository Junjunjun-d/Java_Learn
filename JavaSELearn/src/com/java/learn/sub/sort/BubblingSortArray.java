package com.java.learn.sub.sort;

public class BubblingSortArray {
	// Ã°Åİ·¨ÅÅĞòÊı×é
	public static int[] sortArray(int[] intArray) {

		for (int i = 0; i < intArray.length - 1; i++) {
			for (int j = 0; j < intArray.length - 1 - i; j++) {
				int temp;
				if (intArray[j] > intArray[j + 1]) {
					temp = intArray[j];
					intArray[j] = intArray[j + 1];
					intArray[j + 1] = temp;
				}
			}
		}
		return intArray;
	}
}
