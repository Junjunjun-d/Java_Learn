package com.java.learn.sub.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
	// 第一种方式:最开始想到的是利用Set集合的不可重复性进行元素过滤
	public static Object[] oneClear(Object[] arr) {
		Set set = new HashSet();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		return set.toArray();
	}

	// 第二种方式:要想保持原数组的顺序就使用有顺序、不重复特点的链表的哈希集合
	public static Object[] twoClear(Object[] arr) {
		LinkedHashSet<Object> temp = new LinkedHashSet<>();
		for (int i = 0; i < arr.length; i++) {
			temp.add(arr[i]);
		}
		return temp.toArray();
	}

	// 第三种方式:创建一个list集合，然后遍历数组将元素放入集合，再用contains()方法判断一个集合中是否已存在该元素即可
	public static Object[] threeClear(Object[] arr) {
		List list = new ArrayList();
		for (int i = 0; i < arr.length; i++) {
			if (!list.contains(arr[i])) {
				list.add(arr[i]);

			}
		}
		return list.toArray();
	}

	// 第四种方式:两层循环遍历原数组，然后逐个判断是否和之后的元素重复，同时设立一个标记，用来分辨是否重复，根据标记将不重复的元素存入新数组
	public static Object[] fourClear(Object[] arr) {
		int t = 0;

		// 临时数组
		Object[] xinArr = new Object[arr.length];

		for (int i = 0; i < arr.length; i++) {
			// 声明标记，是否重复
			boolean isRepeat = true;
			for (int j = i + 1; j < arr.length; j++) {
				// 如果有重复元素，将标记置为false
				if (arr[i] == arr[j]) {
					isRepeat = false;
					break;
				}
			}
			// 标记为true表示没有重复元素
			if (isRepeat) {
				xinArr[t] = arr[i];
				t++;
			}
		}
		// 去重后数组
		Object[] newArr = new Object[t];
		System.arraycopy(xinArr, 0, newArr, 0, t);
		return newArr;
	}
}
