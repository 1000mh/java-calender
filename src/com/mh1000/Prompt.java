package com.mh1000;

import java.util.Scanner;

public class Prompt {

	private final static String PROMPT="cal> ";
	
	public void runPrompt() {		
		Scanner scanner = new Scanner(System.in);
		
		Calender cal = new Calender();
		
		int month = 0;
		int year = 0;
		
		while (true) {
			System.out.println("궁금한 연도를 입력하시오");
			System.out.print(PROMPT);
			year = scanner.nextInt();
			
			System.out.println("궁금한 월을 입력하시오");
			System.out.print(PROMPT);
			month = scanner.nextInt();
			
			if(month < 1) {
				System.out.println("0보다 작은값을 입력하여 종료합니다.");
				break;
			}

			if(month > 12) {
				System.out.println("입력값을 초과하였습니다.");
				continue;
			}
			cal.PrintCal(year, month);
		}
		System.out.println("끝");

	}
	
	public static void main(String[] args) {
		
		Prompt p = new Prompt();
		p.runPrompt();
		
	}
}
