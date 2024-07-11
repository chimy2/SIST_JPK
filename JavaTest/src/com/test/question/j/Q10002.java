package com.test.question.j;

import java.util.Scanner;

public class Q10002 {

	public static void main(String[] args) {

//		[요구사항] 숫자 2개를 입력받아 아래의 연산식을 출력하시오.
//		
//		[조건]	- 출력 숫자에 천단위 표기
//				- 결과값은 소수 첫째자리까지 표기 

		Scanner scan = new Scanner(System.in);

		System.out.println("첫번째 숫자: ");
		float a = scan.nextInt();

		System.out.println("두번째 숫자: ");
		float b = scan.nextInt();
		System.out.println();

		System.out.printf("%,.0f + %,.0f = %,.0f", a, b, a + b);
		System.out.println();

		System.out.printf("%,.0f - %,.0f = %,.0f", a, b, a - b);
		System.out.println();

		System.out.printf("%,.0f * %,.0f = %,.0f", a, b, a * b);
		System.out.println();

		System.out.printf("%,.0f / %,.0f = %,.1f", a, b, a / b);
		System.out.println();

		System.out.printf("%,.0f %% %,.0f = %,.0f", a, b, a % b);
		System.out.println();
		
		
//		변수 선언을 정수로 하고 나누기 연산할 때 피연산자 하나만 실수로 형변환
//		System.out.printf("%,d + %,d = (double)%,d", a, b, a + b);
//		System.out.println();

	scan.close();	
	
	}
}
