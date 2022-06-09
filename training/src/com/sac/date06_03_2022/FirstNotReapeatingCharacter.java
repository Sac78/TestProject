package com.sac.date06_03_2022;

public class FirstNotReapeatingCharacter {

	 public static void main(String[] args) {

	        String s = "sachinn";
	        for(Character ch:s.toCharArray()) {
	            if(s.indexOf(ch) == s.lastIndexOf(ch)) {
	                System.out.println("First non repeat character = " + ch);
	                break;
	            }
	        }
	    }
	
	
}
