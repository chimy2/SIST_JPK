package com.test.question.j;

import java.util.Scanner;

public class Q10033 {

/*
	[요구사항]
	년도를 입력받아 해당 년도가 '평년' 인지 '윤년' 인지 출력하시오
*/
/*	
	[조건]
		a. 년도를 4로 나눈다.
			떨어지면 b 검사
			떨어지지 않으면 "평년"
		b. 년도를 100으로 나눈다.
			떨어지면 c 검사
			떨어지지 않으면 "윤년"
		c. 년도를 400으로 나눈다.
			떨어지면 "윤년"
			떨어지지 않으면 "평년"
*/	
/*
	case #1
	[입력]
	년도 입력: 2019 
	
	[출력]
	2019년은 '평년'입니다.
*/	
/*	
	case #2
	[입력]
	년도 입력: 2020 
	
	[출력]
	2020년은 '윤년'입니다. 
*/	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("년도 입력: ");
		int year = scan.nextInt();
		
		String yearText = isLeapYear(year) ? "윤년" : "평년";
		
		System.out.println();
		System.out.printf("%d년은 '%s'입니다.", year, yearText);
		
		scan.close();
	}

	private static boolean isLeapYear(int year) {
		
		if (year % 4 == 0) {
				if (year % 100 == 0) {
						if (year % 400 == 0) {
								return true;
						} else {
								return false;
						}
				} else {
						return true;	
				}
		} return false;
	}
}
