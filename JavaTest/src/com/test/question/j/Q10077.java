package com.test.question.j;

import java.util.Arrays;

public class Q10077 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		int[][] matrix = new int[5][5];
		
		for (int i=0; i<matrix.length; i++) {
			
			for (int j=0; j<matrix.length; j++) {
					
	
					sum++;
					matrix[i][j] = sum;
					System.out.printf("%2d  ",matrix[i][j]);
			}
				System.out.println();
			}
			
		
		
		
	}//main
	
}//class
