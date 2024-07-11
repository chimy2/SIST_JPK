package com.test.question.j;

import java.util.Scanner;

public class Q10038 {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int count = 0;
		int countEven = 0;
		int countOdd = 0;
		int sumEven = 0;
		int sumOdd = 0;
				
		System.out.println("입력 횟수: ");
		count = scan.nextInt();
		scan.skip("\r\n");
		
		for (int i=1; i<=count; i++) {
			
			int num = 0;
			System.out.println("숫자: ");
			num = scan.nextInt();
			scan.skip("\r\n");
			
				if (num % 2 == 0) {
					countEven += 1;
					sumEven += num;
				} else {
					countOdd += 1;
					sumOdd += num;
				}
			
		}
		System.out.printf("짝수 %d개의 합: %d\r\n", countEven, sumEven);
		System.out.printf("홀수 %d개의 합: %d\r\n",countOdd, sumOdd);
		scan.close();	
	}
}
