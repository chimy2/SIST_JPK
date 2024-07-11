package com.test.question.j;

/*

Employee 객체의 정보
이름, 부서, 직책, 연락처, 직속상사
모든 멤버 변수의 접근 지정자는 private으로 한다.
멤버 접근을 위한 Setter와 Getter를 정의한다.
이름 : 읽기/쓰기, 한글 2~5자 이내
부서 : 읽기/쓰기, 영업부, 기획부, 총무부, 개발부, 홍보부
직잭 : 읽기/쓰기, 부장, 과장, 대리, 사원
연락처 : 읽기/쓰기, 010-XXXX-XXXX 형식 확인
직속상사 : 읽기/쓰기, 다른 직원 중 한명, 같은 부서가 아니면 될 수 없음(유효성 검사)
Employee 객체 메소드
void info() : 직원 정보 확인

 */


public class Employee {

		private String name;
		private String department;
		private String position;
		private String tel;
		private Employee boss;

	   //getter, setter 구현
		
		
		

		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			
			if ( name.length() < 2 || name.length() < 5 ) {
				System.out.println("이름은 2자~5자 사이여야 합니다.");
				return;
			} else {
				for (int i=0; i<name.length()-1;i++) {
					if (name.charAt(i) < '가' ||'힣' < name.charAt(i) ) {
						System.out.println("이름은 한글만 가능합니다.");
						return;
					}
				}
				this.name = name;
			}
		}

		public String getDepartment() {
			return department;
		}

		public void setDepartment(String department) {
			
//			 영업부, 기획부, 총무부, 개발부, 홍보부
			if (!(department.equals("영업부")
					||department.equals("기획부")
					||department.equals("총무부")
					||department.equals("개발부")
					||department.equals("홍보부"))) {
				System.out.println("올바른 부서를 입력하시오.");
				return;
			}
			this.department = department;
		}

		public String getPosition() {
			return position;
		}

		public void setPosition(String position) {
			
//			부장, 과장, 대리, 사원
			if (!(position.equals("부장")
				||position.equals("과장")
				||position.equals("대리")
				||position.equals("사원"))) {
					System.out.println("올바른 직책을 입력하시오.");
					return;
				}
				this.position = position;
		}

		
		public String getTel() {
			return tel;
		}

		public void setTel(String tel) {
			
			if (tel.indexOf(3) != '-' || tel.indexOf(7) != '-') {
				return;
			}

		}

		public Employee getBoss() {
			return boss;
		}

		public void setBoss(Employee boss) {
			//유효성 검사 -> 다른 부서 직원이 상사일 수 없음
			this.boss = boss;
		}

		public void info() {
			
			String output = "";
			output += String.format("부서: %s\r\n", this.department);
			output += String.format("직위: %s\r\n", this.position);
			output += String.format("연락처: %s\r\n", this.tel);
			
			output += String.format("직속상사: %s(%s %s)\r\n"
									, this.boss
									, this.boss.department
									, this.boss.position);
			
			System.out.println(output);


	   }
	
	
	
	
}
