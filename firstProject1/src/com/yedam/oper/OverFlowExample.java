package com.yedam.oper;

public class OverFlowExample {
	public static void main(String[] args) {
		System.out.println(Integer.MIN_VALUE); // 21474836476+10= -, -2147483648
//		int result = safeAdd(2147483647, 10);
		int result = safeAdd(-2147483647, -100);
		System.out.println(result);
	}

	public static int safeAdd(int a, int b) { // int로 받고싶으면 int로 double로 받고 싶으면 double을 적어주면된다
		int ab = 0;
		if ((Integer.MAX_VALUE - b) < a) {
			System.out.println("유효값이 아닙니다.");// 계산범위를 넘으면 출력
			System.out.println(Integer.MAX_VALUE - b);
			ab = 0;
		} else if ((Integer.MIN_VALUE - b) < a) {
			System.out.println("유효값이 x");
			System.out.println(Integer.MIN_VALUE - b);
			ab = 0;
		} else {
			ab = a + b;
			System.out.println("F");
		}

		return ab;
	}
}
