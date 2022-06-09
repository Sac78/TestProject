package com.sac.date06_03_2022;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Count {

	public static void main(String[] args) {
		Map<Character,Integer> map=new HashMap<Character, Integer>();
		
	String str="aabcdddd";
	String str2="";
	for(int i=0;i<str.length();i++) {
		int count=0;
		for(int j=0;j<str.length();j++) {
			if(str.charAt(i)==str.charAt(j)) {
			count++;
			}
		}
		map.put(str.charAt(i), count);
	}
	
System.out.println(map);

for(Entry<Character, Integer> entry: map.entrySet()) {
	if(entry.getValue()==1) {
		str2=str2+entry.getKey();
	}
	else {
		str2=str2+entry.getKey()+entry.getValue();
	}
	
}
System.out.println(str2);
 char[] ch2=str2.toCharArray();
 String st3="";
for(int i=0;i<ch2.length;i++) {
	if(Character.isLetter(ch2[i])) {
		st3+=ch2[i];
	}
	else if(Character.isDigit(ch2[i])) {
		String s1=ch2[i]+"";
		int no=Integer.parseInt(s1);
		for(int j=1;j<no;j++) {
			st3+=ch2[i-1];
		}
	}
}
System.out.println(st3);
	}
	

}
