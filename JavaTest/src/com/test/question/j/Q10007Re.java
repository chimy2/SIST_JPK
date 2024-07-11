package com.test.question.j;

import java.util.Scanner;

public class Q10007Re {

	public static void main(String[] args) {
//		[요구 사항] 영문 소문자를 1글자를 입력 받은 후 대문자로 변환해서 출력하시오.
//		[조건]
		
		Scanner scan = new Scanner(System.in);
		System.out.println("문자 입력: ");
		
		char input;
		char output;
		
		input = scan.nextLine().charAt(0);
		output = (char)(input - 32);
		System.out.println();
		
//		System.out.println(input);
//		System.out.println(output);
	
		
		
		System.out.printf("소문자 '%c'의 대문자는 '%c' 입니다.\r\n", input, output);
		System.out.printf("소문자 '%s'의 대문자는 '%s' 입니다.\r\n", input, output);
		
		scan.close();
		
		
		
	}
}
