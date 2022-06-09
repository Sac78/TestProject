package com.sur.one25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//wap  to reverse an array and frequency of element in the array,sort the ascending orders
public class ReverseArray {
	
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	public static int[] createArray(int size) throws IOException {
		int[] a=new int[size];
		for(int i=0;i<size;i++) {
			a[i]=Integer.parseInt(br.readLine());
		}
		return a;
	}

	public static void printReverseArray(int[] a) {

		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void printArray(int[] a) {
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the size of the array");
		int size=Integer.parseInt(br.readLine());
		
		int [] a=createArray(size);
		
		printArray(a);
		printReverseArray(a);
		
		
		
		

	}

}
