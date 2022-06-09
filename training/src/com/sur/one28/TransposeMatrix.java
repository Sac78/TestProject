package com.sur.one28;

import java.util.Scanner;

public class TransposeMatrix {

	private static Scanner sc=new Scanner(System.in);

	public static int[][] createArray(int row,int column){
		System.out.println("TransposeMatrix.createArray()");
		int[][] a=new int[row][column]; 
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++) {
				a[i][j]=sc.nextInt();
			}
			
		}
		return a;
	}
	public static void  printArray(int [][] a){
		System.out.println("TransposeMatrix.printArray()");
		int row=a.length;
		int column=a[0].length;
		
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++) {
			System.out.print(	a[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
	public static int[][] transposeMatrix(int[][] a){
		System.out.println("TransposeMatrix.transposeMatrix()");
		int row=a.length;
		int column=a[0].length;
		int [][] b=new int[column][row];
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				b[j][i]=a[i][j];
			}
		}
		/*
		 * int[][] transpose = new int[column][row]; for(int i = 0; i < row; i++) { for
		 * (int j = 0; j < column; j++) { transpose[j][i] = matrix[i][j]; }
		 */
		return b;
	}
	
	public static void oddAndEvenMatric(int[][] a) {
		System.out.println("TransposeMatrix.oddAndEvenMatric()");
		int row=a.length;
		int column=a[0].length;
		int even=0,odd=0;
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				if(a[i][j]%2==0) {
					even++;
				}
				else {
					odd++;
				}
			}
		}
		printArray(a);
		System.out.println("The even count on above matrix is "+even);
		System.out.println("The odd count of above matrix is "+odd);
	}
	public static void main(String[] args) {
		System.out.println("Enter the row ");
		int row=sc.nextInt();
		System.out.println("Enter the column");
		int column=sc.nextInt();
		
		int[][] c=createArray(row, column);
		printArray(c);
		int[][] b=transposeMatrix(c);

		printArray(b);
		
		oddAndEvenMatric(b);
	}

}
