package com.kh.operator;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
//		example01();
//		example02();
		example03();
	}
	
	
	public static void example03() {
		/*
		 * 산술 연산자 활용 예제
		 * 키와 몸무게를 입력 받아 BMI를 계산하여 출력
		 * * BMI : 몸무게 / (키(m) * 키(m));
		 *  18.5 이하 저체중
		 *  18.5~22.9 정상
		 *  23.0~24.9 과체중
		 *  25~ 비만
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키를 입력하세요(cm) : ");
		double height = sc.nextDouble() * 0.01;
		
		sc.nextLine();
		
		System.out.print("몸무게를 입력하세요(kg) : ");
		
		double weight = sc.nextDouble();
		
		double bmi = weight / (height * height);
		
		String result = "저체중입니다.";
		result = bmi <= 18.5? "저체중입니다": result;
		result = 18.5 < bmi && bmi <= 22.9? "정상제충입니다" : result;
		result = 23.0 <= bmi && bmi <= 24.9? "과체중입니다" : "비만입니다.";
		result = 25 <= bmi ? "비만입니다" : result;
		
		System.out.printf("BMI 지수는 %.1f(으)로 %s", bmi, result);
	}
	
	
	
	/*
	 * [2] 비교 연산자, 논리 연산자
	 * 		: 결괏값이 true 또는 false로 이루어져 있음.
	 * 		: 이항 연산자임
	 * 		
	 */
	public static void example02() {
		/*
		 * 나이를 입력 받아 초등학생인지 중학생인지 고등학생인지 구분하여 출력
		 * 초 : 8~13
		 * 중 : 14~16
		 * 고 : 17~19
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
//		String result = (8 <= age && age <= 13? "초등학생입니다.":
//						(14 <= age && age <= 16? "중학생입니다.":
//						(17 <= age && age <= 19? "고등학생입니다.": "알 수 없음")));
		
		String result = "알 수 없음";
		result = 8 <= age && age <= 13 ? "초등학생입니다.": result;
		result = 14 <= age && age <= 16 ? "중학생입니다.": result;
		result = 17 <= age && age <= 19 ? "고등학생입니다.": result;
		
		System.out.println(result);
		
		// ----------------- SCE -----------------
		// && || 연산자가 수행될 때 두 항을 모두 실행하지 않더라도 결과를 알 수 있는 경우 뒤쪽 연산을 수행하지 않는다.
		// && : 앞의 조건이 false일 때 뒤의 조건이 실행되지 않음
		// || : 앞의 조건이 true일 때 뒤의 조건이 실행되지 않음
		
		int num = 10;
		int i = 3;
		boolean result2;
		
		result2 = ((num += 15)<0) && ((i*=2) > 2);
		System.out.println(result2);	// false
		System.out.println(i);			// 3
		System.out.println(num);		// 25
		
		result2 = ((num += 15)) <0 || ((i*=2) > 2); 
		System.out.println(result2);	// true
		System.out.println(i);			// 6
		System.out.println(num);		// 40
		
		
	}
	
	
	/*
	 * [1] 복합 대입 연산자
	 * 		: 대입 연산자와 다른 연산자를 조합해서 하나의 연산자처럼 사용되는 연산자
	 * 
	 * 		n1 += 10;
	 * 		=> n1 = n1+10;
	 */
	public static void example01() {
		/*
		 * 사용자로부터 숫자를 입력받아 그 값에 7L을 더한 결과를 출력
		 * => 입력받는 숫자는 short 자료형 사용
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("값을 입력하세요 : ");
		short sNum = sc.nextShort();
//		long result = sNum + 7L;		byte와 short의 연산 값은 기본 int로 출력됨
//		num = (short)(sNUM + (short)7L);
		sNum += 7L;
		
		System.out.println(sNum);
		
	}
}
