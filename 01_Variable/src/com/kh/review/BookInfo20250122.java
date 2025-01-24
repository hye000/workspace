package com.kh.review;

public class BookInfo20250122 {
	
			//	- 선언 (표현식)
			//	자료형 변수명;
			//	- 자료형 종류
			//  * 문자 : 문자형 ('a', '0', ), 문자열 ("a", "asd", ..)
			//        - 문자  : char
			//        - 문자열 : String
			//  * 숫자 : 정수형 (1, 2, 3, -1, 0, 100), 실수형 (3.14, 0.55, ...)
			//        - 정수형 : byte int short long
			//        - 실수형 : float double
			//  * 논리형 (True/False) : boolean
	
	
    public    static   void main(String[] args) {
        String title = "Java의 정석"; 
        String author = "남궁성"; 
        int pageCount = 1022; 	
        boolean isAvailable = false; 	

        System.out.println("책 제목: " + title);
        System.out.println("저자: " + author);
        System.out.println("페이지 수: " + pageCount);
        System.out.println("대출 가능 여부: " + isAvailable);
    }
}