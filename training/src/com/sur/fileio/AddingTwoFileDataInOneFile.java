package com.sur.fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class AddingTwoFileDataInOneFile {

	public static void main(String[] args)  throws IOException{
		PrintWriter pw=new PrintWriter("3.txt");
		BufferedReader reader=new BufferedReader(new FileReader("abc.txt"));
		
		String line=reader.readLine();

		while(line!=null) {
			pw.println(line);
			line=reader.readLine();
		}
		reader=new BufferedReader(new FileReader("now.txt"));
		String line1=reader.readLine();

		while(line1!=null) {
			pw.println(line1);
			line1=reader.readLine();
		}	
		pw.flush();
		reader.close();
		pw.close();
		
	}

}
