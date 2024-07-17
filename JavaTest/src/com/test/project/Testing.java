package com.test.project;

import java.util.Random;
import java.util.Scanner;

public class Testing {

	private int chance;
	private int point;
	
	private int pointGame;
	private int pointSet;
	
	static int countServe;
	static int countTotalServe;
	static int countGame;
	static int countSet;
	
	public static void main(String[] args) {

//		m1();
		m2();
		
	

	
	}//main


private static void m2() {

		Scanner scan = new Scanner(System.in);
		Testing me = new Testing();
		Testing cpu = new Testing();
		
		String p1 = "Player1";
		String p2 = "Player2";
		
		countServe = 1;
		countTotalServe = 1;
		countGame = 1;
		countSet = 1;

		boolean loop = true;
		while (loop) {
			
			
			Random rnd = new Random();
			me.chance = rnd.nextInt(100)+1+50;
			cpu.chance = rnd.nextInt(100)+1;
			
			
			//포인트 조건
			System.out.println();
			System.out.printf("%d세트 %d게임 %d회차 서브\r\n", countSet, countGame, countTotalServe);
			
			if (me.chance > cpu.chance) {
				me.point++;
				countTotalServe++;
				countServe++;
				System.out.println(p1 + " 득점!");
			} else if (me.chance < cpu.chance) {
				cpu.point++;
				countTotalServe++;
				countServe++;
				System.out.println(p2 + " 득점!");			
			} else {
				continue;
			}
			System.out.println(me.point + "-" + cpu.point);
			System.out.println("[확인]");
			emptyScreen();
			scan.nextLine();
			
			
			//게임 포인트 조건
			if (me.point > 3 && me.point - cpu.point > 1) {
				me.pointGame++;
				me.point = 0;
				cpu.point = 0;
				System.out.println();
				System.out.printf("%d세트 %d게임의 승자는 %s입니다.\r\n", countSet, countGame, p1);
				System.out.printf("현재 게임 스코어는 [%d-%d] 입니다.\r\n", me.pointGame, cpu.pointGame);
				System.out.println("다음 게임을 시작합니다.");
				System.out.println("[확인]");
				emptyScreen();
				countGame++;
				countTotalServe = 1;
				scan.nextLine();
			} else if (cpu.point > 3 && cpu.point - me.point > 1) {
				cpu.pointGame++;
				me.point = 0;
				cpu.point = 0;
				System.out.println();
				System.out.printf("%d세트 %d게임의 승자는 %s입니다.\r\n", countSet, countGame, p2);
				System.out.printf("현재 게임 스코어는 [%d-%d] 입니다.\r\n", me.pointGame, cpu.pointGame);
				System.out.println("다음 게임을 시작합니다.");
				System.out.println("[확인]");
				emptyScreen();
				countGame++;
				countTotalServe = 1;
				scan.nextLine();
			}
			
			//세트 포인트 조건
			if (me.pointGame > 5 && me.pointGame - cpu.pointGame > 1) {
				
				me.pointSet++;

				me.point = 0;
				me.pointGame = 0;
				cpu.point = 0;
				cpu.pointGame = 0;
				System.out.println();
				System.out.printf("%d세트의 승자는 %s입니다.\r\n", countSet, p1);
				System.out.printf("현재 세트 스코어는 [%d-%d] 입니다.\r\n", me.pointSet, cpu.pointSet);
				System.out.println("다음 세트를 시작합니다.");
				System.out.println("[확인]");
				countServe = 1;
				countGame = 1;
				countSet++;
				
			} else if (cpu.pointGame > 5 && cpu.pointGame - me.pointGame > 1) {
				
				cpu.pointSet++;

				me.point = 0;
				me.pointGame = 0;
				cpu.point = 0;
				cpu.pointGame = 0;
				System.out.println();
				System.out.printf("%d세트의 승자는 %s입니다.\r\n", countSet, p2);
				System.out.printf("현재 세트 스코어는 [%d-%d] 입니다.\r\n", me.pointSet, cpu.pointSet);
				System.out.println("다음 세트를 시작합니다.");
				System.out.println("[확인]");
				countServe = 1;
				countGame = 1;
				countSet++;
			}

//			매치 포인트 조건
			if (me.pointSet > minSetCheck()) {
				
			}
			
			
			
			
		}
		scan.close();
	}



	private static int minSetCheck() {

		if 

	return 0;
}


	private static void emptyScreen() {
		
//		for (int i=0; i<30; i++) System.out.println();
		
}


	private static void m1() {


		Random rnd = new Random();
		
		int i = 0;
		while (i <=100) {
			System.out.println(rnd.nextInt(10)+1);
			i++;
		}
		
	}
	
	
	
}
