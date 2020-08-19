package com.yedam.API;

import java.util.Scanner;

public class StringCharAtExample {
	public static void main(String[] args) {
		String n = null;
		
		boolean run = true;
		Scanner scn = new Scanner(System.in);
		

//		while (run) {
//		System.out.println("-------------------------------");
//		System.out.println("1. 주민번호 입력    2. 리스트 출력    3.종료");
//		System.out.println("-------------------------------");
//		System.out.println("선택: ");
//
//		int sel = scn.nextInt(); scn.hasNextLine();
//		if (sel == 1) {
//			System.out.println("주민등록번호를 입력하세요");
//			n = scn.nextLine();
//			System.out.println("주민등록번호가 입력되었습니다");
//		} else if (sel == 2) {
			
		String ssn = scn.nextLine();
		char sex = ssn.charAt(7);
		switch (sex) {
		case '1':
		case '3':
			System.out.println("남자입니다~");
			break;
		case '2':
		case '4':
			System.out.println("여자입니다~");
		}
	}
}
			
//		}
//	}
//		else if (sel == 3) {
//			run = false;
//			}
//}
//		System.out.println("종료합니다");
//}
//}
