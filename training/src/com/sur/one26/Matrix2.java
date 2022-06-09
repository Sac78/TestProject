package com.sur.one26;

import java.util.Scanner;

public class Matrix2 {

	public static void printMatrix(int[][] mat1,int row, int columns) {
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<columns;j++) {
				System.out.print(mat1[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row of 1st");
		int row1=sc.nextInt();
		System.out.println("Enter the columns of 1st");
		int column1=sc.nextInt();
		// creation of a multi array
		int[][] a=new int[row1][column1];
		System.out.println("enter the elements in the rows");
		for(int i=0;i<row1;i++) {
			for(int j=0;j<column1;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		printMatrix(a, row1, column1);
		System.out.println("Enter the row of 2nd");
		int row2=sc.nextInt();
		System.out.println("Enter the columns of 2nd");
		int column2=sc.nextInt();
		//creation of b multiarray
		int[][] b=new int[row2][column2];
		System.out.println("enter the elements in the rows");
		for(int i=0;i<row2;i++) {
			for(int j=0;j<column2;j++) {
				b[i][j]=sc.nextInt();
			}
		}
		printMatrix(b, row2, column2);
		System.out.println();
		if(row1==row2 && column1==column2) {
		int[][]	 mat3=new int[row1][column1];
			for(int i=0;i<row1;i++) {
				for(int j=0;j<column1;j++) {
					for(int k=0;k<row2;k++) {
					mat3[i][j]+=a[i][k]*b[k][j];
					}
				}
				}
			printMatrix(mat3,row1,column1);
			
		}
		else if(column1==row2) {
			int[][] mat3=new int[row1][column2];
			for(int i=0;i<row1;i++) {
				for(int j=0;j<column2;j++) {
					for(int k=0;k<row2;k++) {
					mat3[i][j]+=a[i][k]*b[k][j];
					}
				}
		}
			printMatrix(mat3,row1,column2);
	}
		
		
		

}
}
