package com.sur.one29pattern;

import java.util.Scanner;

public class PyramidPattern {

	
	public static void pyramidPattern(int n) {
		for(int i=0;i<n;i++) {
			for(int j=n-i;j>0;j--) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void rightAngleTriangle(int n) {
		int row=n;
		for(int i=0;i<row;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void leftAngleTriangle(int n) {
		int row=n;
		for(int i=0;i<row;i++) {
			for(int j=n-i;j>0;j--) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("The pyramid ");
		pyramidPattern(n);
		System.out.println();
		System.out.println("The Righ Angle Triangle");
		rightAngleTriangle(n);
		System.out.println();
		System.out.println("The Left Angle Triangle");
		leftAngleTriangle(n);
		System.out.println();

	}

}
