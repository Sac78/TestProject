package com.sac.date06_03_2022;

import java.util.Scanner;

public class CarOverTake {

	public static void carOverTake(int speed1honda,int speedeferrai,int fdelay) {
		int constant_distance1=speed1honda*fdelay;
		int constant_distance2=0;
		int minutes=0;
		if(speed1honda>speedeferrai) {
	
			System.out.println("The overtake is not possible");
		}
		else {
		while(constant_distance1>constant_distance2) {
		++minutes;
			constant_distance1+=speed1honda;
			constant_distance2+=speedeferrai;
		}
		System.out.println("The ferrari traveling at "+minutes+" ");
		System.out.println("The ferrai overtake at time "+(fdelay+minutes));
	}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Speed of the honda");
		int hSpeed=sc.nextInt();
		System.out.println("Speed of the ferrari");
		int fSpeed=sc.nextInt();
		System.out.println("Time ahead of the ferrai");
		int fDelay=sc.nextInt();
		
		carOverTake(hSpeed, fSpeed, fDelay);
		
		
		

	}

}
