package com.yedam.cond;

public class ForExample {
	public static void main(String[] args) {
		int sum = 0;
		sum = sum + 1;
		sum = sum + 1;
		sum = sum + 1;
		sum = sum + 1;
		sum = sum + 1;
		sum = sum + 1;
		sum = sum + 1;
		sum = sum + 1;
		sum += 1; // sum++
		System.out.println("결과는 " + sum);

		sum = 0; // int 두개 잇으면 오류나서 sum = 0이라고 설정
		for (int a = 0; a < 93; a++) {
			sum = sum + 1;
		}
		sum += 1;
		sum = 0;
		for (int a = 3; a > 0; a--) {
			sum = sum + 1;
		}
		System.out.println("최종 결과는 " + sum);

// 1~ 10범위의 수 합계
		sum = 0;
		for (int i = 1; i <= 10; i++)
			sum = sum + i;

		// 구구단 2단 계산하기
		System.out.println("1부터 10까지 합" + sum);
//	int num = 2;
		/*
		 * System.out.println(num + " * " + 1 + " = " + (num * 1));
		 * System.out.println(num + " * " + 2 + " = " + (num * 2));
		 * System.out.println(num + " * " + 3 + " = " + (num * 3));
		 * System.out.println(num + " * " + 4 + " = " + (num * 4));
		 * System.out.println(num + " * " + 5 + " = " + (num * 5));
		 * System.out.println(num + " * " + 6 + " = " + (num * 6));
		 * System.out.println(num + " * " + 7 + " = " + (num * 7));
		 * System.out.println(num + " * " + 8 + " = " + (num * 8));
		 * System.out.println(num + " * " + 9 + " = " + (num * 9));
		 * System.out.println(num + " * " + 10+ " = " + (num * 10));
		 * System.out.println(num + " * " + 11+ " = " + (num * 11));
		 * System.out.println(num + " * " + 12+ " = " + (num * 12));
		 */
// 구구단
		int num = 2;
		for (; num <= 9;) {
			for (int l = 1; l <= 9; l++) {
				System.out.println(num + " * " + l + " = " + (num * l));

			}
			num++;
		}
	}
}