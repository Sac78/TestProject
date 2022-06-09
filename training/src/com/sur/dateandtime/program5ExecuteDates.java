package com.sur.dateandtime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class program5ExecuteDates {

	  static BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
	  int month[] = {
	    0,
	    31,
	    28,
	    31,
	    30,
	    31,
	    30,
	    31,
	    31,
	    30,
	    31,
	    30,
	    31
	  };

	  //create function for checking Leap Year or not. 
	  int isLeap(int y) {
	    if ((y % 400 == 0) || ((y % 100 != 0) && (y % 4 == 0)))
	      return 29;
	    else
	      return 28;
	  }

	  // create function for checking date is valid or not.
	  boolean dateValidate(int d, int m, int y) {
	    month[2] = isLeap(y);
	    if (m < 0 || m > 12 || d < 0 || d > month[m] || y < 0 || y > 9999)
	      return false;
	    else
	      return true;
	  }

	  // this function calculate days between given dates. 
	  int dayno(int d, int m, int y) {
	    int dn = 0;
	    month[2] = isLeap(y);
	    for (int i = 1; i < m; i++) {
	      dn = dn + month[i];
	    }
	    dn = dn + d;
	    for (int i = 1; i < y; i++) {
	      if (isLeap(i) == 29)
	        dn = dn + 366;
	      else
	        dn = dn + 365;
	    }
	    return dn;
	  }

	  public static void main(String args[]) throws IOException {
		  program5ExecuteDates CD = new program5ExecuteDates();

	    // Enter the dates one by one.
	    System.out.print("Enter the first date in (dd/mm/yyyy) format: ");
	    String date1 = BR.readLine().trim();
	    int p, q;

	    // calculate the days.
	    p = date1.indexOf("/");
	    int d1 = Integer.parseInt(date1.substring(0, p));

	    //calculating the month
	    q = date1.lastIndexOf("/");
	    int m1 = Integer.parseInt(date1.substring(p + 1, q));

	    // calculating the year
	    int y1 = Integer.parseInt(date1.substring(q + 1));

	    System.out.print("Enter the second date in (dd/mm/yyyy) format: ");
	    String date2 = BR.readLine().trim();

	    p = date2.indexOf("/");
	    int d2 = Integer.parseInt(date2.substring(0, p));

	    q = date2.lastIndexOf("/");
	    int m2 = Integer.parseInt(date2.substring(p + 1, q));
	    int y2 = Integer.parseInt(date2.substring(q + 1));

	    // check for valid input of dates.
	    if (CD.dateValidate(d1, m1, y1) == true && CD.dateValidate(d2, m2, y2) == true) {
	      int a = CD.dayno(d1, m1, y1);
	      int b = CD.dayno(d2, m2, y2);

	      // print the final result.
	      System.out.print("Days between " + date1 + " " + " and " + date2 + " " + " is : " + Math.abs(a - b) + " days.");
	    } else
	      // otherwise invalid input of dates.
	      System.out.println("Invalid Dates...");
	  }
	}



