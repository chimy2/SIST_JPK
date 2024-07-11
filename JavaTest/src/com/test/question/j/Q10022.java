package com.test.question.j;

import java.util.Calendar;
import java.util.Scanner;

public class Q10022 {

	//매개변수 입력하는 메소드 만들어서 다시 해보기
	
/*
 * 
	[요구사항]
	남녀 커플의 이름과 만난날을 입력받아 기념일을 출력하시오.

	[입력]
	남자 이름: 하하하 
	여자 이름: 호호호 
	만난날(년): 2024 
	만난날(월): 6 
	만난날(일): 26 

	[출력]
	'하하하'과(와) '호호호'의 기념일
	100일: 2024-10-04
	200일: 2025-01-12
	300일: 2025-04-22
	500일: 2025-11-08
	1000일: 2027-03-23
	
*/	
	
	public static void main(String[] args) {
		
		anniversaryCheck();
		
	} //main

	private static void anniversaryCheck() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("남자 이름: ");
		String nameMan = scan.nextLine();
		System.out.println();
		
		System.out.println("여자 이름: ");
		String nameWoman = scan.nextLine();
		System.out.println();
		
		System.out.println("만난날(4자리 연도): ");
		int metYear = scan.nextInt();
		System.out.println();
		
		System.out.println("만난날(월): ");
		int metMonth = scan.nextInt();
		System.out.println();

		System.out.println("만난날(일): ");
		int metDay = scan.nextInt();
		System.out.println();

		Calendar anniversary = Calendar.getInstance();
		anniversary.set(metYear, metMonth, metDay);
		
		System.out.printf("'%s'과(와) '%s'의 기념일\r\n", nameMan, nameWoman);
		
		
		anniversary.add(Calendar.DATE, 99);
		System.out.printf("100일: \t%tF\r\n", anniversary);
		anniversary.set(metYear, metMonth - 1, metDay);
		
		anniversary.add(Calendar.DATE, 199);
		System.out.printf("200일: \t%tF\r\n", anniversary);
		anniversary.set(metYear, metMonth - 1, metDay);
		
		anniversary.add(Calendar.DATE, 299);
		System.out.printf("300일: \t%tF\r\n", anniversary);
		anniversary.set(metYear, metMonth - 1, metDay);
		
		anniversary.add(Calendar.DATE, 499);
		System.out.printf("500일: \t%tF\r\n", anniversary);
		anniversary.set(metYear, metMonth - 1, metDay);
		
		anniversary.add(Calendar.DATE, 999);
		System.out.printf("1000일: \t%tF\r\n", anniversary);
		anniversary.set(metYear, metMonth - 1, metDay);
	
		scan.close();
		
	} //anniversary
	
	
	
} //class
