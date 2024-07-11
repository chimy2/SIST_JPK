package com.test.question.j;

import java.util.Arrays;

public class Q10078 {

	public static void main(String[] args) {

		int value = 1;
		int[][] list = new int[5][5];

		int top = 0, left = 0;
		int right = list.length - 1, bottom = list.length - 1;

		while (value <= list.length * list.length) {

			for (int i = left; i <= right && i <= list.length * list.length; i++) {
				list[top][i] = value++;
				show(list, value);
			}	top++;
//			top = 1
			for (int i = top; i <= bottom && i <= list.length * list.length; i++) {
				list[i][right] = value++;
				show(list, value);
			}	right--;
			
			for (int i = right; i >= left && i <= list.length * list.length; i--) {
				list[bottom][i] = value++;
				show(list, value);
			}	bottom--;
			
			for (int i = bottom; i >= top && i <= list.length * list.length; i--) {
				list[i][left] = value++;
				show(list, value);
			}	left++;
			
		}

		System.out.println();
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list.length; j++) {
				System.out.printf("%2d  ", list[i][j]);
			}
			System.out.println();
		}

	}// main

	private static void show(int[][] list, int value) {
		
		System.out.println();
		System.out.println(" " + (value -1));
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list.length; j++) {
				System.out.printf("%2d  ", list[i][j]);
			}
			System.out.println();
		}
	}


}// class
