package com.test.question.p;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Q119 {
//	파일디렉토리조작: 분류 이동
	public static void main(String[] args) {
//		요구사항] 아래의 조건에 따라 파일을 폴더별로 분류/이동하시오.
//			- 1차: 직원 이름으로 폴더 생성
//			- 2차: 년도별로 폴더 생성
//			- 3차: 각 파일을 직원 > 년도 폴더에 이동
		
//		리소스
//		폴더 > 직원
		
//		출력
//		분류가 완료되었습니다.
		
		HashMap<String, HashMap<String, ArrayList<File>>> categories = new HashMap<String, HashMap<String, ArrayList<File>>>();
		String path = System.getProperty("user.dir");
		
		path += "\\src\\" + Q119.class.getPackageName().replace(".", "\\");
		path += "\\resource\\직원";
		
		File dir = new File(path);
		
		if(dir.exists()) {
			for(File file : dir.listFiles()) {
				String[] filename = file.getName().split("_");
				
				String name = filename[0];
				String year = filename[1];
				
				if(categories.containsKey(name)) {
					HashMap<String, ArrayList<File>> subCategories = categories.get(name);
					
					if(!subCategories.containsKey(year)) {
						subCategories.put(year, new ArrayList<File>());
					}
					subCategories.get(year).add(file);
				} else {
					ArrayList<File> list = new ArrayList<File>();
					list.add(file);
					
					HashMap<String, ArrayList<File>> tempMap = new HashMap<String, ArrayList<File>>();
					tempMap.put(year, list);
					
					categories.put(name, tempMap);
				}
			}
			
			for(Entry<String, HashMap<String, ArrayList<File>>> nameEntry : categories.entrySet()) {
				String name = nameEntry.getKey();
				
				for(Entry<String, ArrayList<File>> yearEntry : nameEntry.getValue().entrySet()) {
					String year = yearEntry.getKey();
					
					String newLocation = path + "\\" + name + "\\" + year;
					File newDir = new File(newLocation);
					
					newDir.mkdirs();
					
					for(File file : yearEntry.getValue()) {
						File moveFile = new File(newLocation + "\\" + file.getName());
						file.renameTo(moveFile);
					}
				}
			}
			System.out.println("분류가 완료되었습니다.");
		} else {
			System.out.println("해당 경로가 존재하지 않습니다.");
		}
	}
}
