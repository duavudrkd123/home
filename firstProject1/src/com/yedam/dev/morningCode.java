package com.yedam.dev;

public class morningCode {
	// main 메소드
	public static void main(String[] args) {
		String /* 문자열을 사용할수있다, 클래스 이름은 항상 대문자로 */ str1 = "Hello";
		String str2 = "World";
		String name = "염평강";
		System.out.println(str1 + ", " + name + ", " + str2);

		int v1 = 150, v2 = 270;
		int result = add(v1, v2);
		System.out.println("결과값: " + result);

		introduce("홍길동"); // 에러가 나는이유는 string타입의 무언가가 들어가 있어야한다

		int result1 = minus(v1, v2);
		System.out.println("결과는 " + result1);
	}

	// static 메소드
	public static void /* 보이드는 반환되는 값이 없다는 뜻 */ introduce(String name) {
		System.out.println("안녕하세요. 저는" + name + "입니다.");
	}

	public static int add(int x, int y) { // method
		int sum = x + y;
		return sum;
	}

	public static int minus(int x, int y) {
		int min = x - y;
		return min;
	}

}
