package com.test.question.p;

import java.io.File;
import java.util.ArrayList;

public class Q118 {
//	파일디렉토리조작: 정렬
	public static void main(String[] args) {
//		요구사항] 폴더 내의 모든 파일들을 찾아 크기를 비교하고, 크기가 큰 순으로 정렬하시오.
//			- 자식 폴더내의 파일도 모두 검색하시오.
//			- 부모 자식 폴더에 상관없이 파일을 한번에 비교하시오.
		
//		리소스
//		폴더 > 크기 정렬
		
//		출력
//		[파일명]      [크기]     [파일이 들어있는 폴더]
//		aaa.exe    57KB    AAA 
//		bbb.exe    50KB    BBB 
//		ccc.dat     41KB    AAA 
//		ddd.txt     20KB    CCC 
//		..	
		ArrayList<FileInfo> files = new ArrayList<FileInfo>();
		
		String path = System.getProperty("user.dir");
		
		path += "\\src\\" + Q118.class.getPackageName().replace(".", "\\");
		path += "\\resource\\크기 정렬";
		
		File dir = new File(path);
		
		if(dir.exists()) {
			addElement(files, dir, path);
			
			files.sort((o1, o2) -> (int)(o2.getSize() - o1.getSize()));
			
			System.out.printf("[%15s\t\t][%15s\t\t][%15s\t]\r\n", "파일명", "크기", "파일이 들어있는 폴더");
			for(FileInfo file : files) {
				System.out.println(file);
			}
		} else {
			System.out.println("해당 경로가 존재하지 않습니다.");
		}
	}
	
	private static void addElement(ArrayList<FileInfo> list, File file, String path) {
		if(file.isDirectory()) {
			for(File f : file.listFiles()) {
				addElement(list, f, path);
			}
		} else {
			String name = file.getName();
			FileInfo info = new FileInfo(name, file.length(), file.getPath().replace(path, "").replace(name, ""));
			list.add(info);
		}
	}
}

class FileInfo {
	private String name;
	private long size;
	private String location;
	
	public FileInfo(String name, long size, String location) {
		super();
		this.name = name;
		this.size = size;
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getSize() {
		return size;
	}

	public void setSize(long size) {
		this.size = size;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	public String getRealFileSize() {
		String[] sizes = { "B", "KB", "MB", "GB", "TB" };
		long size = this.size;
		
		for(int i=0; i<sizes.length; i++) {
			if(i == sizes.length - 1 || size / 1024 == 0) {
				return size + sizes[i];
			} else {
				size /= 1024;
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return String.format("%30s\t%20s\t%20s", name, getRealFileSize(), location);
	}
}