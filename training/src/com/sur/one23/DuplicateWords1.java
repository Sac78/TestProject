package com.sur.one23;

public class DuplicateWords1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="hello hello how hello doing you you doing";
		String[] s1=str.split(" ");
		String str2="";
		for(int i=0;i<s1.length;i++) {
	String s2=s1[i];
	
	if(!str2.contains(s2)) {
		str2=str2+s2+" ";
		
	}
		}
		
		System.out.println(str2);

	}

}
