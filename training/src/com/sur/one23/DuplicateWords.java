package com.sur.one23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateWords {

	public static String[] duplicateWord(String s) {
		String [] s1=s.split(" ");
		int size=s1.length;
		int k=0;
		String[] s2=new String[size];
		for(int i=0;i<size;i++) {
			int count=0;
			for(int j=0;j<size;j++) {
				if(s1[i].equals(s1[j])  &&(i!=j)) {
				count++;
				}
			}
			if(count>=1) {
				s2[k++]=s1[i];
			}
		}
		return s2;
	}
	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the String");
		String str=br.readLine();
		
		String[] s1=duplicateWord(str);
		
		Set<String> set= new HashSet<String>(Arrays.asList(s1));
		System.out.println(set);
		
	}

}
