package com.mh1000;

import java.util.Scanner;

public class Calender {

	public static void main(String[] args) {
		// 숫자 입력 받아 해당 달의 최대 일수 출력
		
	
		int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		Scanner mon = new Scanner(System.in);
		
		System.out.println("궁금한 월을 입력하시오");
		
		int a = mon.nextInt();
		
		System.out.println("입력한 월의 마지막 일은"+ month[a-1] + "입니다.");
		
				
	}

}
