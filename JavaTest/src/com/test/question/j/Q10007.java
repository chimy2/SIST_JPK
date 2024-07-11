package com.test.question.j;

import java.util.Scanner;

public class Q10007 {

	public static void main(String[] args) {
		
//		[요구사항] 영문 소문자를 1글자 입력 받은 후 대문자로 변환해서 출력하시오.
//		[조건]	- 대문자와 소문자의 문자 코드값의 관계
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("문자 입력: ");
//		String input = scan.nextLine();
//		char c = input.charAt(0);
//		int code = (int) c;
//		System.out.println(code);
//		
//		String result = 97 >= code && code <= 122 ? "올바른 문자" : "올바르지 않은 문자";
//		
//		System.out.println(result);
//		System.out.printf("소문자 '%s'의 대문자는 '%s' 입니다.\r\n", input, result);
//		
//		System.out.println(c);
//		System.out.println(code);
//		System.out.printf("소문자 '%s'의 대문자는 '%s' 입니다.\r\n", input, char(code + 32));
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("문자 입력: ");
		
		char input = scan.nextLine().charAt(0);
		char output = (char)(input - 32);
		
//		!!!IMPORTANT!!!		
// 		char output = char((int)input - 32);
//		it's just the way Java handles casting and syntax. The correct syntax must be: "(type)value" not "type(value)"


		System.out.printf("소문자 '%c'의 대문자는 '%c'입니다.\r\n", input, output);
		System.out.println();
		
//		System.out.println("다음 문자: ");
//		그냥 대소문자 변환 메서드 사용 가능 toUpperCase 나 toLowerCase
//		char input2 = Character.toUpperCase(scan.nextLine().charAt(0));
//		System.out.println(input2);
		
//		아래와 같이도 가능
//		String sInput = scan.nextLine();
//		String sOutput = sInput.toUpperCase();
//		System.out.printf("소문자 '%s'의 대문자는 '%s'입니다.\r\n", sInput, sOutput);
		
		scan.close();
	
	}
}
