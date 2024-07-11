package com.test.question.j;

import java.util.Scanner;

public class Q10050 {
	
	public static void main(String[] args) {
		
		int count = 0;
		String space = " ";
		String asterisk = "*";
		
		Scanner scan = new Scanner(System.in);
		
		for (;;) {
			
			System.out.print("행: ");
			count = scan.nextInt();
			scan.skip("\r\n");
		
			if (count < 1) {
				System.out.println("행의 개수는 양수만 입력 가능합니다.");
				continue;
			} else {
				break;
			}
		}
		
		for (int i=count; i>=1; i-- ) {
			
			for (int j=i; j>=2; j--) {
				System.out.print(space);
			}
			for (int j=count; j>=i; j--) {
				System.out.print(asterisk);
			}
			System.out.println();
		}	
		scan.close();
	}
}
