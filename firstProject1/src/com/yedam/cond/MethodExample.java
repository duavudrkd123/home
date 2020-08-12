package com.yedam.cond;

public class MethodExample {
	public static void main(String[] args) {
		// 멀티테이블위에 커서를 가져가면 연산될 멀티테이블이 밑에 하이라이트 된다.
		multiTable(3, 4); //3단출력
		multiTable(9); //9단출력
		multiTable();  //2단출력 이 된다
//		int num = 2;
//		for (; num <= 9; num++)
//			multiTable(num /* int a 로 들어간다 */); // 멀티테이블이라는 값을 소환, ()값이 있는 걸 출력할꺼다라는거
	}

	public static void multiTable(int a, int b) {
		for (int i = a; i < b; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
		}
	}

	public static void multiTable(int a) {// 여기부터
		int num1 = a;
		for (int i = 1; i < 10; i++) // 여기까지 멀티테이블이라는 정의 구문이다
			System.out.println(num1 + " * " + i + " = " + (num1 * i));

	}

	public static void multiTable() {
		int num1 = 2;
		for (int i = 1; i < 10; i++)
			System.out.println(num1 + " * " + i + " = " + (num1 * i));

	}
}