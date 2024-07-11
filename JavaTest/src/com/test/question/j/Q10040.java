package com.test.question.j;

import java.util.Scanner;

public class Q10040 {

/*	
[요구사항]
아래와 같이 출력하시오
*/
	
/*
case #1
[입력]
시작 숫자: 1 
종료 숫자: 10 

[출력]
1 - 2 + 3 - 4 + 5 - 6 + 7 - 8 + 9 - 10 = -5
*/
	
/*	
case #2
[입력]
시작 숫자: 3 
종료 숫자: 5 

[출력]
3 - 4 + 5 = 4
*/
	

	public static void main(String[] args) {
		
		int begin = 0;
		int end = 0;
		int sum = 0;
		String txt = "";
		String op = " + "; //+로 바뀌어야 함
		
		Scanner scan = new Scanner(System.in);
		System.out.printf("시작 숫자: ");
		begin = scan.nextInt();
		scan.skip("\r\n");
		
		System.out.printf("종료 숫자: ");
		end = scan.nextInt();
		scan.skip("\r\n");

		for (int i=begin; i<=end; i++) {
			
			if (op.equals(" - ")) {
				sum += i;
				txt += i;
				op = " + ";
				if (i < end ) {
						txt += op;
				}

			} else {
				sum -= i;
				txt += i;
				op = " - ";
				if (i < end) {
					txt += op;
				}
			}
			
		}

		System.out.println(txt + " = " + sum);
		
		scan.close();
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
/*	
		Scanner scan = new Scanner(System.in);

		int num1 = 0;
		int num2 = 0;
		int sum = 0;
		
		System.out.println("시작 숫자: ");
		num1 = scan.nextInt();
		scan.skip("\r\n");
		
		System.out.println("시작 숫자: ");
		num2 = scan.nextInt();
		scan.skip("\r\n");

		
		for (int i=num1; i<=num2; i++) {
			
				if (i != num2) {
			
							if (num1 % 2 == 0) { 
								sum += i;
								System.out.print(i);
								System.out.print(" + ");
							} else if (i % 2 != 0) {
								sum -= i;
								System.out.print(i);
								System.out.print(" - ");
							}
				} else {
				System.out.print(" = " + sum);
			}
		
		}
*/	
	}
}
