package com.sur.dateandtime;

import java.time.LocalDate;

public class programs4DaysTodayTommoroow {

	public static void main(String[] args) {


		LocalDate id=LocalDate.now();
		LocalDate id1=id.minusDays(1);
		LocalDate id2=id.plusDays(1);
		System.out.println(id);
		System.out.println(id1);
		System.out.println(id2);

	}

}
