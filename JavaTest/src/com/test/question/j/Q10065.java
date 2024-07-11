package com.test.question.j;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Q10065 {

	public static void main(String[] args) {
		
		int[] list = new int[20];
		int min = 0;
		int max = 0;
		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);
		
		for (int i=0; i<list.length; i++) {
			
			list[i] = (int)(Math.random()*20) + 1; // (int) 형변환은 무조건 버림이니까 *19 말고 *20 먼저
		}
//		System.out.println(Arrays.toString(list)); //체크용
		
//		Q1: java.util.Random 배운적있나?
//		Q3: 마지막 컴마는 어떻게 제어하나... 
//		
		

		
		System.out.println("최대: ");
		max = scan.nextInt();
		scan.skip("\r\n");
			
		
		System.out.println("최소: ");
		min = scan.nextInt();
		scan.skip("\r\n");
		
		System.out.print("원본: ");
		System.out.println(Arrays.toString(list));
		
		System.out.print("결과: ");
		
	}
}
		
//		for (int i=0; i<list.length; i++) {
//				if (i==0) {
//							if (list[i] >= min && list[i] <= max) {
//								System.out.print(list[i] + ", ");
//							}		
//				}
//				if (i!=0) {
//							if (list[i] >= min && list[i] <= max) {
//								System.out.print(list[i] + ", ");
//							}
//				}
//				if (i>0 && i<list.length-1) {
//							if (list[i] >= min && list[i] <= max) {
//								System.out.print(", ");
//							}
//					
//				}
//			
//			}
//	scan.close();
//		}
//	
//}
