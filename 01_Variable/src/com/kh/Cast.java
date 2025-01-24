package com.kh;

public class Cast {
	
	/*
	 * 형 변환 : 값의 자료형을 바꾸는 것
	 * 		=> 컴퓨터에서 값을 처리하는 규칙 존재(형변환이 필요한 시점/상황)
	 * 1) 대입 연산자 : 왼쪽과 오른쪽이 같은 자료형이어야 함
	 * 				=> 다른 자료형의 값을 대입하고자 할 때 형변환 필수
	 * 
	 * 		자료형 변수명 = (자료형)값;
	 * 
	 * 2) 같은 자료형끼리만 연산 가능하다
	 * 		결괏값 = 값1 + 값2;
	 * 		=> 값1, 값2 모두 같은 자료형이어야 함
	 * 		   결괏값도 같은 자료형이어야 함
	 */
	public static void main(String[] args) {
		
		autoCasting();	// main 밖에서 작업한 함수 호출
		forceCasting();
	}

	public static void forceCasting() {
		/*
		 * 강제 형변환 : 자동 형변환이 되지 않는 경우, 직접 형변환을 해주는 것
		 * 			  큰 범위의 자료형에서 작은 범위의 자료형으로 변환이 필요할 때
		 * 
		 * 	(변환할자료형)변환할대상
		 *  => 변환대상 : 값, 변수, ...
		 */
		// 실수형 d1 변수에 4.0 이라는 값 저장
		double d1 = 4.0;
		
		// 정수형 i1 변수에 50이라는 값 저장
		int i1 = 50;
		
		// d1 변수와 i1 변수의 합을 정수형 result변수에 저장
		int result = (int)d1 + i1;
		// int result = (int)(d1 + i1); 먼저 연산을 한 후에 값을 int로 변환
		System.out.println("결과 3 : " + result);
		
		// 강제 형변환 시 데이터 손실이 발생될 수 있다.
		int i2 = 290;
		byte i3 = (byte)i2;
		// byte 값의 범위 : -128 ~ 127, 오버플로우 일어나서 34로 바뀜
		System.out.println("결과 4 : " + i3);
		
	}
	
	public static void autoCasting() {
		/*
		 * 자동 형변환 : 값의 범위가 작은 자료형에서 큰 자료형으로 자동 형변환 됨
		 * byte(1B) - short(2B) - int(4B) - long(8B) - float(4B) - double(8B)
		 * 												Byte수는 long보다 작지만 소숫점때문에 범위가 더 큼
		 * 			  char(2B)
		 */
		// 정수형 변수 i1에 12라는 값을 저장
		int i1 = 12;
		
		// 실수형 변수 d1에 i1의 값을 저장
		double d1 = i1;		// i1(int) -> (double)
							// 		12 => 12.0
		System.out.println("결과 1 : " + d1);
		
		int i2 = 15;
		double d2 = 3.6;
		
		int result = i2 + (int)d2;
		// i2 + d2 = (int) + (double) 이지만 i2가 int에서 double로 바뀌어 실제로는 15.0 + 3.3이 되었을 것
		System.out.println("결과 2 : " + result);
	}
}
