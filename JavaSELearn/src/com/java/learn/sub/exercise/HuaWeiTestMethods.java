package com.java.learn.sub.exercise;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class HuaWeiTestMethods {
	public static void mergeTableRecord() {
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNext()) {
			int size = scanner.nextInt();
			TreeMap<Integer, Integer> map = new TreeMap<>();
			for (int i = 0; i < size; i++) {
				int key = scanner.nextInt();
				int value = scanner.nextInt();
				if (map.containsKey(key)) {
					map.put(key, map.get(key) + value);
				} else {
					map.put(key, value);
				}
			}
			for (Map.Entry<Integer, Integer> n : map.entrySet()) {
				System.out.println(n.getKey() + " " + n.getValue());
			}
		}

	}
}
