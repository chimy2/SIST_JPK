package com.test.question.j;

import java.util.Scanner;

public class Q10046 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int input = 0;
		String text = "";
		
		for (int i=0; i<10; i++) {
			
			System.out.print("숫자: ");
		
			input = scan.nextInt();
			scan.skip("\r\n");
			
			if (input < 0 || input > 9) {
				System.out.println("숫자는 0~9까지의 정수만 입력 가능합니다.");
				i--;
				continue;
			} else {
				text += intToString(input);	
			}
		}
		System.out.println(text);
		scan.close();
	}

	private static String intToString(int input) {

		String text = "";
		
		switch (input) {
			case 1:
				return text = "일";
			case 2:
				return text = "이";
			case 3:
				return text = "삼";
			case 4:
				return text = "사";
			case 5:
				return text = "오";
			case 6:
				return text = "육";
			case 7:
				return text = "칠";
			case 8:
				return text = "팔";
			case 9:
				return text = "구";
			case 0:
				return text = "영";
		}
		return "";
		}
		
	}

