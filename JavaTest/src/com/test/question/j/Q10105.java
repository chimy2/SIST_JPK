package com.test.question.j;

public class Q10105 {

//	Re버전 만들어서 다시 하기
	
	public static void main(String[] args) {
		
//		Queue
		MyQueue queue = new MyQueue();
		
		System.out.println(queue);
		
		
//		요소 추가
		queue.add("빨강");
		System.out.println(queue);
		
		queue.add("노랑");
		System.out.println(queue);

		queue.add("주황");
		System.out.println(queue);
		
		queue.add("초록");
		System.out.println(queue);

		queue.add("파랑");
		System.out.println(queue);

		queue.add("남색");
		System.out.println(queue);
		
		queue.add("옥색");
		System.out.println(queue);
		
		
		System.out.println(queue.size());
		
		//요소 읽기(+삭제)
		System.out.println(queue.poll());
		System.out.println(queue);
		
		
		//요소 읽기 (삭제x)
		System.out.println();
		System.out.println(queue.peek());
		
		
		queue.clear();
		System.out.println(queue);
		
		queue.add("빨강");
		queue.add("노랑");
		queue.add("파랑");
		System.out.println(queue);
		
		
		queue.trimToSize();
		
		System.out.println(queue);
		
		queue.add("주황");
		System.out.println(queue);
		
		
		
		
		
//		System.out.println();
//		MyQueue queue2 = new MyQueue();
//		
//		//4 -> 8 -> 16 -> 32 -> 64 -> 128
//		//이런 문제를 해결하고자 생성자에 배열 초기 개수를 설정 가능하게
//		for (int i=0; i<100; i++) {
//			queue2.add("" + i);
//		}
//		
//		System.out.println(queue2.size());
//		System.out.println(queue2);
		
		
		
		
	}
	
	
	
}
