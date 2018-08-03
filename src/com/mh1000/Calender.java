package com.mh1000;

import java.util.Scanner;

public class Calender {
	
	private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	private static final int[] LEAP_MAX_DAYS = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
//	서력 기원 연수가 4로 나누어떨어지는 해는 윤년으로 한다.(1988년, 1992년, 1996년, 2004년, 2008년, 2012년 …)
//	이 중에서 100으로 나누어떨어지는 해는 평년으로 한다.(1900년, 2100년, 2200년, 2300년, 2500년 …)
//	그중에 400으로 나누어떨어지는 해는 윤년으로 둔다.(1600년, 2000년, 2400년 …)	
	
	
	public boolean isLeapYear(int year) {
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
			return true;
		else
			return false;		
	}
	
	public int getMaxDays(int year, int month) {
		if (isLeapYear(year)) 
			return LEAP_MAX_DAYS[month-1];
		else 
			return MAX_DAYS[month-1];
	}

	public void PrintCal(int year, int month) {
		System.out.printf("    <<%4d년  %3d월>>\n", year, month);
		System.out.println(" SU MO TU WE TH FR ST");
		System.out.println("----------------------");
		
		int maxDay = getMaxDays(year, month);
		
		for(int i=1; i<=maxDay; i++) {
			System.out.printf("%3d", i);
			if( (i % 7) == 0) {
				System.out.println();
			}
		}
		
		System.out.println();
	}
}	