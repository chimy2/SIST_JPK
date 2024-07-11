package com.test.question.j;

import java.util.Calendar;
import java.util.Scanner;

public class Q10034 {

/*
	[요구사항]
	날짜를 입력받아 아래의 조건에 맞게 결과를 출력하시오
*/
/*	
	[조건]
	입력받은 날짜가 평일이면 해당 주의 토요일을 알아낸다.
	입력받은 날짜가 토/일요일이면 아무것도 안한다.
*/
/*	
 	case #1
	[입력]
	년: 2022 
	월: 3 
	일: 14 

	[출력]
	입력하신 날짜는 '평일'입니다.
	해당 주의 토요일로 이동합니다.
	이동한 날짜는 '2022-03-19' 입니다.
*/	
/*	
	case #2
	[입력]
	년: 2022 
	월: 3 
	일: 6 
	
	[출력]
	입력하신 날짜는 '휴일(토/일)'입니다.
	결과가 없습니다. 
*/
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Calendar check = Calendar.getInstance();
		
		System.out.println("년: ");
		check.set(Calendar.YEAR, scan.nextInt());
		scan.skip("\r\n");

		System.out.println("월: ");
		check.set(Calendar.MONTH, (scan.nextInt())-1);
		scan.skip("\r\n");
		
		System.out.println("일: ");
		check.set(Calendar.DATE, scan.nextInt());
		scan.skip("\r\n");
		
		if (check.get(Calendar.DAY_OF_WEEK) == 1 || check.get(Calendar.DAY_OF_WEEK) == 7) {
			System.out.println("입력하신 날짜는 '휴일'(토/일)입니다.");
			System.out.println("결과가 없습니다.");
		} else {
			check.add(Calendar.DAY_OF_WEEK, 7 - check.get(Calendar.DAY_OF_WEEK));
			
//			check.set(Calendar.DAY_OF_WEEK, 7) 로 쓰면 그냥 바로 토요일로 이동
			System.out.println("입력하신 날짜는 '평일'입니다.");
			System.out.println("해당 주의 토요일로 이동합니다.");
			System.out.printf("이동한 날짜는 '%tF' 입니다.", check);

		}
		
	}
	
}

		
		
		
		
		
		
		
		
		
	