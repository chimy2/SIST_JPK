package com.test.question.j;

import java.util.Scanner;

public class Q10052Re {

	public static void main(String[] args) {
		
		int count = 0;
		int aSetter = 0;
		
		Scanner scan = new Scanner(System.in);
		
		//(int)'a' -> 97
		//(int)'z' -> 122
		
		for (;;) {
			
			System.out.print("행: ");
			count = scan.nextInt();
			scan.skip("\r\n");
			
			if (count < 1) {
				System.out.println("행 값은 1 이상의 정수만 입력 가능합니다.");
				continue;
			} else {
				break;
			}
		}
		
		for (int i=1; i<=count; i++) {
			
			for (int j=1; j<=count-i; j++) {
				System.out.print(" ");
			}
			
			char c = 'a';
			
			for (int j=1; j<=i; j++) {
				System.out.print(c);
				c++;
		}	
			for (int j=1; j<=i; j++) {
				c--;
				System.out.print(c);
			}
			
			for (int j=1; j<=count-i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		scan.close();
	}
}
	