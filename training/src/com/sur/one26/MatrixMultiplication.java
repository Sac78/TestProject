package com.sur.one26;

import java.util.Scanner;

public class MatrixMultiplication {

	static Scanner sc=new Scanner(System.in);
	
	public static int[][] createMatrix(int rows,int columns){
int[][] mat1=new int[rows][columns];
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				mat1[i][j]=sc.nextInt();
			}
		}
		return mat1;
	}
	
	public static void printMatrix(int[][] mat1,int row,int columns) {
		for(int i=0;i<row;i++) {
			for(int j=0;j<columns;j++) {
				System.out.print(mat1[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		
		System.out.println("No of rows ");
		int rows=sc.nextInt();
		System.out.println("No of columns ");
		int columns=sc.nextInt();
		
		int[][] mat1=createMatrix(rows, columns);
		

		printMatrix(mat1, rows, columns);
		

		System.out.println("No of rows ");
		int rows1=sc.nextInt();
		System.out.println("No of columns ");
		int columns1=sc.nextInt();
		
		int[][] mat2=createMatrix(rows1, columns1);
		
		printMatrix(mat2, rows1, columns1);
		
		
		int[][] mat3=new int[rows][columns];
	for(int i=0;i<rows;i++) {
		for(int j=0;j<columns;j++) {
			for(int k=0;k<columns1;k++) {
			mat3[i][j]+=mat1[i][k]*mat2[k][j];
			}
		}
		}
	
	printMatrix(mat3, rows1, columns1);
		
		
	}

}
