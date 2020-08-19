package com.yedam.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NullPointerExceptionExample {
	public static void main(String[] args) {
		String str = "헬로";
		try { // 예외처리해준다
			System.out.println(str.toString());
		} catch (NullPointerException e) { // 예외가 발생하면 밑에 값이 출력된다
			System.out.println("Null 값을 참조하고 있습니다.");
		} catch (Exception e1) {
			System.out.println("알 수 없는 예외 발생");
		}

		int[] intAry = new int[5];
		for (int i = 0; i <= 6; i++) {
			try {
				System.out.println("i의 값: " + intAry[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("배열범위를 을 초과 해톼");
				System.out.println();
			}
		}
		Scanner scn = new Scanner(System.in);
		
		while (true) {

			System.out.println("숫자를입력하삼.");

			try {

				int menu = scn.nextInt();
				break;
			} catch (InputMismatchException e2) {
				scn.nextLine();
				System.out.println("머하냐 숫자 써라-_-");
			
			} 
		}
		
		System.out.println(("정상 종료"));

}

}
