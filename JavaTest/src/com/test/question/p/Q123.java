package com.test.question.p;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Q123 {
//	파일입출력: 회원 검색
	public static void main(String[] args) {
//		요구사항] 이름을 입력받아 회원 정보를 검색 후 출력하시오.
			
//		리소스
//		파일 > 단일검색.dat
		
//		입력
//		이름: 홍길동 

//		출력
//		[홍길동] 
//		번호: 33 
//		주소: 서울시 강남구 역삼동 
//		전화: 010-2345-6789 
		
		String path = "dat\\단일검색.dat";
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(path));
			Scanner scan = new Scanner(System.in);
			
			System.out.print("이름: ");
			String name = scan.nextLine();
			
			String line;
			Member member = null;
			
			while((line = reader.readLine()) != null) {
				Member temp = new Member(line);
				if(temp.equals(name)) {
					member = temp;
					break;
				}
			}
			
			reader.close();
			
			if(member != null) {
				System.out.println(member);
			} else {
				System.out.println("회원이 없습니다.");
			}
			
		} catch (Exception e) {
			System.out.println("Q123.main");
			e.printStackTrace();
		}
		
	}
}

class Member {
	private int no;
	private String name;
	private String address;
	private String tel;
	
	public Member(String str) {
		String[] arr = str.split(",");
		
		this.no = Integer.parseInt(arr[0]);
		this.name = arr[1];
		this.address = arr[2];
		this.tel = arr[3];
	}
	
	public boolean equals(String name) {
		if(this.name.equals(name)) {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		String result = "";
		
		result += String.format("[%s]\r\n", this.name);
		result += String.format("번호: %d\r\n", this.no);
		result += String.format("주소: %s\r\n", this.address);
		result += String.format("전화: %s\r\n", this.tel);
		
		return result;
	}
}
