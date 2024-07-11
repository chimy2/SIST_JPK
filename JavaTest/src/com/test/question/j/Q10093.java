package com.test.question.j;

public class Q10093 {

	
	public static void main(String[] args) {
		
		Note note1 = new Note();
		
		note1.setSize("B4");
		note1.setColor("노란색");
		note1.setPage(25);
		note1.setOwner("홍길동");
		
		System.out.println(note1.info());
		
		
		Note note2 = new Note();
		
		note2.setSize("Bb3");
		note2.setColor("퍼런색");
		note2.setPage(2000);
		note2.setOwner("호랑");
		
		System.out.println(note2.info());
		
		
	}
}
