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

	/**
	 * @param cs
	 */
	public static char[] sortCharArray(char[] cs) {

		for (int i = 0; i < cs.length - 1; i++) {
			for (int j = 0; j < cs.length - 1 - i; j++) {
				char temp;
				if (cs[j] > cs[j + 1]) {
					temp = cs[j];
					cs[j] = cs[j + 1];
					cs[j + 1] = temp;
				}
			}
		}
		return cs;
		
	}
}
