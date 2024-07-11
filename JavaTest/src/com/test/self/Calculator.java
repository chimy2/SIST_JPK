package com.test.self;

//이것이 자바다 교재 236페이지 참조

public class Calculator {
	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		
		myCalc.powerOn();
		int result1 = myCalc.plus(5, 6);
		System.out.println("result1: " + result1);
		int x = 10;
		int y = 4;
		
		double result2 = myCalc.divide(x, y);
		
	}//main
	
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	double divide (int x, int y) {
		double result = (double)x / (double)y;
		return result;
	}
	
}//class
