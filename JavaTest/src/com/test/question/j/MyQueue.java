package com.test.question.j;

public class MyQueue {

//	Re버전 만들어서 다시 하기
	
	
	private String[] list;
	private int index; //현재 추가될 요소의 위치 & size 역할
	
	public MyQueue() {
		
		this.list = new String[4];
		this.index = 0;
	}
	
	public MyQueue(int capacity) {
		
		this.list = new String[capacity];
		this.index = 0;
	}
	
	
	@Override
	public String toString() {
	
		String temp = "";
		
		temp += "\r\n";
		temp += "length:" + this.list.length + "\r\n";
		temp += "index:" + this.index + "\r\n";
		temp += "[\r\n";
		for (int i=0; i<this.list.length; i++) {
			temp += " " + i + ":" + this.list[i] + "\r\n";
		}
		temp += "]";
		
		return temp;
	}

	public void add(String value) {
		
		if (checkLength()) {
			doublelist();
		}
		
		this.list[this.index] = value;
		this.index++;
		
		
		
	}

	private void doublelist() {

		String[] temp = new String[this.list.length *2];
		
		for (int i=0; i<this.list.length; i++) {
			temp[i] = this.list[i];
		}
		
		this.list = temp;
		
	}

	private boolean checkLength() {
		
		
		return this.index == this.list.length;
	}

	public int size() {
		
		return this. index;
	}
	
	public String poll() {
		
		if (this.index == 0) {
			return null;
		}
		 
		String temp = this.list[0];
		
		for (int i=0; i<this.list.length-1; i++) {
			this.list[i] = this.list[i+1];
		
		}
		this.index--;
		return temp;
	}

	public String peek() {
		
		if (this.index == 0) {
			return null;
		}
		
		return this.list[0];
	}

	public void clear() {

//		청소 #1 -> 비용이 가장 많이 듬
//		for (int i=0; i<this.list.length; i++) {
//			this.list[i] = null;
//		}
//		
//		this.index = 0;
		
//		청소 #2
//		this.list = new String[4]; //덮어쓰기 -> 하지만 더블링을 하는데 비용이 듬
//		this.index = 0;
		
//		청소 #3 //제일 간편!
		this.index = 0;
		//대신 poll과 peek 메서드에 if (this.index == 0) {return null;}을 걸어줘야함
		
		
	}

	public void trimToSize() {
		
		String[] temp = new String[this.index];
		
		for (int i=0; i<temp.length; i++) {
			temp[i] = this.list[i];
			
		}
		this.list = temp;

	}
	
}

















































