package com.sur.one23;

public class SecondLargest {

	public static int SecondLargestNumber(int [] a) {
		int size=a.length;
		
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				int max=a[i];
				if(a[i]<a[j]) {
					a[i]=a[j];
					a[j]=max;
				}
			}
		}
		/*
		 * for(int i=0;i<a.length;i++) { System.out.println(a[i]); }
		 */
		
		return a[1];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a= {1,2,34,5,6,7,23,31,32};
		
	
		System.out.println(SecondLargestNumber(a));
	}

}
