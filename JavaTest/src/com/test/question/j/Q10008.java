package com.test.question.j;

import java.util.Scanner;

public class Q10008 {

/*
	  
	[요구사항]
	인삿말을 출력하는 메소드 3개를 선언하시오.
  
	[조건]
	- void hello()
	- void introduce()
	- void bye()

	[호출]
	- hello();
	- introduce();
	- bye();
	  
*/
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("귀하의 성함을 입력해주십시오. (3글자)");
		String inputName = scan.nextLine();
		System.out.println();
		
		hello(inputName);
		introduce(inputName);
		bye(inputName);
		scan.close();
		
	} //main

	public static void hello (String inputName) {
		
		System.out.printf("안녕하세요, %s님.\r\n처음 뵙겠습니다.\r\n", inputName);
		System.out.println();

	} //hello

	public static void introduce(String inputName) {
		
		
		
		char c1 = (char)inputName.charAt(0);
		char c2 = (char)inputName.charAt(1);
		char c3 = (char)inputName.charAt(2);
		
		
		System.out.printf(
							"%c%c... 와! 정말 좋은 이름이군요.\r\n"
						+ 	"%c 투더 %c 투더 %c!\r\n아아, 제 소개가 늦었군요.\r\n"
						+ 	"저는 홍길동입니다.\r\n"
							, c2, c3, c1, c2, c3);
		System.out.println();

	} //introduce

	public static void bye (String a) {
		System.out.printf("어이쿠, 이런. 벌써 시간이 이렇게 됐네요.\r\n안녕히 가세요, %s님.\r\n", a);
		System.out.println();
		
	} //bye

} //class
