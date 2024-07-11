package com.test.question.p;

import java.io.File;
import java.util.HashMap;

public class Q114 {
//	파일디렉토리조작: 확장자 카운트
	public static void main(String[] args) {
//		요구사항] 이미지 파일이 있다. 확장자별로 파일이 몇개 있는지 세시오.
//			- 새로운 확장자 파일이 추가되도 동작이 가능하게 구현하시오.
//			- 'mouse.bmp' 추가를 하면.. 소스 수정 없이도 *.bmp : 1개 출력이 되게 하시오.
		
//		리소스
//		폴더 > 확장자별 카운트
		
//		출력
//		*.gif: 10개 
//		*.jpg: 5개 
//		*.png: 3개 
		
		String path = System.getProperty("user.dir");
		
		path += "\\src\\" + Q114.class.getPackageName().replace(".", "\\");
		path += "\\resource\\확장자별 카운트";
		
		File dir = new File(path);
		HashMap<String, Integer> extCount = new HashMap<>();
		
		if(dir.exists()) {
			File[] list = dir.listFiles();

			for(File file : list) {
				if(file.isFile()) {
					String fileName = file.getName();
					String ext = fileName.substring(fileName.lastIndexOf(".") + 1);
					
					if(extCount.containsKey(ext)) {
						extCount.put(ext, extCount.get(ext) + 1);
					} else {
						extCount.put(ext, 1);
					}
				}
			}

			extCount.forEach((ext, count) -> {
				System.out.printf("*.%s: %d개\n", ext, count);
			});
				
		} else {
			System.out.println("해당 폴더가 없습니다.");
		}
		
	}
}
