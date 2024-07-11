package com.test.question.j;

import java.util.Scanner;

public class Q10037 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n;
		int sum = 0;
		System.out.println("숫자: ");
		n = scan.nextInt();
		scan.skip("\r\n");
		
		for (int i=1; i<=n; i++) {
			sum = sum + i;	
		}
		System.out.printf("1 ~ %d =  %d", n, sum);
		scan.close();
	}

}
