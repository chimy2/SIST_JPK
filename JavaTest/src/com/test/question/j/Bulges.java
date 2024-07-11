package com.test.question.j;

import java.util.Calendar;

//Redo 가격 + 유통기한은 syso로 출력하고
//먹을 수 있다 없다만 eat메서드로 출력
public class Bulges {
		
			private int weight;
			private int price;
			private Calendar creationTime;
			private int expiration;

		   //getter, setter 구현

		   public void setSize(int weight) {
				if (weight == 300 ||  weight == 500 || weight == 850) {
					this.weight = weight;
				}
				
				switch (this.weight) {
				case 300:
					this.price = 850;
					this.expiration = 7;
					break;
				case 500:
					this.price = 1200;
					this.expiration = 10;
					break;
				case 850:
					this.price = 1950;
					this.expiration = 15;
					break;
				}
				
				
				
		   }
			
		public String getPrice() {
			String temp = "";
			temp = String.format("가격: %,d", price);
			return temp;
		
		}
				

		public void setCreationTime(String date) {
			
			Calendar c = Calendar.getInstance();
			
			c.set(Calendar.HOUR_OF_DAY, 0);
			c.set(Calendar.MINUTE, 0);
			c.set(Calendar.SECOND, 0);
			c.set(Calendar.MILLISECOND, 0);
			
			c.set(Integer.parseInt(date.substring(0, 4))
					, Integer.parseInt(date.substring(5, 7)) - 1
					, Integer.parseInt(date.substring(8)));
	
			
			this.creationTime = c;
			
		}


		private int getExpiration() {
			
			switch (this.weight) {
			case 300:
				this.expiration = 7;
				return this.expiration;
			case 500:
				this.expiration = 10;
				return this.expiration;
			case 850:
				this.expiration = 15;
				return this.expiration;
			}
			return 0;
		}


		public void eat() {
			
			Calendar now = Calendar.getInstance();
			
			now.set(Calendar.HOUR_OF_DAY, 0);
			now.set(Calendar.MINUTE, 0);
			now.set(Calendar.SECOND, 0);
			now.set(Calendar.MILLISECOND, 0);

			long dayNow = now.getTimeInMillis();
			long dayCreated = this.creationTime.getTimeInMillis();
				
			this.expiration = (int)getExpiration() - (int)((dayNow - dayCreated) / 1000 / 60 / 60 / 24);
			
			String result = "";
			
			if (expiration < 0) {
				result += (getPrice()) + "원\r\n"; 
				result += String.format("유통기한: %,d일 남았습니다.\r\n", this.expiration);
				result += String.format("유통기한이 지나 먹을 수 없습니다.\r\n");
				System.out.println(result);
			} else {
				result += (getPrice()) + "원\r\n"; 
				result += String.format("유통기한: %,d일 남았습니다.\r\n", this.expiration);
				result += String.format("과자를 맛있게 먹습니다.\r\n");
				System.out.println(result);
			}			
		  }
		}
	

