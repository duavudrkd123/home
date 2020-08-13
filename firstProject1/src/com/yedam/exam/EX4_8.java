package com.yedam.exam;

import java.util.Scanner;

public class EX4_8 {
	/*
	 * 사용자 입력값 : 3개 받아서 작은수 -> 큰수로 출력하는 프로그램 23, 44, 28 결과 23, 28, 44
	 */

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int c = 0;
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();

		{
			if (a < b) {
				System.out.println(a);
			} else {
				System.out.println(b);
			}
			{
				if (a > b) {
					System.out.println(a);
				} else {
					System.out.println(b);
				}
			}

		}
	}
}