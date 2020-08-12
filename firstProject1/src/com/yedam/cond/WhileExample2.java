package com.yedam.cond;

import java.io.IOException;

public class WhileExample2 {
	public static void main(String[] args) throws IOException {
		boolean run = true;
		int num = 10;
		int keyCode = 0;
		while (run) {
			if (keyCode != 13 && keyCode != 10) { //엔터키 값을 출력하지 않음
			System.out.println("키를 누르세요.");
			keyCode = System.in.read();
			if (keyCode != 13)
			System.out.println(keyCode);	
			}
			if (keyCode == 57) // 9(57번)를 누르면 종료 //엔터키는 10, 13이다


				run = false;
			/*
			 * System.out.println("num: " + num); if (num-- == 0) run = false; //break;
			 */

		}
		System.out.println("프로그램 종료");
	}
}