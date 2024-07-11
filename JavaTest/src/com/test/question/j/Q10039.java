package com.test.question.j;

import java.util.Scanner;

/*
	[요구사항]
	아래와 같이 출력하시오
*/

/*
	[입력] case #1
	시작 숫자: 1 
	종료 숫자: 10 
	
	[출력]
	1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55
*/

/*	
	[입력] case #2
	시작 숫자: 3 
	종료 숫자: 5 
	
	[출력]
	3 + 4 + 5 = 12
*/

public class Q10039 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		int sum = 0;
		
		System.out.println("시작 숫자: ");
		num1 = scan.nextInt();
		scan.skip("\r\n");
		
		System.out.println("종료 숫자: ");
		num2 = scan.nextInt();
		scan.skip("\r\n");
		
		
		
		
		for (int i=num1; i<=num2; i++) {
		
			sum += i;
			
			System.out.print(i);
			
			if (i != (num2) ) {
				
			System.out.print(" + ");
				
			} else {
				System.out.printf(" = " + sum);
			}
		
		}
		
		scan.close();
		
	}
	
}
