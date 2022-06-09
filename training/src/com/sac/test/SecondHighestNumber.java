package com.sac.test;
import java.util.Scanner;
public class SecondHighestNumber {

	static Scanner sc = new Scanner(System.in);
	/* Creation of the array */
	public static int[] createArray(int size) {
		int[] a = new int[size];
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		return a;
	     }

	/*
	 * second largest number
	 * 
	 */
	public static int secLargeNo(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					int max = a[i];
					a[i] = a[j];
					a[j] = max;
				}
			}
		}
		return a[1];
	}

	public static void main(String[] args) {
		System.out.println("Enter the size");
		int size = sc.nextInt();

		int[] a = createArray(size);
		System.out.println(secLargeNo(a));
	}

}
