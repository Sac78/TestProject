package com.sur.one26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FloatToString {

	public static void main(String[] args) throws IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the Float values");
		
		Float f=Float.parseFloat(reader.readLine());
		
		String str=f.toString();
		System.out.println(str);
		
	}

}
