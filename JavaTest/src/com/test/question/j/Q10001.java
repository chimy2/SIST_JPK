package com.test.question.j;

import java.util.Scanner;

public class Q10001 {

	public static void main(String[] args) {

//		[요구사항] 태어난 년도를 입력받아 나이를 출력하시오.

		Scanner scan = new Scanner(System.in);

		System.out.println("태어난 년도(4자리): ");
		int birthYear = scan.nextInt();
		System.out.println();

		System.out.printf("나이: %d\r\n", (2024 - birthYear));

//		LocalDate dateNow = LocalDate.now();
//		System.out.println(dateNow);
		
		scan.close();
		
		
	}
}
