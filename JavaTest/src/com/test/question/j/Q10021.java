package com.test.question.j;

import java.util.Calendar;
import java.util.Scanner;

public class Q10021 {

/*
	[요구사항]
	태어난 년도를 입력하면 나이를 출력하시오

	[조건]
	올해를 기준으로 나이를 계산하시오
	내년, 내후년에 실행해도 그때에 맞는 나이를 출력한다
	우리나라 나이로 출력하시오
 */
	
	public static void main(String[] args) {
	
		ageCheck();
		
	} //main

	
	private static void ageCheck() {
	
		
		Calendar now = Calendar.getInstance();
		Scanner scan = new Scanner(System.in);
		System.out.println("태어난 년도 (4자리): ");
		int birthYear = scan.nextInt();
		System.err.println();
		
		System.out.printf("나이: %d", (now.get(Calendar.YEAR) - birthYear) + 1);
		now = Calendar.getInstance();
		System.out.println();
		scan.close();
		
	
	} //ageCheck
	
	
} //class
