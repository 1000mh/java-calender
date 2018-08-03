package com.mh1000;

import java.util.Scanner;

public class Prompt {
	
	public int parseDay(String week) {
		if(week.equals("su")) return 0;
		else if (week.equals("mo")) return 1;
		else if (week.equals("tu")) return 2;
		else if (week.equals("we")) return 3;
		else if (week.equals("th")) return 4;
		else if (week.equals("fr")) return 5;
		else if (week.equals("sa")) return 6;
		else return 0;
	}
	
	
	public void runPrompt() {		
		Scanner scanner = new Scanner(System.in);
		
		Calender cal = new Calender();
		
		int month = 0;
		int year = 0;
		int weekday = 0;
		
		while (true) {
			System.out.println("연도를 입력하시오. (exit = -1) ");
			System.out.print("YEAR> ");
			year = scanner.nextInt();

			if(year == -1) {
				System.out.println("종료합니다.");
				break;
			}
			
			System.out.println("궁금한 월을 입력하시오. ");
			System.out.print("MONTH> ");
			month = scanner.nextInt();
			
			System.out.println("시작요일을 입력하시오 . (SU MO TU WE TH FR SA)");
			System.out.print("WEEKDAY> ");
			String str_weekday = scanner.next();
			weekday = parseDay(str_weekday);
			
			if(month > 12 || month < 1) {
				System.out.println("입력값을 초과하였습니다.");
				continue;
			}

			cal.PrintCal(year, month, weekday);
		}
//		System.out.println("끝");

	}
	
	public static void main(String[] args) {
		
		Prompt p = new Prompt();
		p.runPrompt();
		
	}
}
