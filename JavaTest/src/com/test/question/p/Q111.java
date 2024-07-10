package com.test.question.p;

import java.io.File;
import java.util.Scanner;

public class Q111 {
//	파일디렉토리조작: 확장자 검색
	public static void main(String[] args) {
//		요구사항] 지정한 폴더의 특정 파일(확장자)만을 출력하시오.
//			- 확장자 대소문자 구분없이 검색 가능
		
//		입력1
//		폴더: C:\class\eclipse 
//		확장자: exe 

//		출력1
//		eclipse.exe 
//		eclipsec.exe
		
//		입력2
//		폴더: C:\class\eclipse 
//		확장자: xml 

//		출력2
//		artifacts.xml
//		구글.XML
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("폴더: ");
		String path = scan.nextLine().trim().toLowerCase();
		
		System.out.print("확장자: ");
		String ext = scan.next().trim().toLowerCase();
		
		File dir = new File(path);
		
		if(dir.exists()) {
			for(File file: dir.listFiles()) {
				String fileName = file.getName().toLowerCase();
				if(fileName.endsWith("." + ext)) {
					System.out.println(fileName);
				}
			}
		} else {
			System.out.println("입력한 경로가 올바르지 않습니다.");
		}
	}
}
