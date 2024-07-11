package com.test.question.j;

import java.util.Scanner;

public class Q10061 {

	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
	
		int n = 0;
		int[] nums = new int[5];
		
		
		for (int i=0; i<nums.length; i++) {

			System.out.println("숫자: ");
			n = scan.nextInt();
			scan.skip("\r\n");
			nums[i] = n;
		}
		
		for (int i=nums.length-1; i>=0; i--) {
			
			System.out.printf("nums[%d] = %d\r\n", i, nums[i]);
		}
		scan.close();
	}
	
}
