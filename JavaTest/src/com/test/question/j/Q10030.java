package com.test.question.j;

import java.util.Scanner;

public class Q10030 {

/*	
	
	[요구사항]
	영문자 1개를 입력받아 대/소문자 변환을 한 뒤 출력하시오
	
	[조건]
	유효성 검사를 하시오 (영문자만 입력 가능)
	
	Case #1
	[입력]
	문자: a 
	[출력]
	'a'의 대문자는 'A'입니다.
	
	Case #2
	[입력]
	문자: F 
	[출력]
	'F'의 소문자는 'f'입니다.
	
	Case #3
	[입력]
	문자: 가 
	[출력]
	영문자만 입력하시오.

*/	
	
	public static void main(String[] args) {
		
//		A	Z	a	z	->	65		90		97		122 
//		'a' - 'A' = 32 -> 'a' = A + 32
//		'z' - 'Z' = 32 -> 'z' = Z + 32
		

		Scanner scan = new Scanner(System.in);
		
		char input = '\0';
		System.out.println("문자: ");
		input = scan.nextLine().charAt(0);

		
		if (input >= 'A' && input <= 'Z') {
			System.out.printf("'%s'의 소문자는 '%s'입니다.", input, (char)(input + 32));
		} else if (input >= 'a' && input <= 'z') {
			System.out.printf("'%s'의 대문자는 '%s'입니다.", input, (char)(input - 32));			
		} else {
			System.out.println("영문자만 입력하시오.");
		}
		scan.close();
	}
}
