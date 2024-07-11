package com.test.question.j;

import java.util.Scanner;

public class Q10044 {

	public static void main(String[] args) {
		
		int sum = 0;
		int num = 0;
		String txt = "";
		
		Scanner scan = new Scanner(System.in);
		
		for (int i=0;;i++) {
					if (sum < 100) {
					
				System.out.println("숫자: ");
				num = scan.nextInt();
				scan.skip("\r\n");
							if (i!=0) {
										if (num % 2 == 0) {
											sum += num;
											txt += " + " + num;
										} else {
											sum -= num;
											txt += " - " + num;
										}
							} else if (i == 0 && num % 2 == 0) {
								sum += num;
								txt += "" + num; //""넣지 않아도 됨.
							} else if (i == 0 && num % 2 == 1) {
								sum -= num;
								txt += "- " + num;
							}
								
						
					} else {
						break;
				}
		}
		System.out.println(txt + " = " + sum);
		System.out.println("계산식을 종료합니다.");
		
		scan.close();
	
	}
	
}
