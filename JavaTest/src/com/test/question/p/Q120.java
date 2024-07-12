package com.test.question.p;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Q120 {
//	파일입출력: 이름 바꾸기
	public static void main(String[] args) {
//		요구사항] 특정 이름을 찾아 다른 이름으로 변환 후 파일을 다른 이름으로 저장하시오.
//			- '유재석' → '메뚜기'
//			- 저장할 파일명: 이름수정_변환.dat
		
//		리소스
//		파일 > 이름수정.dat
		
//		출력
//		변환 후 다른 이름으로 저장하였습니다.
		
		String originPath = "dat\\이름수정.dat";
		String afterPath = "dat\\이름수정_변환.dat";
		
		String beforeName = "유재석";
		String afterName = "메뚜기";
		try {
			BufferedReader reader = new BufferedReader(new FileReader(originPath));
			
			String line = "";
			String result = "";
			
			while((line = reader.readLine()) != null) {
				result += line.replace(beforeName, afterName) + "\r\n";
			}
			reader.close();
			
			BufferedWriter writer = new BufferedWriter(new FileWriter(afterPath));
			
			writer.write(result);
			
			writer.close();
			
			System.out.println("변환 후 다른 이름으로 저장하였습니다.");
		} catch (Exception e) {
			System.out.println("Q120.main");
			e.printStackTrace();
		}
	}
}
