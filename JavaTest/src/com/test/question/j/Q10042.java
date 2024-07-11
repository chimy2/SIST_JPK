package com.test.question.j;

public class Q10042 {

	
	public static void main(String[] args) {
	
		int year = 2024;
		int month = 7;
		int day = 1;
		int sum = 0;
		
			for (int i=1; i<year; i++) {
				
					if (isLeapYear(i)) {
						sum += 366;	
				} else {
						sum += 365;
				}
			}
				
				for (int j=1; j<month; j++) {
					
					sum += getLastDay(year, j);
				}

			
			
			sum += day;
			
			String dayCheck = dayCheck(sum);

			System.out.printf("%d년 %d월 %d일은 %,d일째 되는 날이고 %s입니다.", year, month, day, sum, dayCheck);

	}

	private static String dayCheck(int sum) {
		
		switch (sum % 7) {
		case 0:
			return "일요일";
		case 1:
			return "월요일";
		case 2:
			return "화요일";
		case 3:
			return "수요일";
		case 4:
			return "목요일";
		case 5:
			return "금요일";
		case 6:
			return "토요일";
			}
		return "";
	}

	private static int getLastDay(int year, int month) {
		
			switch (month) {
				case 1: 
				case 3: 
				case 5: 
				case 7: 
				case 8: 
				case 10: 
				case 12:
					return 31;
				case 4:
				case 6:
				case 9:
				case 11:
					return 30;
				case 2:
					return isLeapYear(year) ? 29 : 28;
		}
		return 0;
	}

	private static boolean isLeapYear(int year) {
		
		if  (year % 4 == 0) {
			if (year % 100 == 0) {
					if (year % 400 == 0) {
								return true;//윤년
						} else {
								return false;//평년
						}  		
			} else {
					return true;//윤년
			}
		} else {
				return false;//평년	
		
		}//if1
	
	}//isLeapYear
	
}
	