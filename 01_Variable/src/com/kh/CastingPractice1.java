package com.kh;

import java.util.Scanner;

public class CastingPractice1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("문자 : ");
		String str = sc.nextLine();
		
		char ch = str.charAt(0);
		int uni = (int)ch;
		
		
		System.out.println( str + " unicode : " + uni);
		System.out.printf("%c unicode : %d", ch, uni);
				
	}

}
