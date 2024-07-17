package com.test.project;

public class TennisDTO {

	private String name; //게임 승리 후 받는 유저 이름
	private int type; // 1 = 단식, 2 = 복식
	private int set; // 1 = 3세트, 2 = 5세트
	private int player; //1 = 유저 1명, 2 = 유저 2명
	private int character; //게임 캐릭터 고유일련번호
	
	public int point;	/*	
	포인트 (0-15-30-40, 40 이후 부터는 1점씩 추가
	내부적으로는 0,1,2,3 오름차순 정수로 표현함
	개발자	->	사용자
	0		->	0
	1		->	15
	2		->	30
	3		->	40
	4		->	41
	5		->	42...
*/
	public int pointGame; //게임 포인트 (상대와 최소 2점 차이로 6점 먼저 획득하면 세트 승, 3대3부터는 2점 먼저 획득하면 세트 승, 6대6일 때는 타이브레이크로 먼저 1점 획득하면 세트 승)
	public int pointSet; //세트 포인트 (3세트면 2판 이기면 매치 승, 5세트면 3판 이기면 매치 승)
	
	public int chance; //게임 내부에서 어떤 스킬이 성공할 확률 (0 ~ 100 까지의 정수로 표현)
	
	static int countServe; //몇 번째 서브 (게임이 끝날 때 리셋)
	static int countGame; //몇 번째 게임 (세트가 끝날 때 리셋)
	static int countSet; //몇 번째 세트 (매치가 끝날 때 리셋)
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	
	
	public int getSet() {
		return set;
	}
	public void setSet(int set) {
		this.set = set;
	}
	
	
	public int getPlayer() {
		return player;
	}
	public void setPlayer(int player) {
		this.player = player;
	}
	
	
	public int getCharacter() {
		return character;
	}
	public void setCharacter(int character) {
		this.character = character;
	}
	
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	public int getGamePoint() {
		return pointGame;
	}
	public void setGamePoint(int gamePoint) {
		this.pointGame = gamePoint;
	}
	
	public int getSetPoint() {
		return pointSet;
	}
	public void setSetPoint(int setPoint) {
		this.pointSet = setPoint;
	}
	
	
	
}
