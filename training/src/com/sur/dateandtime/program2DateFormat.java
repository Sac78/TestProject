package com.sur.dateandtime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class program2DateFormat {

	public static void main(String[] args) throws ParseException {
		
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the date");
		String str=sc.nextLine();
		Date date=sdf.parse(str);
		System.out.println(date.toString());

		
	}

}
