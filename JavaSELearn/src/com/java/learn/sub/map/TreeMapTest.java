package com.java.learn.sub.map;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {
	public static void testTreeMap() {
		Map<String, String> treeMap = new TreeMap<String, String>();
		treeMap.put("aa", "map01");
		treeMap.put("cc", "map02");
		treeMap.put("hh", "map03");
		treeMap.put("ff", "map04");
		treeMap.put("ww", "map05");
		treeMap.put("kk", "map06");
		treeMap.put("aa", "map07");

		System.out.println("============foreach=============");
		Collection<String> dd = treeMap.values();
		for (String string : dd) {
			System.out.println(string);
		}

		System.out.println("============Iteartor keySet()=============");
		Set<String> set = treeMap.keySet();
		Iterator<String> it1 = set.iterator();
		while (it1.hasNext()) {
			String kString1 = it1.next();
			String vString1 = treeMap.get(kString1);
			System.out.println("key= " + kString1 + " value= " + vString1);
		}

		System.out.println("============Iteartor entrySet()=============");
		Set<Entry<String, String>> set2 = treeMap.entrySet();
		Iterator<Entry<String, String>> it2 = set2.iterator();
		while (it2.hasNext()) {
			Entry<String, String> entry = it2.next();
			String kString2 = entry.getKey();
			String vString2 = entry.getValue();
			System.out.println("key= " + kString2 + " value= " + vString2);
		}
	}
}
