package com.test.question.p;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q112 {
//	파일디렉토리조작: 파일 이동
	public static void main(String[] args) {
//		요구사항] 지정한 파일을 다른 폴더로 이동하고, 이동한 파일과 동일한 파일명의 파일이 존재하는 경우 중복 처리하시오.
//			- C:\class\java\file\AAA\test.txt → C:\class\java\file\BBB\test.txt 로 이동하는 것이 목적
//			- BBB 폴더에 이미 test.txt가 있을 경우 덮어쓰거나(y) 작업을 취소(n) 하시오.
		
//		입력1
//		파일 이동을 실행합니다.
//		같은 이름을 가지는 파일이 이미 존재합니다. 덮어쓸까요?(y/n) y 

//		출력1
//		y. 파일을 덮어썼습니다.
		
//		입력2
//		파일 이동을 실행합니다.
//		같은 이름을 가지는 파일이 이미 존재합니다. 덮어쓸까요?(y/n) n 

//		출력2
//		n. 작업을 취소합니다.
		
		Scanner scan = new Scanner(System.in);
		String path = "C:\\class\\java\\file\\AAA";
		String path2 = "C:\\class\\java\\file\\BBB";
		
		System.out.println("파일 이동을 실행합니다.");
		
		File file = new File(path);
		File file2 = new File(path2);
		
		file = createNewFile(file, path);
		file2 = createNewFile(file2, path2);
		
		writeFile(file, "AAA폴더의 test파일입니다.");
		writeFile(file2, "BBB폴더의 test파일입니다.");
		
		System.out.print("같은 이름을 가지는 파일이 이미 존재합니다. 덮어쓸까요?(y/n)");
		String input = scan.nextLine();

		if(input.equals("y")) {
			file2.delete();
			file.renameTo(file2);
			System.out.println("y. 파일을 덮어썼습니다.");
		} else if(input.equals("n")) {
			System.out.println("n. 작업을 취소합니다.");
		} else {
			System.out.println("잘못된 입력입니다.");
		}
		
	}
	
	public static void writeFile(File file, String content) {
		try {
			FileWriter fw = new FileWriter(file);
			BufferedWriter writer = new BufferedWriter(fw);
			
			writer.write(content);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static File createNewFile(File file, String path) {
		file.mkdirs();
		
		file = new File(path + "\\test.txt");
		
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return file;
	}
}
