package com.test.question.j;

import java.util.Scanner;

public class Q10004 {

	public static void main(String[] args) {

//		[요구사항] 섭씨 온도를 입력 받아서 화씨 온도로 변환하시오.
//		[조건]	- °F = °C * 1.8 + 32
//				- 소수 입력 가능
//				- 소수 한자리수까지 출력

		Scanner scan = new Scanner(System.in);

		System.out.println("섭씨(°C): ");
		double C = scan.nextDouble();
		System.out.println();

		System.out.printf("섭씨 %,.1f°C는 화씨 %,.1f°F입니다.", C, C * 1.8 + 32);

		scan.close();
	}	
	
}
