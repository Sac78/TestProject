package com.sur.one29pattern;

public class Rhombus {

	public static void rhombusPrint(int no) {
		for(int i=no-1;i>=0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=i;k<=no-1;k++) {
				System.out.print("*"+ " ");
			}
			System.out.println();
		}
		for(int i=1;i<no;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=i;k<=no-1;k++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		rhombusPrint(5);

	}

}
