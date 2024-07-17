package com.test.project;

import com.github.lalyos.jfiglet.FigletFont;

public class TennisView {

	public void mainMenu() {
		
		System.out.println("============================================================================================================");
		
		try {
			 String asciiArt1 = FigletFont.convertOneLine("TENNIS   SIMULATOR");
			    System.out.println(asciiArt1);
		} catch (Exception e) {
			System.out.println("TennisView.mainMenu");
			e.printStackTrace();
		}
	
		System.out.println("============================================================================================================");
		System.out.println("1.게임 시작");
		System.out.println("2.게임 기록");
		System.out.println("3.게임 정보");
		System.out.println("4.게임 설정");
		System.out.println("5.종료");
		System.out.println("------------------------------------------------------------------------------------------------------------");
		System.out.println("선택(번호): ");
	}

	public void subtitle(String string) {
		
		System.out.println();
		
		
	}

}
