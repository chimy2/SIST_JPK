package com.test.question.p;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Q121 {
//	파일입출력: 숫자 바꾸기
	public static void main(String[] args) {
//		요구사항] 숫자를 한글로 바꾼 뒤 파일을 다른 이름으로 저장하시오.
//			- 0 → 영, 1 → 일 ... 9 → 구
//			- 저장할 파일명: 숫자_변환.dat
		
//		리소스
//		파일 > 숫자.dat
		
//		출력
//		변환 후 다른 이름으로 저장하였습니다.
		
		String originPath = "dat\\숫자.dat";
		String afterPath = "dat\\숫자_변환.dat";
		String[] letters = { "영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구" };
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(originPath));
			
			String line = "";
			String result = "";
			
			while((line = reader.readLine()) != null) {
				for(int i=0; i<line.length(); i++) {
					char temp = line.charAt(i);
					int num = Character.getNumericValue(temp);
					if(num > -1) {
						result += letters[num];
					} else {
						result += temp;
					}
				}
				result += "\r\n";
			}
			
			reader.close();
			
			BufferedWriter writer = new BufferedWriter(new FileWriter(afterPath));
			
			writer.write(result);
			
			writer.close();
			
			System.out.println("변환 후 다른이름으로 저장했습니다.");
			
		} catch (Exception e) {
			System.out.println("Q121.main");
			e.printStackTrace();
		}
		
	}
}