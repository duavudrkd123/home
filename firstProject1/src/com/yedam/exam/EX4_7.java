package com.yedam.exam;

import java.util.Scanner;

public class EX4_7 {
	public static void main(String[] args) {
		boolean run = true;
		int input = 0;
		int balance = 0;

		Scanner scanner = new Scanner(System.in); // 키보드 입력값을 읽어 오는거
		while (run) {
			System.out.println("------------------------------------------");
			System.out.println("1.예금 2.출금 3.잔고 4.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택> ");
			int menu = scanner.nextInt();
			if (menu == 1) { // 예금을 하겠다
				System.out.print("예금액을 입력하세요 = ");
				input = scanner.nextInt();
				balance = balance + input;
			} else if (menu == 2) {// 2번
				System.out.print("출금액을 입력하세요 = ");
				input = scanner.nextInt();
				balance = balance - input;
			} else if (menu == 3) { // 3번
				System.out.println("잔고는 " + balance + "원 입니다");
			} else if (menu == 4) // 4번
				run = false;

		} // end of while
		System.out.println("프로그램 종료.");
	}// end of main
} // end of class