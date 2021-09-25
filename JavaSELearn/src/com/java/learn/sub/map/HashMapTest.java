package com.java.learn.sub.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {
	public static void testHashMap() {
		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		// ��map��������ݣ� key��ͬʱ��valueֵ�ᱻ�������滻
		hashMap.put(5, "map05");
		hashMap.put(6, "map06");
		hashMap.put(1, "map01");
		hashMap.put(2, "map02");
		hashMap.put(3, "map03");
		hashMap.put(4, "map04");
		hashMap.put(1, "map07");
		
		System.out.println("============foreach=============");
		Collection<String> collection = hashMap.values();
		for (String string : collection) {
			System.out.println(string);
		}

		System.out.println("============Iterator  keySet() =============");
		Set<Integer> set = hashMap.keySet();// ��ȡmap�е�key�����ŵ�һ��set��
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			Integer key1 = it.next();
			String valueString1 = hashMap.get(key1);
			System.out.println("key= " + key1 + " value= " + valueString1);
		}

		System.out.println("============Iterator  entrySet()=============");
		Set<Entry<Integer, String>> set2 = hashMap.entrySet();// ��ȡmap�е�ʵ�壬key+value
															// ���Ž�set��
		Iterator<Entry<Integer, String>> it2 = set2.iterator();
		while (it2.hasNext()) {
			Entry<Integer, String> entry = it2.next();
			Integer key2 = entry.getKey();
			String valueString2 = entry.getValue();

			System.out.println("key= " + key2 + " value= " + valueString2);

		}

	}
}
