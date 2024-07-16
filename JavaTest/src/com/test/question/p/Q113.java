package com.test.question.p;

import java.io.File;
import java.util.Arrays;

public class Q113 {
//	파일디렉토리조작: 일련번호
	public static void main(String[] args) {
//		요구사항] 음악 파일이 100개 있다. 파일명 앞에 일련 번호를 붙이시오.
//			- '001'부터 3자리 형식으로 붙이시오.
		
//		리소스
//			- 폴더 > 음악 파일
		
//		출력
//		[001]1도 없어 - Apink (에이핑크).mp3 
//		[002]11 (Prod. 다이나믹듀오) - Wanna One (워너원) - 남바완.mp3 
//		[003]134340 - 방탄소년단.mp3
//		..
//		[100]花요일 (Blooming Day) - EXO-CBX (첸백시).mp3
		
		String path = System.getProperty("user.dir");	//C:\class\code\java\JavaTest
		
		path += "\\src\\" + Q113.class.getPackageName().replace(".", "\\");
		path += "\\resource\\음악 파일\\Music";
		
		File dir = new File(path);
		
		if(dir.exists()) {
			File[] list = dir.listFiles();

			for(int i=0; i<list.length; i++) {
				String newName = String.format("%s\\[%03d]%s", path, (i + 1), list[i].getName());
				File renameFile = new File(newName);
				list[i].renameTo(renameFile);
				System.out.println(renameFile.getName());
			}
		} else {
			System.out.println("해당 폴더가 없습니다.");
		}
	}
}
