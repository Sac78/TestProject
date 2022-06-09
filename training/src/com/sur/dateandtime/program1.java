package com.sur.dateandtime;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
		      //define date format to take input
		      SimpleDateFormat dateF = new SimpleDateFormat("dd/MM/yyyy");

		      Scanner sc = new Scanner(System.in); //string object
		      String dtString1 = "", dtString2 = "";

		      System.out.print("Enter first date in dd/MM/yyyy format:");
		      dtString1 = sc.nextLine();
		      System.out.print("Enter second date in dd/MM/yyyy format:");
		      dtString2 = sc.nextLine();

		      //convert input date string into Date
		      Date dt1 = dateF.parse(dtString1);
		      Date dt2 = dateF.parse(dtString2);

		      System.out.println("First Date is: " + dt1.toString());
		      System.out.println("Second Date is: " + dt2.toString());
		      

		      if (dt1.after(dt2)) {
		        System.out.println(dt1.toString() + " is greater than " + dt2.toString());
		      } else if (dt1.before(dt2)) {
		        System.out.println(dt1.toString() + " is less than " + dt2.toString());
		      } else {
		        System.out.println(dt1.toString() + " is equal to " + dt2.toString());
		      }
		    } catch (Exception e) {
		      System.out.println("Exception is: " + e.toString());
		    }
		  }

	}


