package com.test.question.p;

import java.io.File;

public class Q117 {
//	파일디렉토리조작: 폴더 삭제
	private static int folderCount;
	private static int fileCount;
	
	public static void main(String[] args) {
//		요구사항] 내용물이 있는 'delete' 폴더를 삭제하시오.
//			- 재귀 메소드 사용
//			- 삭제된 파일과 자식 폴더 개수를 출력하시오.
		
//		리소스
//		폴더 > 폴더 삭제
		
//		출력
//		폴더를 삭제했습니다. 
//		삭제된 폴더는 3개이고, 파일은 6개입니다.
		
		String path = System.getProperty("user.dir");
		
		path += "\\src\\" + Q117.class.getPackageName().replace(".", "\\");
		path += "\\resource\\폴더 삭제\\\\delete";
		
		File dir = new File(path);
		
		if(dir.exists()) {
			for(File file : dir.listFiles()) {
				delete(file);
			}
			System.out.println("폴더를 삭제했습니다");
			System.out.printf("삭제된 폴더는 %,d개이고, 파일은 %,d개입니다.", 
					Q117.folderCount, Q117.fileCount);
		} else {
			System.out.println("해당 경로가 존재하지 않습니다.");
		}
	}

	private static void delete(File file) {
		if(file.isDirectory()) {
			for(File f : file.listFiles()) {
				delete(f);
			} 
			folderCount++;
		} else {
			fileCount++;
		}
		file.delete();
	}
}
