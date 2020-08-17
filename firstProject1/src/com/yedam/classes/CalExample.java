package com.yedam.classes;

public class CalExample {
	public static void main(String[] args) {
		Cal cal = new Cal();

		// 생성자 생성
//	cal.r = 5; // -값을 넣어도 계산이 되어버린다.
//  System.out.println("반지름: " + cal.r + " 의 넓이는: " + cal.getArea()); //반지름 넓이를 계산하는 것
		cal.setRadius(19);
		System.out.println("반지름: " + cal.getRadius() + " 의 넓이는: " + cal.getArea());
//		System.out.println(10);
//		System.out.println(10.5);
//		System.out.println("10");
		// 타입이 다른데 어떻게 다 출력해주나?
		// println은 각각의 데이터 파일이 오더라도 그렇게 맞게 정의가 되어있어 출력이 가능하다
		print(200);


	}
// 메소드 오버로딩(동일한 메소드 이름을 사용 : 매개값의  타입이 다르거나 갯수가 다름)
	public static void print(int a) {
		System.out.println("입력값은: " + a);

	public static void print(double a) {
				System.out.println("입력값은: " + a);

	public static void print(String a) {			
		System.out.println("입력값은: " + a); // string은 ""넣어야됨
	}
}
