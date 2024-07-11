package com.test.question.j;


public class MyArrayList {

//Re버전 만들어서 다시 하기

	private String[] list;
	private int index;
	
	public MyArrayList() {
		this.list = new String[4];
		this.index = 0;
	}
	
	public boolean add(String value) {
		
		if (checkLength() ) {
//			방이 모자르다 -> 2배로 확장
			doubleList();
			
			
		}
		
		this.list[this.index] = value;
		this.index++;
		
		return true;
	}
	private void doubleList() {
		
		String[] temp = new String[this.list.length * 2];
		
		for (int i=0; i<this.list.length; i++) {
			
			temp[i] = this.list[i];
			
		}
		
		this.list = temp; //원래 있던 list 주소 변수가 사라지고 temp 주소 변수로 바뀜
		
		}

	private boolean checkLength() {
		
		if (this.index == this.list.length) {
			return true;
		}
		return false;
	}

	public String get(int index) {
		
		return this.list[index];
	}
	
	public int size() {
		return this.index;
	}
	
	
	
	@Override
	public String toString() {

		String temp = "";
		temp += "\r\n";
		temp += String.format("length: %d\r\n", this.list.length);
		temp += String.format("index: %d\r\n", this.index);
		temp += String.format("[\r\n");
		for (int i=0; i<this.list.length; i++) {
			temp += String.format(" %d: %s\r\n",i, this.list[i]);
		}
		temp += String.format("]\r\n");
		
		return temp;
	}
	
	
}
