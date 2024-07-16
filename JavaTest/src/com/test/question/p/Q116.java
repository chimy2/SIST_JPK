package com.test.question.p;

import java.io.File;

public class Q116 {
//	파일디렉토리조작: 중복 파일
	public static void main(String[] args) {
//		요구사항] MusicA 폴더와 MusicB 폴더를 서로 비교해서 양쪽 폴더에 모두 존재하는 파일만을 출력하시오.
//			- 중복 파일을 찾아내시오.
		
//		리소스
//		폴더 > 동일 파일
		
//		출력
//		BAAM - 모모랜드 (MOMOLAND).mp3 
//		Dejavu - 볼빨간사춘기.mp3 
//		SoulMate (Feat. 아이유) - 지코 (ZICO).mp3 
//		..
		
		String path = System.getProperty("user.dir");
		
		path += "\\src\\" + Q116.class.getPackageName().replace(".", "\\");
		path += "\\resource\\동일 파일";
		
		File dir1 = new File(path + "\\MusicA");
		File dir2 = new File(path + "\\MusicB");
		
		if(dir1.exists() && dir2.exists()) {
			File[] list1 = dir1.listFiles();
			File[] list2 = dir2.listFiles();
			
			int index1 = 0;
			int index2 = 0;
			
			while(index1 < list1.length && index2 < list2.length) {
				String name1 = list1[index1].getName();
				String name2 = list2[index2].getName();
				if(name1.compareTo(name2) > 0) {
					index2++;
				} else if(name1.compareTo(name2) < 0) {
					index1++;
				} else {
					System.out.println(name1);
					index1++;
					index2++;
				}
			}
			
		} else {
			System.out.println("해당 경로들이 존재하지 않습니다.");
		}
	}
}
