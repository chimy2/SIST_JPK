package com.test.question.j;

import java.util.Scanner;

public class Q10029 {

/*	
	[요구사항]
	숫자 2개와 연산자 1개를 입력받아 연산 과정과 결과를 출력하시오
	
	[조건]
	정수만 입력하시오.(유효성 검사 필요없음)
	나머지 연산 결과는 소수이하 첫째자리까지 출력 하시오
	연산자는 산술 연산자(+, -, *, /, %)만 입력하시오
	
	Case #1
	[입력]
	첫번째 숫자: 5 
	두번째 숫자: 3 
	연산자: * 
	
	[출력]
	5 * 3 = 15
	
	Case #2
	[입력]
	첫번째 숫자: 10 
	두번째 숫자: 3 
	연산자: / 
	
	[출력]
	10 / 3 = 3.3
	
	Case #3
	[입력]
	첫번째 숫자: 3 
	두번째 숫자: 2 
	연산자: >= 
	
	[출력]
	연산이 불가능합니다
*/	
	
	public static void main(String[] args) {

		double num1 = 0;
		double num2 = 0;
		String operator = "";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫번째 숫자: ");
		num1 = scan.nextInt();
		scan.skip("\r\n");		
		
		System.out.println("두번째 숫자:");
		num2 = scan.nextInt();
		scan.skip("\r\n");
		
		System.out.println("연산자: ");
		operator = scan.nextLine();
		
		System.out.printf("입력하신 숫자와 연산자는 %.0f, %.0f, %s입니다.\r\n", num1, num2, operator);
		System.out.println();
		
		
		System.out.println("계속하시려면 엔터를 입력하세요. ");
		scan.nextLine();
		
		
			if 		 ( operator.equals("+")
					|| operator.equals("-")
					|| operator.equals("*")
					|| operator.equals("/")
					|| operator.equals("%")) {//연산자 유효성 체크
			
							//유효성 체크 통과 시
							if (operator.equals("+")) {
							System.out.printf("%.0f + %.0f = %.0f",num1, num2, num1 + num2);
						}	
							else if (operator.equals("-")) {
							System.out.printf("%.0f - %.0f = %.0f",num1, num2, num1 - num2);
						}	
							else if (operator.equals("*")) {
							System.out.printf("%.0f * %.0f = %.0f",num1, num2, num1 * num2);
						}	
							else if (operator.equals("/")) {
							System.out.printf("%.0f / %.0f = %.1f",num1, num2, num1 / num2);
						}	
							else if (operator.equals("%")) {
							System.out.printf("%.0f %% %.0f = %.0f",num1, num2, num1 % num2);
						}	
				
			} else {		//유효성 체크 실패 시
				System.out.println("연산이 불가능합니다.");
				System.out.println();
			}
			scan.close();
		}
	
}
