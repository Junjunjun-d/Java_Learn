package com.java.learn.sub.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
	// ��һ�ַ�ʽ:�ʼ�뵽��������Set���ϵĲ����ظ��Խ���Ԫ�ع���
	public static Object[] oneClear(Object[] arr) {
		Set set = new HashSet();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		return set.toArray();
	}

	// �ڶ��ַ�ʽ:Ҫ�뱣��ԭ�����˳���ʹ����˳�򡢲��ظ��ص������Ĺ�ϣ����
	public static Object[] twoClear(Object[] arr) {
		LinkedHashSet<Object> temp = new LinkedHashSet<>();
		for (int i = 0; i < arr.length; i++) {
			temp.add(arr[i]);
		}
		return temp.toArray();
	}

	// �����ַ�ʽ:����һ��list���ϣ�Ȼ��������齫Ԫ�ط��뼯�ϣ�����contains()�����ж�һ���������Ƿ��Ѵ��ڸ�Ԫ�ؼ���
	public static Object[] threeClear(Object[] arr) {
		List list = new ArrayList();
		for (int i = 0; i < arr.length; i++) {
			if (!list.contains(arr[i])) {
				list.add(arr[i]);

			}
		}
		return list.toArray();
	}

	// �����ַ�ʽ:����ѭ������ԭ���飬Ȼ������ж��Ƿ��֮���Ԫ���ظ���ͬʱ����һ����ǣ������ֱ��Ƿ��ظ������ݱ�ǽ����ظ���Ԫ�ش���������
	public static Object[] fourClear(Object[] arr) {
		int t = 0;

		// ��ʱ����
		Object[] xinArr = new Object[arr.length];

		for (int i = 0; i < arr.length; i++) {
			// ������ǣ��Ƿ��ظ�
			boolean isRepeat = true;
			for (int j = i + 1; j < arr.length; j++) {
				// ������ظ�Ԫ�أ��������Ϊfalse
				if (arr[i] == arr[j]) {
					isRepeat = false;
					break;
				}
			}
			// ���Ϊtrue��ʾû���ظ�Ԫ��
			if (isRepeat) {
				xinArr[t] = arr[i];
				t++;
			}
		}
		// ȥ�غ�����
		Object[] newArr = new Object[t];
		System.arraycopy(xinArr, 0, newArr, 0, t);
		return newArr;
	}
}
