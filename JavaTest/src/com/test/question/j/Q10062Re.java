package com.test.question.j;

import java.util.Arrays;
import java.util.Scanner;

public class Q10062Re {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("학생 수: ");
		
		
		String[] list = new String[scan.nextInt()];
		scan.skip("\r\n");
		
		for (int i=0; i<list.length; i++) {
			
		System.out.print("학생명: ");
		 list[i] = scan.nextLine();
		 
		}
		System.out.println();
		sort(list);
		
		System.out.printf("입력한 학생은 총 %d명입니다.\r\n", list.length);

//		소스코드 32번 라인 에서 다시 시작
		
		
		scan.close();
		
	}

	private static void sort(String[] list) {

		for (int i=0; i<list.length-1; i++) {
			for (int j=0; j<list.length-1-i; j++) {

				if (list[j].compareTo(list[j+1]) > 0 ) {
					String temp = "";
					temp = list[j];
					list[j] = list[j+1];
					list[j+1] = temp;
				}
			}
		}
		
		
		
		
	}//main
	
	
}//class








