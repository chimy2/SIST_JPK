package com.test.question.j;

import java.util.Scanner;

public class Q10026 {

/*

	[요구사항]
	학생의 국어 점수를 입력받아 성적을 출력하시오

	[조건]
	90 ~ 100: A
	80 ~  89: B
	70 ~  79: C
	60 ~  69: D
	 0 ~   59: F
	
	유효성 검사를 하시오.(점수: 0 ~ 100점 이내)
	
	case #1
	[입력]
	점수: 85 
	
	[출력]
	입력한 85점은 성적 B입니다.
	
	case #2
	[입력]
	점수: 55 
	
	[출력]
	입력한 55점은 성적 F입니다.
	
	case #3
	[입력]
	점수: 123 
	
	[출력]
	점수가 올바르지 않습니다. 0~100사이의 값을 입력하시오.
	
*/	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("국어 점수: ");
		int kor = scan.nextInt();
		
		if (kor <= 100 && kor >= 0) { //유효성 검사
			
				if (kor > 90) { //점수 구간 검사
					System.out.printf("입력하신 %d점은 성적 A 입니다.", kor);
				} else if (kor > 80) {
					System.out.printf("입력하신 %d점은 성적 B 입니다.", kor);
				} else if (kor > 70) {
					System.out.printf("입력하신 %d점은 성적 C 입니다.", kor);
				} else if (kor > 60) {
					System.out.printf("입력하신 %d점은 성적 D 입니다.", kor);
				} else {
					System.out.printf("입력하신 %d점은 성적 F 입니다.", kor);
				}

		} else { //유효성 검사 실패시 문구
			System.out.println("점수가 올바르지 않습니다.");
			System.out.println("0 ~ 100 사이의 값을 입력하시오.");
			
		}
		scan.close();
	}
}
