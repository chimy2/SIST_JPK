package com.test.question.p;

import java.io.File;

public class Q115 {
//	파일디렉토리조작: 파일 삭제
	public static void main(String[] args) {
//		요구사항] 파일의 크기가 0byte인 파일만 삭제하시오.
			
//		리소스
//		폴더 > 파일 제거
		
//		출력
//		총 34개의 파일을 삭제했습니다.
		
		String path = System.getProperty("user.dir");
		
		path += "\\src\\" + Q115.class.getPackageName().replace(".", "\\");
		path += "\\resource\\파일 제거";
		
		File dir = new File(path);
		
		if(dir.exists()) {
			File[] list = dir.listFiles();
			int count = 0;
			
			for(int i=0; i<list.length; i++) {
				if(list[i].length() == 0) {
					list[i].delete();
					count++;
				}
			}
			
			System.out.printf("총 %,d개 파일을 삭제했습니다.", count);
		} else {
			System.out.println("해당 경로가 존재하지 않습니다.");
		}
		
	}
}
