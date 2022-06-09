package com.sur.fileio;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("abc.txt",true);
		PrintWriter pw=new PrintWriter(fw);
		pw.println("Hello this is from  second PrintWriter");
		pw.println(35);
		pw.println(46.9);
		pw.flush();
		pw.close();

	}

}
