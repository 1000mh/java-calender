package com.mh1000;
import java.util.Scanner;


public class Sum {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int a;
		int b;
		int sum;
		
		System.out.println("두 수를 입력하세요.");
		
		a = sc.nextInt();
		b = sc.nextInt();
		

		//System.out.println("두 수의 합은 " + (a+b) + " 입니다.");
		
		System.out.printf("%d와 %d의 합은 %d입니다.", a,b,a+b);
		
		sc.close();
	}
}
