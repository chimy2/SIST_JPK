package com.test.question.j;

import java.util.Scanner;

public class Q10035 {

/*
	[요구사항]
	사용자의 이름과 인사할 횟수를 입력 받아 출력하시오
*/
/*	
	case #1
	[입력]
	이름: 홍길동 
	횟수: 3 
	
	[출력]
	홍길동님 안녕하세요~
	홍길동님 안녕하세요~
	홍길동님 안녕하세요~
*/	
/*
	case #2
	[입력]
	이름: 아무개 
	횟수: 5 
	
	[출력]
	아무개님 안녕하세요~
	아무개님 안녕하세요~
	아무개님 안녕하세요~
	아무개님 안녕하세요~
	아무개님 안녕하세요~
*/	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String name;
		int count;
		
		System.out.println("이름: ");
		name = scan.nextLine();
		
		System.out.println("횟수: ");
		count = scan.nextInt();
		scan.skip("\r\n");
		
		for (int i=0; i<count; i++) {
			
			System.out.printf("%s님 안녕하세요~\r\n", name);
			
		}	
	}
}
