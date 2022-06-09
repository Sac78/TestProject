package com.sac.date03_06_2022;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Character, String> a=new HashMap<Character, String>();
		a.put('a', "sac");
		a.put('b', "hin");
		System.out.println("The orginal map is \n"+a);
		Map<String,Character> b=new HashMap<String, Character>();
		
		for(Map.Entry<Character, String> entry :a.entrySet()) {
			b.put(entry.getValue(), entry.getKey());
		}
		System.out.println("The reverse key and value \n"+b);
		
		

	}

}
