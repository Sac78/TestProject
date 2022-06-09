package com.sac.date06_03_2022;

public class NonRepating {

	public static void main(String[] args) {
		
		String str1="ssaachindass";
		int distict_count=0;

		for(int i=0;i<str1.length()-1;i++) {
			if(str1.charAt(i)!=str1.charAt(i+1)) {
			distict_count++;
			}
			else {
				break;
			}
		}
		if(distict_count==0) {
			System.out.println("There is no first non repeating character");
		}
		else if(distict_count==str1.length()-1) {
			System.out.println("No two elements are repating");
		}
		else if(distict_count<=str1.length()) {
			System.out.println(str1.charAt(distict_count-1));
		}
		
	}

}
