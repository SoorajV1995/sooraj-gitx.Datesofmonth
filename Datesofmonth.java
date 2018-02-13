package com.programming.challange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Datesofmonth {
	
	public static Date MonthStartDate(int day, int month, int year) {

		GregorianCalendar gc = new GregorianCalendar(year, month - 1, 1);
		Date monthStartdate = new Date(gc.getTime().getTime());
		return monthStartdate;
	}
	
	public static Date MonthEndDate(int day, int month, int year) {
		
		//End dates of each month where 0 is the placeholder.
		int[] daysInAMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		day = daysInAMonth[month];
		boolean isLeapYear = new GregorianCalendar().isLeapYear(year);
		
		//checking for leap year
		if (isLeapYear && month == 2) {
			day++;
		}
		
		GregorianCalendar gc = new GregorianCalendar(year, month - 1, day);
		Date monthEnddate = new Date(gc.getTime().getTime());
		return monthEnddate;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// Getting from and to date inputs
		
		System.out.println("Enter fromDate in dd format:");
		int fromDay = sc.nextInt();
		System.out.println("Enter fromMonth in mm format:");
		int fromMonth = sc.nextInt();
		System.out.println("Enter fromYear in yyyy format:");
		int fromYear = sc.nextInt();
		System.out.println("Enter toDate in mm format:");
		int toDay = sc.nextInt();
		System.out.println("Enter toMonth in mm format:");
		int toMonth = sc.nextInt();
		System.out.println("Enter toYear in mm format:");
		int toYear = sc.nextInt();
		
		sc.close();
		
		Date calculatedStartDate = MonthStartDate(fromDay, fromMonth, fromYear);
		Date calculatedEndDate = MonthEndDate(toDay, toMonth, toYear);
		
		//Get date in dd-MM-yyyy format

		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		String fromDatereturn = formatter.format(calculatedStartDate);
		String toDatereturn = formatter.format(calculatedEndDate);
		System.out.println("============================");
		System.out.println("FromDateReturn : " + fromDatereturn);
		System.out.println("ToDateReturn : " + toDatereturn);
		System.out.println("============================");
	}

}
