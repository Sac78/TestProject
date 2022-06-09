package com.sac.test2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author STS171
 *
 */
public class ExceptionType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Map<String,String> amp=new HashMap<String, String>(); 
		  amp.put("Hello","Hello");
		  amp.put("World", "World");
		
			for(Map.Entry<String,String> entry: amp.entrySet()) { amp.remove("World"); }
			 
			System.out.println(amp);
				/*
				 * 
				 * Set<Integer> s=new HashSet<Integer>(); s.add(1); s.add(2); s.add(2);
				 * 
				 * for(Integer i:s) { s.add(8); } System.out.println(s);
				 */
	}

}
