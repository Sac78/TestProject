package com.sur.fileio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWithCharArray {

	public static void main(String[] args) throws IOException{


		File f=new File("abc.txt");
		FileReader fr=new FileReader(f);

		char[] ch=new char[(int)f.length()];
		fr.read(ch);
	
		for(char ch1:ch) {
			System.out.print(ch1);
		}
		
		FileWriter writer =new FileWriter(f,true);
		BufferedWriter br=new BufferedWriter(writer);
	br.write("hello what is this");
		br.newLine();
		br.write("Okay");
		br.flush();
		br.close();
	}

}
