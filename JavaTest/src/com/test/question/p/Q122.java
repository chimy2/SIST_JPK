package com.test.question.p;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Q122 {
//	파일입출력: 성적 처리
	public static void main(String[] args) {
//		요구사항] 성적을 확인 후 합격자/불합격자 명단을 출력하시오.
//			- 합격 조건: 3과목 평균 60점 이상
//			- 과락 조건: 1과목 40점 미만
		
//		리소스
//		파일 > 성적.dat
		
//		데이터
//		//이름,국어,영어,수학
//		홍길동,50,60,70
//		아무개,100,80,50
//		하하하,98,48,56
		
//		출력
//		[합격자] 
//		홍길동 
//		하하하 
//		아무개 
//
//		[불합격자] 
//		호호호 
//		후후후 
		
		String path = "dat\\성적.dat";
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(path));
			ArrayList<String> pass = new ArrayList<String>();
			ArrayList<String> fail = new ArrayList<String>();
			
			String line = "";
			
			while((line = reader.readLine()) != null) {
				Candidate candidate = new Candidate(line);
				
				if(candidate.isPass()) {
					pass.add(candidate.getName());
				} else {
					fail.add(candidate.getName());
				}
				
			}
			reader.close();

			System.out.println("[합격자]");
			for(String name : pass) {
				System.out.println(name);
			}
			System.out.println();
			
			System.out.println("[불합격자]");
			for(String name : fail) {
				System.out.println(name);
			}
			
		} catch (Exception e) {
			System.out.println("Q122.main");
			e.printStackTrace();
		}
		
	}
}

class Candidate {
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public Candidate(String str) {
		String[] arr = str.split(",");

		this.name = arr[0];
		this.kor = Integer.parseInt(arr[1]);
		this.eng = Integer.parseInt(arr[2]);
		this.math = Integer.parseInt(arr[3]);
	}
	
	public boolean isPass() {
		if(this.kor < 40 || this.eng < 40 || this.math < 40
				|| getAvg() < 60 ) {
			return false;
		}
		return true;
	}
	
	public int getAvg() {
		return (this.kor + this.eng + this.math) / 3;
	}
	
	public String getName() {
		return this.name;
	}
}
