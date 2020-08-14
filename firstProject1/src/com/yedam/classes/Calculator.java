package com.yedam.classes;

public class culator {
	double pi = 3.14; // pi라는 변수에 3.14를 적용


	//가로, 세로 => 넓이를 반환해주는 메소드를 생성
	public String GetRe(double x, double y) {
		return "가로" + x + "세로" + y + "넓이" + getR(x, y) + "입니다.";
	}
	public double getR (double a, double b) {
		double A = a * b;
		return A; // 내가한거
	}
	
	public int add(int x, int y) { // 퍼블릭타입에 int형의 타입만 사용가능, add라는 매소드를 생성
		int sum = 0; // sum에 0을 넣고
		sum = x + y; // sum =
		return sum;

	}

	public double add(double x, double y) {
		return x + y;
	}

	public void getArea(double a) { //원의 넓이를 구하는 것
		double result = pi * a * a;
		System.out.println("반지름 " + a + "의 넓이는 " + result);

	}
}
