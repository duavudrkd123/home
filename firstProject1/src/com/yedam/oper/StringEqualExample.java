package com.yedam.oper;

public class StringEqualExample {
	public static void main(String[] args) {
		int v1 = 20;
		int v2 = 30;
		if (v1 == v2) {
			System.out.println("기본 타입 일 경우 비교..");
		}
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = new String("Hello");

		if (str1 == str2) {
			System.out.println("1, 2는 같은문자");
		}
		if (str1 == str3) {
			System.out.println("1, 3은 같은문자"); // 문장 내용을 비교하려면 equals를 써야한다
		}
		if (str1.equals(str3)) {
			System.out.println("1, 3은 같은문자 equls.");
		}
		// &&: 피연산자 모두가 true 일 경우에만 연산 결과는 true
		System.out.println("&& 1T1F " + ((1 == 1) && (2 == 1)));
		System.out.println("&& 2T " + ((1 == 1) && (2 == 2))); 
	}

}
