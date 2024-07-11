package com.test.question.j;

import java.util.Scanner;

public class Q10045Re {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int count = 0;
		
		System.out.println("입력 횟수: ");
		count = scan.nextInt();
		scan.skip("\r\n");
		
		if (count < 1 || count >= 1000) {
			System.out.println("횟수는 1~999 사이에 정수만 입력 가능합니다.");
			
		} else {
			 for (int i=1; i<=count; i++) {
				System.out.print(checkClap(i) + " \t");
				 if (i%10==0 && i!=1) {
					 System.out.println();
				 }
			 }
		}

		scan.close();
		
		
	}

	private static String checkClap(int i) {
		
		String temp = "";
		int n = i;
		
		for (;n>0;) {
			if (n%10%3==0 && n%10!=0) {
				temp += "짝";
			} n/=10;
		}
		if (temp.equals("")) {
			return temp = i + "";
		} else {
			return temp;
		}
		
	}
}









