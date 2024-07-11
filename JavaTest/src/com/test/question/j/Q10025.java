package com.test.question.j;

import java.util.Scanner;

public class Q10025 {

/*
	[요구사항]
	숫자 2개를 입력받아 큰수와 작은수를 출력하시오

	[조건]
	두 숫자가 얼마의 차이를 보이는지 출력하시오
	
	case #1
	[입력]
	첫번째 숫자: 5
	두번째 숫자: 3 

	[출력]
	큰수는 5이고, 작은수는 3입니다. 두 숫자는 2(가)이 차이납니다.
	
	case #2
	[입력]
	첫번째 숫자: 2 
	두번째 숫자: 10 

	[출력]
	큰수는 10이고, 작은수는 2입니다. 두 숫자는 8(가)이 차이납니다.
	
	case #3
	[입력]
	첫번째 숫자: 3 
	두번째 숫자: 3 

	[출력]
	두 숫자는 동일합니다.
*/	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫번째 숫자: ");
		int num1 = scan.nextInt();
		
		System.out.println("두번째 숫자: ");
		int num2 = scan.nextInt();
		
		if (num1 > num2) {
			System.out.println("입력하신 숫자는 " + num1 + "와(과) " + num2 + "입니다.");
			System.out.printf("큰수는 %d이고 작은수는 %d 입니다. 두 숫자는 %d(가)이 차이납니다.", num1, num2, num1 - num2);
		} else if (num1 < num2) {
			System.out.println("입력하신 숫자는 " + num1 + "와(과) " + num2 + "입니다.");
			System.out.printf("큰수는 %d이고 작은수는 %d 입니다. 두 숫자는 %d(가)이 차이납니다.", num2, num1, num2 - num1);
		} else if (num1 == num2) {
			System.out.println("입력하신 숫자는 " + num1 + "와(과) " + num2 + "입니다.");
			System.out.println("두 숫자는 동일합니다.");
		}
		scan.close();
	}

}
