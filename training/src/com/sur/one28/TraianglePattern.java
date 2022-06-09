package com.sur.one28;

import java.util.Scanner;

public class TraianglePattern {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the rows");
		int rows=sc.nextInt();
		int gap=rows-1;
		
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<rows;j++) {
				if(j<gap) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
			gap--;
		}

}
}