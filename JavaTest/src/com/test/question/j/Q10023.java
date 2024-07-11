package com.test.question.j;

import java.util.Calendar;
import java.util.Scanner;

public class Q10023 {

/*
 	[요구사항]
	아빠와 딸의 생일을 입력받아 아빠가 딸보다 며칠을 더 살았는지 출력하시오
	
	[입력]
	아빠 생일(년): 1971 

	아빠 생일(월): 5 

	아빠 생일(일): 10 

	딸 생일(년): 1999 

	딸 생일(월): 7 

	딸 생일(일): 22 

	[출력]
	아빠는 딸보다 총 10,300일을 더 살았습니다
 */
	
	public static void main(String[] args) {
		
		ageGapCheck();
		
	}
	
	private static void ageGapCheck() {	
		
	Scanner scan = new Scanner(System.in);
	System.out.println("아빠 생일(년:)");
	int dadYear = scan.nextInt();
	
	System.out.println("아빠 생일(월:)");
	int dadMonth = scan.nextInt();
	
	System.out.println("아빠 생일(일:)");
	int dadDay = scan.nextInt();
	
	System.out.println("딸 생일(년:)");
	int daughterYear = scan.nextInt();
	
	System.out.println("딸 생일(월:)");
	int daughterMonth = scan.nextInt();
	
	System.out.println("딸 생일(일:)");
	int daughterDay = scan.nextInt();
		
	Calendar dadBirth = Calendar.getInstance();
	dadBirth.set(dadYear, dadMonth, dadDay);
	
	Calendar daughterBirth = Calendar.getInstance();
	daughterBirth.set(daughterYear, daughterMonth, daughterDay);
	
	long ageGap = daughterBirth.getTimeInMillis() - dadBirth.getTimeInMillis();
	System.out.printf("아빠는 딸보다 총 %,d일 더 살았습니다.", ageGap / 1000 / 60 / 60 / 24 );
	
	scan.close();
	}
	
}
