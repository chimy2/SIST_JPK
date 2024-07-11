package com.test.question.j;


import java.util.Calendar;
import java.util.Scanner;

public class Q10032 {

/*
	[요구사항]
	주차 요금을 계산하시오
*/
/*
	[조건]
	무료 주차: 30분
	초과 10분당: 2,000원
*/
/*	
	[입력]
	[들어온 시간]
	시: 13 
	분: 30 
	
	[나간 시간]
	시: 14 
	분: 20 
*/
/*
	[출력]
	주차 요금은 4,000원입니다.
 */
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		
		Calendar in = Calendar.getInstance();
		Calendar out = Calendar.getInstance();
		int inMinute = 0;
		int inHour = 0;
		int outMinute = 0;
		int outHour = 0;
		long gap = 0;
		long fee = 0;
		
		System.out.println("들어온 시간");
		System.out.println("시: ");
		inHour = scan.nextInt();
		scan.skip("\r\n");
		System.out.println();
		
		System.out.println("분: ");
		inMinute = scan.nextInt();
		scan.skip("\r\n");
		System.out.println();
		
		
		System.out.println("나간 시간");
		System.out.println("시: ");
		outHour = scan.nextInt();
		scan.skip("\r\n");
		System.out.println();
		
		
		System.out.println("분: ");
		outMinute = scan.nextInt();
		scan.skip("\r\n");
		System.out.println();
		
		in.set(Calendar.HOUR_OF_DAY, inHour);
		in.set(Calendar.MINUTE, inMinute);

		out.set(Calendar.HOUR_OF_DAY, outHour);
		out.set(Calendar.MINUTE, outMinute);
		
		System.out.println(in.getTimeInMillis());
		System.out.println(out.getTimeInMillis());
		
		gap = out.getTimeInMillis() - in.getTimeInMillis();
		fee = (((gap / 1000 / 60) - 30) / 10) * 2000;
		
//		삼항연산자 사용해서 gap > 30 ? (gap - 30) / 10 * 2000 : 0;
		
		System.out.printf("주차 요금은 %,d입니다.\r\n", fee);

		
		
/*
		System.out.println(timeOut.getTimeInMillis()); //1719785909007
		System.out.println(timeIn.getTimeInMillis()); //1719806729002
		System.out.println(); //why timeIn > timeOut??? -> you done fucked up probably..
		
		timeGap = timeOut.getTimeInMillis() - timeIn.getTimeInMillis();
		timeGap = timeGap / 1000 / 60 ;
		System.out.println(timeGap);
*/	
				
				
		scan.close();
	
	}
	
	
}
