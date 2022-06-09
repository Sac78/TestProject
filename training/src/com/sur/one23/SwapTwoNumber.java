package com.sur.one23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwapTwoNumber {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the two number");
		int i=Integer.parseInt(br.readLine());
		int j=Integer.parseInt(br.readLine());
		
		System.out.println("Before the Swapping \n i = "+i+"\n j = "+j);
		i=i+j;
		j=i-j;
		i=i-j;

		System.out.println("After the Swapping \n i = "+i+"\n j = "+j);
		

	}

}
