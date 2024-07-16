package com.test.question.p;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Q124 {
//	파일입출력: 주문 검색
	public static void main(String[] args) {
//		요구사항] 이름을 입력받아 회원 주문 정보를 검색 후 출력하시오.
//			- 리소스..
//			- 파일 > 검색_회원.dat
//			- 파일 > 검색_주문.dat
		
//		입력
//		이름: 홍길동 

//		출력
//		==== 구매내역 ==== 
//		[번호]    [이름]    [상품명]    [개수]    [배송지]
//		      3    홍길동     마우스          3    서울시 강동구 천호동
		
		String memberPath = "dat\\검색_회원.dat";
		String orderPath = "dat\\검색_주문.dat";
		Scanner scan = new Scanner(System.in);
		HashMap<Integer, SearchMember> memberMap = new HashMap<>();
		HashMap<Integer, SearchOrder> orderMap = new HashMap<>();
		
		try {
			BufferedReader reader;
			String line;
			putFileContent(memberPath, memberMap, SearchMember.class);
			putFileContent(orderPath, orderMap, SearchOrder.class);
			
		} catch (Exception e) {
			System.out.println("Q124.main");
			e.printStackTrace();
		}
		
		System.out.print("이름: ");
		String name = scan.nextLine();
		int memberNum = 0;
		
		System.out.println("=============구매내역=============");
		System.out.println("[번호]\t[이름]\t[상품명]\t[개수]\t[배송지]");
		
		for(Entry<Integer, SearchMember> entry : memberMap.entrySet()) {
			
			SearchMember member = entry.getValue(); 
			
			if(member.getName().equals(name)) {
				memberNum = entry.getKey();
			}
		}
		
		for(Entry<Integer, SearchOrder> entry : orderMap.entrySet()) {
			
			SearchOrder order = entry.getValue();
			
			if(order.getMemberNum() == memberNum) {
				
				int orderNum = entry.getKey();
				String memberName = memberMap.get(memberNum).getName();
				String orderName = entry.getValue().getName();
				int orderCount = entry.getValue().getCount();
				String memberAddress = memberMap.get(memberNum).getAddress();
				
				System.out.println(orderNum + "\t" + memberName + "\t" + orderName + "\t" + orderCount + "\t" + memberAddress);
			}
		}
	}

	public static <T> void putFileContent(String path, HashMap<Integer, T> map, Class<T> clazz)
			throws Exception {
		BufferedReader reader = new BufferedReader(new FileReader(path));
		
		String line = "";
		
		while((line = reader.readLine()) != null) {
			int num = Integer.parseInt(line.substring(0, line.indexOf(',')));
			T obj = clazz.getConstructor(String.class).newInstance(line);
			map.put(num, obj);
		}
		
		reader.close();
	}
}

class SearchMember {
	private String name;
	private String address;
	
	public SearchMember(String str) {
		String[] arr = str.split(",");
		
		this.name = arr[1];
		this.address = arr[2];
	}
	
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
}

class SearchOrder {
	private String name;
	private int count;
	private int memberNum;
	
	public SearchOrder(String str) {
		String[] arr = str.split(",");
		
		this.name = arr[1];
		this.count = Integer.parseInt(arr[2]);
		this.memberNum = Integer.parseInt(arr[3]);
	}

	public String getName() {
		return name;
	}
	public int getCount() {
		return count;
	}
	public int getMemberNum() {
		return memberNum;
	}
}