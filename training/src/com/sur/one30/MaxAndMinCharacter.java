package com.sur.one30;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class MaxAndMinCharacter {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String");

		String str=sc.nextLine();
		
	 char []ch= str.toCharArray();
		Map<Character,Integer> map1=new  HashMap<Character, Integer>();
		for(int i=0;i<ch.length;i++) {
			int count=0;
			for(int j=0;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					count++;
				}
			}
			if(count>=0) {
				map1.put(ch[i], count);
			}
		}
		System.out.println(map1);
		
		Entry<Character, Integer> opt=map1.entrySet().stream().max((i,i1)->(i.getValue()>i1.getValue())?1:-1).get();
		
		System.out.println("The character that repeats maximum times "+opt.getKey()+" no of time is "+opt.getValue());

		Entry<Character, Integer> opt1=map1.entrySet().stream().min((i,i1)->(i.getValue()>i1.getValue())?1:-1).get();
		
		System.out.println("The character that repeats maximum times "+opt1.getKey()+" no of time is "+opt1.getValue());
		
		
	}

}
