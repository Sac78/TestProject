package com.sur.one23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemovalOfDulicateElement {

	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	public static Integer[] createArray(int size) throws NumberFormatException, IOException {
		
		Integer[] a=new Integer[size];
		for(int i=0;i<size;i++) {
			a[i]=Integer.parseInt(br.readLine());
		}
		return a;
		
	}
	public static Object[] removeDuplicateElement(Integer [] a) {
	 Set<Integer> set1=new HashSet<Integer>(Arrays.asList(a));
	
		
	 return set1.toArray();
		
	}
	public static void showArray(Object [] a) {
		for(int i=0;i<a.length;i++) {
			System.out.print(" "+a[i]+" ");
		}
		
	}
	public static void main(String[] args)  throws IOException{
		
		
		System.out.println("Enter the Size of the array : ");
		int size=Integer.parseInt(br.readLine());
		Integer [] b=createArray(size);
		 Object [] c= removeDuplicateElement(b);
		showArray(c);
		
		
		
		
		
		
		

	}

}
