package com.sur.one28;

import java.util.Scanner;

public class AdditionAndSubtractionMatrix {
	private static Scanner sc=new Scanner(System.in);

	public static int[][] createArray(int row,int column){
		
		int[][] a=new int[row][column]; 
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++) {
				a[i][j]=sc.nextInt();
			}
			
		}
		return a;
	}
	public static void  printArray(int [][] a){
		int row=a.length;
		int column=a[0].length;
		
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++) {
			System.out.print(	a[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
	public static int[][] additionOfMatrix(int[][]a,int[][] b){
		System.out.println("The addition of two matrix were");
		int row=a.length;
		int column=a[0].length;
		int row1=b.length;
		int column1=b[0].length;
		int [][] c=new int[row][column];
		if(row1==row && column==column1) {
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++) {
			c[i][j]=a[i][j]+b[i][j];
			}
			
		}
		}
		else {
			throw new RowAndColumnException("The row and column are not matching \n matrix 1 row "+row+" column "+column+"  \n matrix 2 row "+row1+" column "+column1);
		}
		return c;
		
		
		
	}
	public static int[][] subtracionOfMatrix(int[][]a,int[][] b){
		System.out.println("The addition of two matrix were");
		int row=a.length;
		int column=a[0].length;
		int row1=b.length;
		int column1=b[0].length;
		int [][] c=new int[row][column];
		if(row1==row && column==column1) {
			for(int i=0;i<row;i++){
				for(int j=0;j<column;j++) {
					c[i][j]=a[i][j]-b[i][j];
				}
				
			}
		}
		else {
			throw new RowAndColumnException("The row and column are not matching \n matrix 1 row "+row+" column "+column+"  \n matrix 2 row "+row1+" column "+column1);
		}
		return c;
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the rows");
		int row=sc.nextInt();
		System.out.println("Enter the column");
		int column=sc.nextInt();
		int[][] a=createArray(row, column);
		printArray(a);
		System.out.println("Enter the rows");
		int row1=sc.nextInt();
		System.out.println("Enter the column");
		int column1=sc.nextInt();
		int[][] b=createArray(row1, column1);
		printArray(b);
		
		int[][] c=additionOfMatrix(a, b);
		printArray(c);
		int[][] d=subtracionOfMatrix(a, b);
		printArray(d);
	}

}
