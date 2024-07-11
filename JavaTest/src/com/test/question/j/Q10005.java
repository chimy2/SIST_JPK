package com.test.question.j;

import java.util.Scanner;

public class Q10005 {

//	Math.PI = 자바에서 기본적으로 제공하는 원주율 상수
	
/*
	[요구사항]
	자전거가 있다. 자전거의 바퀴는 지름(직경)이 26인치이다
	사용자가 페달을 밟은 횟수를 입력하면 자전거가 총 몇 m를 달렸는지 출력하시오
	
	[조건]
	- 기어비 1:1 → 페달 1회전 == 자전거 바퀴 1회전
	- 모든 출력 숫자는 천단위 표기하시오
	
*/
public static void main(String[] args) {
		
	distanceCheck();
	
	}
		
	public static void distanceCheck() {
		
	Scanner scan = new Scanner(System.in);
	System.out.println("페달 밟은 횟수: ");
	
	double revolution = scan.nextInt();
	double radiusImperial = 13;
	double radiusMetric = radiusImperial * 2.54;
	final double PI = 3.14;
	double circumferenceMetric = 2 * PI * radiusMetric;
	double distanceTraveled = circumferenceMetric * revolution;
	System.out.println();
	
	System.out.printf("사용자가 %,.0f회 페달을 밟아서\r\n총 이동거리는 %,.0fm입니다.\r\n"
					, revolution, distanceTraveled);
		
		scan.close();	
	}
}
