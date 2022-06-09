package com.sac.date08_06_2022;

import java.util.Scanner;

public class Triangle extends Area {

	Scanner sc=new Scanner(System.in);
	@Override
	public void getArea() {
		// TODO Auto-generated method stub
		System.out.println("Enter the radius");

		float radius=sc.nextFloat();
		float pie=3.14f;
		System.out.println("The area of the triangle "+(pie*radius*radius));
	}

}
