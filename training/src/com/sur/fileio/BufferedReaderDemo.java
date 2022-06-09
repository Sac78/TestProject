package com.sur.fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		FileReader fileReader=new FileReader("abc.txt");
	
		BufferedReader reader=new BufferedReader(fileReader); 

		String line=reader.readLine();
		while(line!=null) {
			System.out.println(line);
			line=reader.readLine();
		}
		reader.close();
		
	}

}
