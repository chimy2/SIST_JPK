package com.test.question.j;

import java.util.Scanner;

public class Q10043 {

	
	public static void main(String[] args) {
		
		int number = (int)((Math.random() * 9) + 1);
		int guess = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("컴퓨터가 1~10 사이의 숫자를 1개 생각했습니다.");
		
		for (int i=0; i<10; i++) {
			if (i==10) {
				System.out.printf("컴퓨터가 생각한 숫자는 %d입니다.\r\n", number);
				System.out.println("모든 기회를 실패했습니다.");
			} else {
					System.out.println("숫자: ");
					guess = scan.nextInt();
					scan.skip("\r\n");
						if (guess == number) {
							System.out.println("맞았습니다.");
							System.out.printf("컴퓨터가 생각한 숫자는 %d입니다.\r\n", number);
							System.out.printf("정답을 맞추는데 시도한 횟수는 %d입니다.\r\n", i+1);
							break;
						} else { 
							System.out.println("틀렸습니다.");
						}
					}
		}
		System.out.println("프로그래밍을 종료합니다.");
			
		}
		
		
	}

