package com.test.question.j;

import java.util.Scanner;

public class Q10028 {

/*	
	
	[요구사항]
	근무 년수를 입력받아 아래와 같이 출력하시오
	
	[조건]
	1 ~ 4년차: 초급 개발자
	5 ~ 9년차: 중급 개발자
	10년차 이상: 고급 개발자
	
	유효성 검사를 하시오. (1 미만 입력 예외 처리)
	
	[입력]
	근무 년수: 2 
	
	[출력]
	2년차 초급 개발자입니다.
	앞으로 3년 더 근무를 하면 중급 개발자가 됩니다. 
	
	[입력]
	근무 년수: 5 
	
	[출력]
	5년차 중급 개발자입니다.
	당신은 1년전까지 초급 개발자였습니다.
	앞으로 5년 더 근무를 하면 고급 개발자가 됩니다.
	
	[입력]
	근무 년수: 11 
	
	[출력]
	11년차 고급 개발자입니다.
	당신은 2년전까지 중급 개발자였습니다.
	
	[입력]
	근무 년수: -5 
	
	[출력]
	입력한 값이 올바르지 않습니다. 1이상의 값을 입력하시오.

*/	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int year = 0; //근무년수 변수 선언 및 초기화
		
		System.out.println("근무년수: ");
		year = scan.nextInt();
		
		if (year >= 1) {
					//유효성 검사
					if (year >=1 && year <5) {
						System.out.println(year + "년차 초급 개발자입니다.");
						System.out.printf("앞으로 %d년 더 근무를 하면 중급 개발자가 됩니다.\r\n", 5 - year);
						
					} else if (year >=5 && year <10) {
						System.out.println(year + "년차 중급 개발자입니다.");
						System.out.printf("당신은 %d년전까지 초급 개발자였습니다.\r\n", year - 4);
						System.out.printf("앞으로 %d년 더 근무를 하면 고급 개발자가 됩니다.\r\n", 10 - year);
						
					} else if (year >=10) {
						System.out.println(year + "년차 고급 개발자입니다.");
						System.out.printf("당신은 %d년전까지 중급 개발자였습니다.\r\n", year - 9);
					}

			} else {
			System.out.println("입력한 값이 올바르지 않습니다.");
			System.out.println("1이상의 값을 입력하시오.");
				}
		scan.close();
		}

	}
