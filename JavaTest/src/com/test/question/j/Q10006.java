package com.test.question.j;

import java.util.Scanner;

public class Q10006 {

	public static void main(String[] args) {

//		[요구사항] 사용자의 한달 수입을 입력받아 세후 금액을 출력하시오.
//		[조건]	- 세금: 수입의 3.3%

		Scanner scan = new Scanner(System.in);

		System.out.println("월수입(만원): ");
		double income = scan.nextInt();
		System.out.println();

		System.out.printf("세후 금액:\t %,10.0f원\r\n세금:\t\t %,10.0f원", income * 9670, income * 330);

//		변수 선언을 수입 말고 세금도 변수로 선언 해서 코딩 가능
//		double tax = income * (1-0.967);
		
//		 실수형은 기본 자료형이 double 이기 때문에 float로 변수 선언하면 double로 명시적 형변환 필요
		
		scan.close();
	}
}
