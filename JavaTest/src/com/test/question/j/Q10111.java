package com.test.question.j;

import java.io.File;
import java.util.Scanner;

public class Q10111 {

	public static void main(String[] args) {
		
		String path = "";
		String extension = "";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("폴더: ");
		path = scan.nextLine();
		
//		path = scan.nextLine().trim().toLowerCase(); // 공백 유효성 검사 + 대소문자 안 구분 미리 적용
		
		
		System.out.println("확장자: ");
		extension = scan.nextLine();
		
		File dir = new File(path);
		
		File[] list = dir.listFiles();
		
		for (File file : list) {
			if (file.getName().toLowerCase().endsWith(extension.toLowerCase())) {
				System.out.println(file.getName());
			}
		}
		scan.close();
		
		
	}//main
	
}//class