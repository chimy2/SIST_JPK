package com.test.question.j;

public class Q10041 {
	public static void main(String[] args) {
		
		int sum = 0;
		
		
		for (int i=1; i<=100; i++) {//초기식, 조건식, 증감식 하나씩만 생략도 가능
		
			sum += i;
			
			System.out.print(i);
			
			if (sum < 1000) {
			
				System.out.print(" + ");
			} else {
			
				break;
			}
//			System.out.print(" = " + sum);
		}	
		System.out.print(" = " + sum);
		}
}