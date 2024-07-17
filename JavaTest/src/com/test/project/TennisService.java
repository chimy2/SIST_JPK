package com.test.project;

import java.awt.Point;
import java.util.Random;
import java.util.Scanner;

public class TennisService {
	
	private TennisView view = new TennisView();
	private TennisDAO dao = new TennisDAO();
	private TennisDTO dto = new TennisDTO();
	private Scanner scan = new Scanner(System.in);
	
	int serveCount= 0; //몇 번째 서브 (게임이 끝날 때 리셋)
	int gameCount = 0; //몇 번째 게임 (세트가 끝날 때 리셋)
	int setCount = 0; //몇 번째 세트 (매치가 끝날 때 리셋)
	
	TennisDTO me = new TennisDTO();
	TennisDTO cpu = new TennisDTO();
	
//	private int point;		//포인트
//	private int gamePoint; //게임 포인트
//	private int setPoint; //세트 포인트
//	
//	static int serveCount; //몇 번째 서브 (게임이 끝날 때 리셋)
//	static int gameCount; //몇 번째 게임 (세트가 끝날 때 리셋)
//	static int setCount; //몇 번째 세트 (매치가 끝날 때 리셋)
	

	public TennisService() {
		this.dto = new TennisDTO();
		this.view = new TennisView();
		this.dao = new TennisDAO();
		this.scan = new Scanner(System.in);
		
	}

	public void gameSetup() {
//		단식/복식 -> 세트 수 -> 플레이어수 -> 캐릭터 선택
		
		int type = 0; // 1 = 단식, 2 = 복식
		int set = 0; // 1 = 3세트, 2 = 5세트
		int player = 0; //1 = 유저 1명, 2 = 유저 2명
		int character = 0; //게임 캐릭터 고유일련번호
		
		view.subtitle("게임 시작");
		
		System.out.println();
		System.out.println("게임 타입을 선택해주세요.");
		System.out.println("1.[단식]		2.[복식]");
		type = scan.nextInt();
		dto.setType(type);
		scan.skip("\r\n");
		
		System.out.println();
		System.out.println("세트 수를 입력해주세요.");
		System.out.println("1.[3세트]		2.[5세트]");
		set = scan.nextInt();
		dto.setSet(set);
		scan.skip("\r\n");
		
		System.out.println();
		System.out.println("유저 수를 입력해주세요.");
		System.out.println("1.[1명]		2.[2명]");
		player = scan.nextInt();
		dto.setPlayer(player);
		scan.skip("\r\n");
		
		System.out.println();
		characterSelect();
		
		TennisDTO dto = new TennisDTO();
		
		dto.setType(type);
		dto.setSet(set);
		dto.setPlayer(player);
		dto.setCharacter(character);
		
		gameStart(dto);
	
	}

	private void gameStart(TennisDTO dto) {
		boolean loop = true;
		while (loop) {
		
			Random rnd = new Random();
			me.chance = rnd.nextInt(100)+1;
			cpu.chance = rnd.nextInt(100)+1;
			
			if (me.chance > cpu.chance) {
				me.point++;
				break;
			} else if (me.chance < cpu.chance) {
				cpu.point++;
				break;
			} else {
				continue;
			}
			
		}
		pointCheck();

		}
	
	




	private void pointCheck() {
		
		boolean loop = true;
		while (loop) {
		if (me.point > 3 && me.point - cpu.point > 1) {
			
			
			me.pointGame++;
			break;
		}
		
		if (cpu.point > 3 && cpu.point - me.point > 1) {
			
			cpu.pointGame++;
			break;
		}
		
	}
		
	}

	private void nextGame() {
		// TODO Auto-generated method stub
		
	}

	private int characterSelect() {
		int character = 0;
		return character;

		
	}

	public void gameRecord() {
		// TODO Auto-generated method stub
		
	}

	public void gameInfo() {
		// TODO Auto-generated method stub
		
	}

	public void gameSetting() {
		// TODO Auto-generated method stub
		
	}

	
}
