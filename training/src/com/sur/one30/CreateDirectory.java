package com.sur.one30;

import java.io.File;
import java.io.IOException;

public class CreateDirectory {

	public static void main(String[] args) throws IOException {
		File f=new File("now.txt");
		/*
		 * System.out.println(f.mkdir()); File f1=new
		 * File("D:\\spring-workspace","demo.txt");
		 * System.out.println(f1.createNewFile());
		 */
String[] str=		f.list();

System.out.println(f.length());


for(int i=0;i<str.length;i++) {
	System.out.println(str[i]);
}
	}

}
