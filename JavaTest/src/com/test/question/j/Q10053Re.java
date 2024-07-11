package com.test.question.j;

public class Q10053Re {

	public static void main(String[] args) {
		
		for (int k=0; k<=4; k+=4) {
			for (int i=1; i<=9; i++) {
				for (int j=2+k; j<=5+k; j++) {
					System.out.printf("%-2dx%2d = %2d\t", j, i, j*i);
				}
				System.out.println();
			}
			System.out.println();
		}	
	}
}