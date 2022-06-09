package com.sur.one29pattern;

public class DownwardTraingle {

	public static void downwardPyramid(int no) {
		for(int i=0;i<=no-1;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=i;k<=no-1;k++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
	
	public static void inversePyramid(int no) {
		for(int i=0;i<=no-1;i++) {
			for(int j=0;j<no-1-i;j++){
				System.out.print(" ");
		}
			for(int k=0;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
			}
			
	}
	public static void main(String[] args) {
		downwardPyramid(6);
		inversePyramid(5);

	}

}
