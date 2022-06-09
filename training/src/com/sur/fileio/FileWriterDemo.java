package com.sur.fileio;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw=new FileWriter("abc.txt",true);
		fw.write("I am doing fine \n");
		fw.flush();
	//	fw.close();
		
		fw.write(78);
		char[] ch1={'a','b','c','d','e'};
		fw.write(ch1);
		fw.flush();
		fw.close();
		FileReader reader=new FileReader("abc.txt");
		int code=reader.read();
		while(code!=-1) {
			System.out.print((char)code);
			code=reader.read();
		}

	}

}
