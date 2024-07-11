package com.test.question.j;
import java.util.Scanner;
public class Q10031 {
/*	
[요구사항]
숫자 5개를 입력받아 짝수와 홀수의 개수를 출력하시오
*/

/*	
[입력]
숫자 입력: 3 
숫자 입력: 2 
숫자 입력: 7 
숫자 입력: 1 
숫자 입력: 8 
*/	

/*	
[출력]
짝수는 2개 홀수는 3개 입력했습니다
홀수가 짝수보다 1개 더 많습니다
*/	

	public static void main(String[] args) {
	
		
//		for문 으로 스캔 반복 가능
		
		Scanner scan = new Scanner(System.in);
	
		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		int n4 = 0;
		int n5 = 0;
		
		int numEven = 0;
		int numOdd = 0;
		
		System.out.println("숫자 입력: ");
		n1 = scan.nextInt();
		scan.skip("\r\n");
		
		if (n1 % 2 == 0 ) {
			numEven += 1;
		} else if  (n1 % 2 == 1 ) {
			numOdd += 1;
		}
		
		System.out.println("숫자 입력: ");
		n2 = scan.nextInt();
		scan.skip("\r\n");
		
		if (n2 % 2 == 0 ) {
			numEven += 1;
		} else if  (n2 % 2 == 1 ) {
			numOdd += 1;
		}
		
		System.out.println("숫자 입력: ");
		n3 = scan.nextInt();
		scan.skip("\r\n");
		
		if (n3 % 2 == 0 ) {
			numEven += 1;
		} else if  (n3 % 2 == 1 ) {
			numOdd += 1;
		}
		
		System.out.println("숫자 입력: ");
		n4 = scan.nextInt();
		scan.skip("\r\n");
		
		if (n4 % 2 == 0 ) {
			numEven += 1;
		} else if  (n4 % 2 == 1 ) {
			numOdd += 1;
		}
		
		System.out.println("숫자 입력: ");
		n5 = scan.nextInt();
		scan.skip("\r\n");
		
		if (n5 % 2 == 0 ) {
			numEven += 1;
		} else if  (n5 % 2 == 1 ) {
			numOdd += 1;
		}


		System.out.printf("입력하신 숫자는 %d, %d, %d, %d, %d 입니다.\r\n", n1, n2, n3, n4, n5);
		System.out.println();
		
		System.out.printf("짝수는 %d개 홀수는 %d개 입력했습니다.\r\n", numEven, numOdd);
		if (numOdd > numEven) {
			System.out.printf("홀수가 짝수보다 %d개 많습니다.", numOdd - numEven);
		} else {
			System.out.printf("짝수가 홀수보다 %d개 많습니다.", numEven - numOdd);
		}

		scan.close();
		
	}

}
