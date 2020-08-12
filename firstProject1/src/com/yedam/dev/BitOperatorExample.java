package com.yedam.dev;

public class BitOperatorExample {
	public static void main(String[] args) {
		int v1 = 10;
		int v2 = ~v1; // ~를 쓰는걸 1의 보수라고 한다. (v2+1) 2의 보수 쓰는이유 구글에 검색
		System.out.println("v1 : " + v1);
		System.out.println("v2 : " + (v2 + 1));
		byte b1 = 10;
		byte b2 = 4;
		// byte b3 = b1 + b2; // 더하기 빼기 곱하기 나누기는 int형으로 계산을 하기 때문에 오류가 난다
		int b3 = b1 % b2;

		// int result = 10/4; //2.5라고 출력되어야 되는데 int는 소수점을 받지 못하기 때문에 2만 출력된다.
		// double result = 10 / 4; // 2.0이라고 출력이 된다, 이유는 둘다 int타입으로 인식해서,
		double result = 10 / 4.0; // 4.0이라고 주면 2.5라고 출력이 된다.
		System.out.println(result);

	}
}
