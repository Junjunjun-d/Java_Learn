package com.java.learn.sub.basic;

public class BytecodeConversion {

	public static String numberToByteCode(String[] cs) {

		String temp = "";
		for (String c : cs) {
			temp += (char) Integer.parseInt(c);
			// System.out.print((char) Integer.parseInt(c));
		}
		return temp;
	}

	public static String byteCodeToNnumber(String str) {
		byte[] bytestr = str.getBytes();
		String temp = "";
		for (int i = 0; i < bytestr.length; i++) {
			temp += bytestr[i] + " ";
		}
		return temp;

	}

}
