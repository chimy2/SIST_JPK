package com.test.question.j;

import java.util.Calendar;

public class Q10020 {

/*
	[요구사항]
	오늘 태어난 아이의 백일과 첫돌을 출력하시오

	[출력]
	백일: 2024-10-04
	첫돌: 2025-06-26
*/	
	
	public static void main(String[] args) {
		
		showDate();
		
	} //main

	private static void showDate() {
		
		Calendar birthday = Calendar.getInstance();
		
		
		System.out.printf("오늘 날짜:\t%10tF\r\n", birthday);
		System.out.println();
		
		birthday.add(Calendar.DATE, 100);
		System.out.printf("백일:\t\t%10tF\r\n", birthday);
		birthday = Calendar.getInstance();
		System.out.println();
		
		
		birthday.add(Calendar.YEAR, 1);
		System.out.printf("첫돌:\t\t%10tF\r\n", birthday);
		birthday = Calendar.getInstance();
		System.out.println();

	} //showDate

	
} //class
