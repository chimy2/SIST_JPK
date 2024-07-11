package com.test.question.j;

public class Q10095 {

	public static void main(String[] args) {
	
		Employee e1 = new Employee();
		
		e1.setName("홍길동"); //한글 && 2-5자 이내
		e1.setDepartment("홍보부");//영업부, 기획부, 총무부, 개발부, 홍보부
		e1.setPosition("대리");//부장, 과장, 대리, 사원
		e1.setTel("010-1234-5678");//번호 검사
		e1.setBoss(null);//다른 부서 직원이 상사일 수 없음
		
		e1.info();
		
		Employee e2 = new Employee();
		
		e2.setName("아무개"); //한글 && 2-5자 이내
		e2.setDepartment("홍보부");//영업부, 기획부, 총무부, 개발부, 홍보부
		e2.setPosition("사원");//부장, 과장, 대리, 사원
		e2.setTel("010-2345-6789");//번호 검사
		e2.setBoss(e1);//다른 부서 직원이 상사일 수 없음
		
		e2.info();
		
		
		
		
		
		
		
		
	}
	
}
