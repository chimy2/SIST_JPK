package com.test.question.j;

import java.util.Scanner;

public class Q10049 {

	public static void main(String[] args) {
		
		int count = 0;
		String space = " ";
		String star = "*";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("행: ");
		count = scan.nextInt();
		
		for (int i=count; i>=1; i--) {
			
			for (int j=count; j>i; j--) {
				
				System.out.print(space);
				
				}
			
			for (int j=i; j>=1; j--) {
				
				System.out.print(star);
				
			}
			
			System.out.println();
		}
		
		scan.close();

	}
//	공백 for문 <=> 별표 for문 적절히 분배
}
