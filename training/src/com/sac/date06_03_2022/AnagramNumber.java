package com.sac.date06_03_2022;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class AnagramNumber {
	
	public static void isAnagramNumber(String str1,String str2) {
		
boolean isFlag=false;
char[] ch1=str1.toCharArray();
			char[] ch=str2.toCharArray();
			Arrays.sort(ch);
			Arrays.sort(ch1);
		
			
			
			
			String s1=	Arrays.toString(ch);
		String s2=	Arrays.toString(ch1);
		
		
		
		
		
		if(s1.contains(s2)) {
			isFlag=true;
		}
		/*
		 * for(int i=0;i<ch.length;i++) { for(int j=0;j<ch1.length;j++) {
		 * if(ch[i]!=ch1[j]) { isFlag=false; } } }
		 */
			if(isFlag) {
				System.out.println("Its Anagram ");
			}
			else {
				System.out.println("Its not a anagram");
			}
		}
	

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string s1");
		String s1=reader.readLine();
		System.out.println("Enter the String s2");
		String s2=reader.readLine();
		isAnagramNumber(s1, s2);
	}

}
