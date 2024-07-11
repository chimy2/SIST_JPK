package com.test.question.j;

public class Note {

			private String size;
			private String color;
			private int page;
			private String owner;
			private int price;

				//setter, getter 구현

			public void setSize(String size) {
				if (!(size == "A3" 
					|| size == "A4" 
					|| size == "A5" 
					|| size == "B3" 
					|| size == "B4" 
					|| size == "B5")) {
					System.out.println("잘못된 사이즈를 입력했습니다.");
					return;
				}
				this.size = size;
			}

			public void setColor(String color) {
			
				if (!(color.equals("검정색")
						|| color.equals("흰색")
						|| color.equals("노란색")
						|| color.equals("파란색"))) {
						System.out.println("잘못된 색상을 입력했습니다.");
						return;
				}
				this.color = color;
			}

			public void setPage(int page) {
				
				if (!(page >= 10 && page <= 200)) {
						System.out.println("잘못된 페이지수를 입력했습니다.");
						return;
				}
				this.page = page;
			}
			

			public void setOwner(String owner) {
				if (!(owner.length() >= 2 && owner.length() <= 5)) {
					System.out.println("이름은 2자~5자 사이여야 합니다.");
					return;
					} else {
						for (int i=0; i<owner.length(); i++) {
							char c = owner.charAt(i);
							if (c < '가' || c > '힣') {
								System.out.println("이름은 한글만 입력하세요 .");
								return;
					}
					
						}
						this.owner = owner;
					}
			
			}

			public String info() {
	        
				int sum = 500;
				
				switch (this.size) {
				case "A3":
					sum += 400;
					break;
				case "A4":
					sum += 200;
					break;
				case "A5":
					break;
				case "B3":	
					sum += 500;
					break;
				case "B4":
					sum += 300;
					break;
				case "B5":	
					sum += 100;
					break;
				}
				switch (this.color) {
				case "검정색":
					sum += 100;
					break;
				case "흰색":
					break;
				case "노란색":
					sum += 200;
					break;
				case "파란색":
					sum += 200;
					break;
				}
				sum += (this.page - 10) * 10;
				this.price = sum;
				
		
				String tempPage = "";	
				
					if (this.page <= 50) {
						tempPage = "얇은";
					} else if (this.page <=100) {
						tempPage = "보통";
					} else {
						tempPage = "두꺼운";
					}
			
				String result = "";
				result += "■■■■■■ 노트 정보 ■■■■■■\r\n";
					
				if (owner == null) {		        	
		        	 		result += "주인 없는 노트\r\n";
				} else {
						result += String.format("소유자: %s\r\n", this.owner);
						result += String.format("특성: %s %s %s\r\n",this.color, tempPage, this.size);
						result += String.format("가격: %,d\r\n", this.price);
				}
				 	result += "■■■■■■■■■■■■■■■■■■■■■■\r\n";
				 	return result;

			
			}
}
