package com.test.question.p;

import java.io.File;
import java.util.Scanner;

public class Q110 {
//	파일디렉토리조작: 파일 정보
	public static void main(String[] args) {
//		요구사항] 파일의 경로를 입력받아 파일 정보를 출력하시오.
//			- 파일 크기 단위 변환 출력(소수이하 1자리까지) : B, KB, MB, GB, TB
		
//		입력1
//		파일 경로 : D:\class\java\file\test.txt 

//		출력1
//		파일명 : test.txt 
//		종류 : txt 파일 
//		파일 크기 : 45B 
		
//		입력2
//		파일 경로 :1 C:\movie\SpriderMan.mp4 

//		출력2
//		파일명 : SpriderMan.mp4
//		종류 : mp4 파일 
//		파일 크기 : 2.54TB 
		
		String[] sizes = { "B", "KB", "MB", "GB", "TB" }; 
		Scanner scan = new Scanner(System.in);
		
		System.out.print("파일 경로 : ");
		String path = scan.nextLine();
		
		File file = new File(path);
		String fileName = file.getName();
		
		System.out.println("파일명 : " + fileName);
		System.out.println("종류 : " + fileName.substring(fileName.lastIndexOf('.') + 1) + " 파일");
		
		long size = file.length();
		
		for(int i=0; i<sizes.length; i++) {
			if(i == sizes.length - 1 || size / 1024 == 0) {
				System.out.println("파일크기 : " + size + sizes[i]);
				break;
			} else {
				size /= 1024;
			}
		}
		
		
	}
}
