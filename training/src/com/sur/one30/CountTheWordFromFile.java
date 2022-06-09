package com.sur.one30;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountTheWordFromFile {

	public static void main(String[] args) throws IOException {
		String line="";
		int count=0;
		FileReader fr=new FileReader("now.txt");
		BufferedReader br=new BufferedReader(fr);
		while((line=br.readLine())!=null) {
			String [] words=line.split(" " );
			count+=words.length;
			
		}

		System.out.println("The count is "+count);
	}

}
