package com.test.question.j;

import java.util.Scanner;

public class Q10027 {

/*
	[요구사항]
	문자 1개를 입력받아 아래와 같이 출력하시오
	
	[조건]
	f, F → Father
	m, M → Mother
	s, S → Sister
	b, B → Brother
	
	유효성 검사를 하시오.(위의 문자가 아닌 문자는 예외 처리)
	
	[입력]
	문자: f 
	
	[출력]
	Father
	
	[입력]
	문자: F 
	
	[출력]
	Father

	[입력]
	문자: s 
	
	[출력]
	Sister
	
	[입력]
	문자: a 
	
	[출력]
	입력한 문자가 올바르지 않습니다.
	
*/
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("문자: ");
		String input = scan.nextLine();
		

			if	(input.equals("b") || input.equals("B")
			||  input.equals("f") ||  input.equals("F")
			||  input.equals("m") ||  input.equals("M")
			||  input.equals("s") ||  input.equals("S")) {
				
						
							//유효성 체크 통과 시
								if (input.equals("b") || input.equals("B")) {
									System.out.println("Brother");
							} else if (input.equals("s") || input.equals("S")) {
									System.out.println("Sister");
							} else if (input.equals("m") || input.equals("M")) {
									System.out.println("Mother");
							} else if (input.equals("f") || input.equals("F")) {
									System.out.println("Father");
							}	
								
			}
				
			//유효성 체크 실패 시
			else { System.out.println("입력한 문자가 올바르지 않습니다."); }
			scan.close();
			}
	
}
