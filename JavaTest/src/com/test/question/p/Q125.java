package com.test.question.p;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

public class Q125 {
//	파일입출력: 괄호 검사
	public static void main(String[] args) {
//		요구사항] 모든 괄호가 서로 짝이 맞는지 검사하시오.
//			- 대상 괄호: (), {}
//			- Stack 사용
		
//		리소스
//		파일 > 괄호.dat
		
//		출력1
//		올바른 소스입니다.
		
//		출력2
//		올바르지 않은 소스입니다.

		String path = "dat\\괄호.dat";
		Parentheses parentheses = new Parentheses();
		boolean check = true;
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(path));
			
			String line = "";
			
			while((line = reader.readLine()) != null) {
				for(char c : line.toCharArray()) {
					parentheses.check(c);
				}
			}
		} catch(IOException e) {
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(check) {
				System.out.println("올바른 소스입니다.");
			} else {
				System.out.println("올바르지 않은 소스입니다.");
			}
		}
	}
}

class Parentheses extends Stack<Boolean> {
	public void check(Character c) throws Exception {
		System.out.println(c);
		if(c == '{') {
			push(true);
		} else if(c == '(') {
			push(false);
		} else if(c == '}') {
			if(!peek()) {
				throw new Exception("잘못된 괄호");
			} else {
				pop();
			}
		} else if(c == ')') {
			if(peek()) {
				throw new Exception("잘못된 괄호");
			} else {
				pop();
			}
		}
	}
}