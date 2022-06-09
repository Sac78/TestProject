package com.sur.one25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SortingProblem {

	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public static int[] createArray(int size) throws IOException {
		int[] a=new int[size];
		for(int i=0;i<size;i++) {
			a[i]=Integer.parseInt(br.readLine());
		}
		return a;
	}
	
public static int[] ascendingSort(int[] a) {
		
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
		// TODO Auto-generated method stub

		int [] a=createArray(5);
		a=ascendingSort(a);
		for(int i=0;i<a.length;i++ ) {
			System.out.print(a[i]+" ");
		}
	}

}
