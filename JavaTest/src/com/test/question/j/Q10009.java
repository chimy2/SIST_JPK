package com.test.question.j;

import java.util.Scanner;

public class Q10009 {

//	*** 이름을 입력 받지 말고 매개변수로 해서 다시
	
	/*
	[요구사항]
	이름을 전달하면 이름뒤에 '님'을 붙여서 반환하는 메소드를 선언하시오.
	
	[조건]
	- String getName(String name)
	- name: OOO(이름)
	- return: OOO(이름)님
	
	[호출]
	result = getName("홍길동");
	System.out.printf("고객: %s\n", result);

	result = getName("아무개");
	System.out.printf("고객: %s\n", result);
	
	[출력]
	고객: 홍길동님
	고객: 아무개님
	
	*/
	public static void main(String[] args) {
		
		
		System.out.printf("고객: %s\r\n", Address());
		System.out.println();
		System.out.printf("고객: %s\r\n", Address());
		System.out.println();

	} //main

	private static String Address() {
		Scanner scan = new Scanner(System.in);
		System.out.println("이름 입력: ");
		String getName = scan.nextLine();
		String result = getName + "님";
		scan.close();
		return result;
		
//		System.out.printf("고객: %s\r\n", result);
		
		
	}
	
	
} //class
