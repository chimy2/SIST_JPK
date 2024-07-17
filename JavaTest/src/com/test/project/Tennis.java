package com.test.project;

import java.util.Scanner;

public class Tennis {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		TennisService service = new TennisService();
		TennisView view = new TennisView();
		
		boolean loop = true;
		while (loop) {
			
			view.mainMenu();
			
			String input = scan.nextLine();
			
			if (input.equals("1")) {
				service.gameSetup();
			} else if (input.equals("2")) {
				service.gameRecord();
			} else if (input.equals("3")) {
				service.gameInfo();
			} else if (input.equals("4")) {
				service.gameSetting();
			} else if (input.equals("5")) {
				loop = false;
//				service.gameEnd
			} else {
				loop = false;
			}
			
			
		}
		System.out.println("게임 종료");
		scan.close();
		
	}//main
	
	
}//class
