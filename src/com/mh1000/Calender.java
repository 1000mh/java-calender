package com.mh1000;

import java.util.Scanner;

public class Calender {
	
	private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	public int getMaxDays(int a) {
		return MAX_DAYS[a-1];
	}
	
	public static void main(String[] args) {
		// 숫자 입력 받아 해당 달의 최대 일수 출력
		
		String PROMPT="cal> ";
		
		Scanner mon = new Scanner(System.in);
		int a = 0;
		
		while (true) {
			System.out.println("궁금한 월을 입력하시오");
			System.out.print(PROMPT);
			a = mon.nextInt();
			
			if(a < 0) {
				System.out.println("-1 입력하여 종료합니다.");
				break;
			}

			if(a > 12) {
				System.out.println("입력값을 초과하였습니다.");
				continue;
			}
			
			Calender cal = new Calender();
			System.out.printf("%d월은 %d일까지 있습니다.\n", a, cal.getMaxDays(a));	
		}
		System.out.println("끝");

	}

}
