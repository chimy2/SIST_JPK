package com.test.question.j;

import java.util.Scanner;

public class Q10045 {


	
	public static void main(String[] args) {
		
		int count = 0;

		Scanner scan = new Scanner(System.in);
		
		System.out.println("횟수: ");
		count = scan.nextInt();
		scan.skip("\r\n");
		
		
	if (count < 1000) {
		for (int i=1; i<=count; i++) {
			
			
			System.out.print(clap(i) + " ");
//			System.out.printf("%3d[%d] ", i, i%10);
			if (i%10==0 && i!=1) {
				System.out.println();
			}
		}
			System.out.println();
		} else {
			System.out.println("1000 이하만 입력 가능합니다.");
		}
		scan.close();
	}
		

	private static String clap(int i) {
			
		String temp = "";
		int n = i;
		
			for (; n>0; ) {
					if (n % 10 % 3 == 0 && n % 10 != 0) {
						temp += "짝";
					}
				n /= 10;
			}
		
			if (temp.equals("")) {
					return i + "";
			} else {
					return temp;
			}

	}//clap
	
}//class
