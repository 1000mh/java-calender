package com.mh1000;

import java.util.Scanner;

public class Prompt {

	private final static String PROMPT="cal> ";
	
	public void runPrompt() {		
		Scanner mon = new Scanner(System.in);
		Calender cal = new Calender();
		int month = 0;
		
		while (true) {
			System.out.println("궁금한 월을 입력하시오");
			System.out.print(PROMPT);
			month = mon.nextInt();
			
			if(month < 1) {
				System.out.println("0보다 작은값을 입력하여 종료합니다.");
				break;
			}

			if(month > 12) {
				System.out.println("입력값을 초과하였습니다.");
				continue;
			}
			cal.PrintCal(2018, month);
		}
		System.out.println("끝");

	}
	
	public static void main(String[] args) {
		
		Prompt p = new Prompt();
		p.runPrompt();
		
	}
}
