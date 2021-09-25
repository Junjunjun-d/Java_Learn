package com;

import java.util.Scanner;

/**
 * @Author: DZF
 * @Date: 2021年9月12日 下午9:54:10
 * @Description: com
 * @Version: 1.0
 */
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// char[] cArrays = {'A','E','I','O','U','a','e','i'，'o','u'}
		while (scanner.hasNext()) {
			String string = "AEIOUaeiou";
			CharSequence cInput = scanner.nextLine().subSequence(0, 0);

			if (string.contains(cInput)) {
				System.out.println("Vowel");
			} else {
				System.out.println("Consonant");
			}

		}
	}

}