package com.sac.test;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap1 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("sac", 1);
		map.put("hin", 2);
		map.put("das", 3);
		map.put("sach", 4);

		/*
		 * Hash map iteration using while loop
		 * 
		 */
		System.out.println("While loop iterator");
		Iterator itr = map.entrySet().iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("For loop iterator");
		Set<Entry<String, Integer>> set = map.entrySet();
		for (Entry<String, Integer> e : set) {
			System.out.println(e.getKey() + " " + e.getValue());
		}

	}

}
