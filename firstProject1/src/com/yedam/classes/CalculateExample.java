package com.yedam.classes;

public class CalculateExample {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		System.out.println(cal.add(10, 20)); // Calculator 에서 식을 가져와서 사용하였다.
		System.out.println(cal.add(10.0, 20.0));
		
		double r1 = 3.5;
		cal.getArea(r1);
		double r2 = 4;
		int R = 4, X = 5;
				
		
		System.out.println("가로" + R + ", 세로" + X + ", 넓이는 " + cal.getR(R, X) + "입니다"); //내가한거
		
		
	}
}
