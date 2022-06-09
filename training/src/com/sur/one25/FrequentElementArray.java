package com.sur.one25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FrequentElementArray {

	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	
	/*
	 * creating an array dynamically
*/
	public static Integer[] createArray(int size) throws IOException {
		Integer[] a=new Integer[size];
		for(int i=0;i<size;i++) {
			a[i]=Integer.parseInt(br.readLine());
		}
		return a;
	}
	/*
	 * printing frequent elements 
	 * with counts
	 */
	
	public static void printFrequentElements(Integer [] a) {
		for(int i=0;i<a.length;i++) {
			int count=1;
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j]&& (i!=j)) {
					count++;
					
				}
			}
			System.out.println(a[i]+"  count is "+count);
		}
	}

	/*
	 * public static void printFrequentElements1(int [] a,int[] unq) { for(int
	 * i=0;i<unq.length;i++) { int count=0; for(int j=0;j<a.length;j++) {
	 * if(unq[i]==a[j]) { count++;
	 * 
	 * } } System.out.println(unq[i]+"  count is "+count); } }
	 */
	
	/*
	 * Its ascending order format
	 * 
	 */
	public static Integer[] ascendingSort(Integer[] a) {
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
		}
		return a;
	}
	
	
	public static void main(String[] args) throws IOException {
	

		
		System.out.println("Enter the array size");
		int size=Integer.parseInt(br.readLine());
		
		Integer[] a=createArray(size);
		printFrequentElements(a);
		
		Integer[] unq=ascendingSort(a);
		
		for(int i=0;i<unq.length;i++) {
			System.out.print(unq[i]+" ");
		}
		System.out.println();
	Set<Integer> set1=new HashSet<Integer>(Arrays.asList(unq));
	Object [] obj=new ArrayList<Integer>(set1).toArray();
	
	for(int i=0;i<obj.length;i++) {
		Integer k=(Integer)obj[i];
		int count=0;
		for(int j=0;j<a.length;j++) {
			if(k==a[j]) {
				count++;
			}
		}
		
		System.out.println(k+" counts "+count);
	}
		
	 
		
		
		
		
		
		
		

	}

}
