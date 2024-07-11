package com.test.question.j;

import java.util.Scanner;

public class Q10003 {

	public static void main(String[] args) {

//		[요구사항] 사각형의 너비와 높이를 입력받아 넓이와 둘레를 출력하시오.
//		[조건]	- 사각형의 넓이 = 너비 * 높이
//				- 사격형의 둘레 = 너비 * 2 + 높이 * 2

		Scanner scan = new Scanner(System.in);

		System.out.println("사각형의 너비(cm): ");
		int width = scan.nextInt();

		System.out.println("사각형의 높이(cm): ");
		int height = scan.nextInt();
		System.out.println();

		System.out.printf("사각형의 넓이는 %,d cm²입니다.\r\n사각형의 둘레는 %,d cm²입니다.\r\n", width * height, width * 2 + height * 2);

		scan.close();
	}

}
