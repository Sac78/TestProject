package com.sac.test;


import java.sql.Timestamp;
import java.util.Date;

public class TimeStampToDate {
	public static void main(String[] args) {
		Timestamp times=new Timestamp(2000,02,12,2,30,45,45);
		Timestamp time1=new Timestamp(System.currentTimeMillis());
		Date d=(Date) times.clone();
		System.out.println(d);
		Date d1=time1;
		System.out.println(d1);
	}}

