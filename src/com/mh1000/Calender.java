package com.mh1000;

import java.util.Scanner;

public class Calender {
	
	private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	public int getMaxDays(int a) {
		return MAX_DAYS[a-1];
	}
	
	public static void main(String[] args) {
		// 숫자 입력 받아 해당 달의 최대 일수 출력
		
		Scanner mon = new Scanner(System.in);
		Calender cal = new Calender();
		System.out.println("궁금한 월을 입력하시오");
		int a = mon.nextInt();
		System.out.printf("%d월은 %d일까지 있습니다.", a, cal.getMaxDays(a));
		
				
	}

}
