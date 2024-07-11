package com.test.question.j;

import java.util.Calendar;
import java.util.Scanner;

public class Q10024 {
	
/*
	[요구사항]
	여러 배달 음식을 같은 시간에 받기를 원하는 고객이 있다
	고객이 각각의 매장에 몇시에 전화를 해야 모든 음식을 같은 시간에 받을 수 있는지 알려주시오

	[조건]
	전화를 걸면 짜장면은 10분 뒤에 도착합니다.
	전화를 걸면 치킨은 18분 뒤 도착합니다.
	전화를 걸면 피자는 25분 뒤 도착합니다.
	음식을 받기 원하는 시간은 오후 11시 이전에만 가능합니다.(날짜 변경 금지)
	
	[입력]
	음식을 받기 원하는 시각

	시: 20 

	분: 31 

	[출력]
	
	짜장면: 20시 21분
	치킨: 20시 13분
	피자: 20시 6분
*/
	
	public static void main(String[] args) {
		
		int hour = 0;
		int minute = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("음식을 받기 원하는 시각");
		System.out.println("시 (24시): ");
		hour = scan.nextInt();
		
		System.out.println("분: ");
		minute = scan.nextInt();
		
		Calendar now = Calendar.getInstance();
		now.set((Calendar.HOUR_OF_DAY), hour);
		now.set(Calendar.MINUTE, minute);
		
		now.add(Calendar.MINUTE, -10);
			System.out.printf("짜장면: %d시 %d분"
								, now.get(Calendar.HOUR_OF_DAY)
								, now.get(Calendar.MINUTE));
			
		now.add(Calendar.MINUTE, -8);
			System.out.printf("치킨: %d시 %d분"
								, now.get(Calendar.HOUR_OF_DAY)
								, now.get(Calendar.MINUTE));
		
			scan.close();
	
	}
	
}	
		
		
		
		
		