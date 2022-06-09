package com.sur.practiceDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;

public class DateAndTime_1 {

	public static void main(String[] args) throws ParseException {
		/*
		 * SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy"); Scanner sc=new
		 * Scanner(System.in); System.out.println("enter the date"); String
		 * s1=sc.nextLine(); System.out.println("Enter the Second date"); String
		 * s2=sc.nextLine(); Date d=sdf.parse(s1); Date d1=sdf.parse(s2);
		 */
	
	Period p1=Period.between(LocalDate.of(1999, 02, 25), LocalDate.of(2022, 05, 26));
	
	System.out.println("the day : "+p1.getDays());
	System.out.println("the month : "+p1.getMonths());
	System.out.println("the year : "+p1.getYears());
	System.out.println("the chronology : "+p1.getChronology());
	System.out.println(LocalDate.now().getDayOfWeek());
	}

}
