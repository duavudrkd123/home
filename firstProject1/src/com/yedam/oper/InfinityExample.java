package com.yedam.oper;

public class InfinityExample {
	public static void main(String[] args) {
		int x = 5;
		double y = 0.0; // 5를 0으로 나누면 계산이 안되는게 일반적

//		double z = x / y; // infinity라고 출력된다.
		double z = x % y; // NaN으로 출력된다
		if (Double.isInfinite(z) || Double.isNaN(z)) { //이런 종류의 값을 불러내겠다
		System.out.println("의미없는 값이다.");// infinite가 참이거나 nan가 참이면 출력된다
		} else { 
		System.out.println(z);

	}
}
}