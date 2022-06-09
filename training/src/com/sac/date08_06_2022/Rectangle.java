package com.sac.date08_06_2022;

import java.util.Scanner;

public class Rectangle  extends Area{
Scanner sc=new Scanner(System.in);
	@Override
	public void getArea() {
		System.out.println("Enter the length");
		int length=sc.nextInt();
		System.out.println("Enter the breadth");
		int breadth=sc.nextInt();
		
		System.out.println("The area of rectangle is "+(length*breadth));
		
	}

}
