package com.sur.date1_06;

import java.beans.Transient;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class FileDemo implements Serializable {

	private int i=10;
	private transient int j=20;
	
	
	@Override
	public String toString() {
		return "FileDemo [i=" + i + ", j=" + j + "]";
	}


	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

		FileDemo demo=new FileDemo();
		
		FileOutputStream os=new FileOutputStream("a.txt",true);
		ObjectOutputStream oos=new ObjectOutputStream(os);
		oos.writeObject(demo);
		
		FileInputStream is=new FileInputStream("a.txt");
		ObjectInputStream ois=new ObjectInputStream(is);
	FileDemo fd=	(FileDemo) ois.readObject();
	System.out.println(fd);
		}

}
