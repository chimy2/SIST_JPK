package com.test.question.j;

import java.util.Scanner;

public class Q10036 {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int in;
		int out;
		int increment;
		
		System.out.println("시작 숫자: ");
		in = scan.nextInt();
		scan.skip("\r\n");
		
		System.out.println("종료 숫자: ");
		out = scan.nextInt();
		scan.skip("\r\n");
		
		System.out.println("증감치: ");
		increment = scan.nextInt();
		scan.skip("\r\n");
		
		for (int i=in; ; i++) {
				int sum = 0;
				sum = in + (increment)*(i-in);
					if (sum > out) {
						break;
					} else {
					System.out.println(sum);
			}
			scan.close();
		}		
	}	
}









