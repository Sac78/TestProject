package com.sur.one29pattern;

public class SandBoxPattern {

	
	public static void sandBox(int n) {
		int row=n;
	for(int i=0;i<=row-1;i++) {
		for(int j=0;j<i;j++) {
			System.out.print(" ");
		}
		for(int k=i;k<=row-1;k++) {
			System.out.print("*"+" ");
		}
		System.out.println();
	}
	for(int i= row-1;i>0;i--) {
		for(int j=0;j<i;j++) {
			System.out.print(" ");
		}
		for(int k=i;k<=row-1;k++) {
			System.out.print("*"+" ");
		}
		System.out.println();
	}
	}
	public static void main(String[] args) {
		System.out.println();
		sandBox(6);
		

	}

}
