package com.sur.fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class DeleltingTheDataAndStoreNew {

	public static void main(String[] args) throws IOException {
	PrintWriter writer=new PrintWriter("4.txt");
	BufferedReader br=new BufferedReader(new FileReader("3.txt"));
	String line=br.readLine();
	while(line!=null) {
		BufferedReader br1=new BufferedReader(new FileReader("abc.txt"));
		String target=br1.readLine();
		boolean flag=false;
		while(target!=null) {
			if(line.equals(target)) {
				flag=true;
				break;
			}
			target=br1.readLine();
			
		}
		if(!flag) {
		writer.println(line);
		}
	line=br.readLine();
	}

	writer.flush();
	}

}
