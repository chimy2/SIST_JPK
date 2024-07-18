package com.test.project;

import java.util.Random;
import java.util.Scanner;

import javax.net.ssl.SNIHostName;

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
//				여기에 본인/컴퓨터 포인트를 인자값으로 받아서 러브 피프틴 써티 포티 이런 걸 말해주는 메서드 구현 필요
			} else if (me.chance < cpu.chance) {
				cpu.point++;
				countTotalServe++;
				countServe++;
//				여기에 본인/컴퓨터 포인트를 인자값으로 받아서 러브 피프틴 써티 포티 이런 걸 말해주는 메서드 구현 필요
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
			int input; //유저 메뉴 선택 번호로 받을 변수
			String name; //유저 이름 받을 스트링 변수
			if (me.pointSet > 1) {
				System.out.println();
				System.out.printf("매치의 승자는 %s 입니다.\r\n", p1);
				System.out.println("게임을 기록하시겠습니까?");
				System.out.println("1.예	2.아니오");
				me.point = 0;
				me.pointGame = 0;
				me.pointSet = 0;
				cpu.point = 0;
				cpu.pointGame = 0;
				cpu.pointSet = 0;
				countServe = 1;
				countGame = 1;
				countSet = 1;
				countTotalServe = 1;
				input = scan.nextInt();
				scan.skip("\r\n");
				if(input == 1) {
					System.out.println("이름을 입력하시오.");
					name = scan.nextLine();
					System.out.println();
					
					System.out.printf("입력하신 이름은 %s이 맞으십니까?\r\n", name);
					System.out.println("1.예	2.아니오");
					input = scan.nextInt();
					scan.skip("\r\n");
					if (input == 1) {
//						기록 저장 메서드 호출
						System.out.printf("%s의 기록을 저장했습니다.\r\n", name);
					}
					
				}
					System.out.println("===================================");
					System.out.println("1.메인메뉴 2.다시하기 3.게임종료");
					input = scan.nextInt();
					if (input == 1) {
//						메인메뉴 호출 메서드
					} else if (input == 2) {
//						다시하기 호출 메서드 (기존 게임설정 그대로)
					} else if (input == 3) {
//						게임종료 메서드 (메인메뉴에 있는 게임종료 메서드와 동일)
					} else {
						System.out.println("선택할 메뉴를 1~3번 사이에 정수로 입력하세요.");
						continue;
					}
					
				
		
			}
		
		}//게임 끝날 때
		scan.close();
	}



	private static int minSetCheck() {//세트수 설정 3 또는 5에 따른 최소 승리값

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
