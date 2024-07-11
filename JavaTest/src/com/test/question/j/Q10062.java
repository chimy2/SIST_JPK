package com.test.question.j;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Q10062 {

	public static void main(String[] args) {
	
		int n = 0;
		String name = "";
		
	Scanner scan = new Scanner(System.in);
	
	System.out.print("학생 수: ");
	
		n = scan.nextInt();
		scan.skip("\r\n");
		
		String[] students = new String[n];
		
		for (int i=0; i<students.length; i++) {
		
			System.out.print("학생명: ");
			name = scan.nextLine();
			students[i] = name;
		
		}
	
		for (int i=0; i<students.length; i++) {
			for (int j=0; j<students.length-1; j++) {
			
				if (students[j].compareTo(students[j+1]) > 0) {
						String temp = students[j];
						students[j] = students[j+1];
						students[j+1] = temp;
				}
				
			}
		}
		
		System.out.println(Arrays.toString(students));
	}
	
}
