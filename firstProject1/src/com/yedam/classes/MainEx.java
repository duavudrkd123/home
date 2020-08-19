
package com.yedam.classes;

public class MainEx {
	
	final int age = 10; // 
	
	public static void main(String[] args) {
		Friend fr = new Friend(); // 인스턴트를 만드는것
		fr.getAge(); //인스턴스 메소드를 만드는거

		
//		Calculator cal = new Calculator(); // 인스턴스 만드는거
		Calculator.add(10, 10); //정적메소드, static이라는 게 있으면Calculator cal = new Calculator(); 안적어도 인스턴스 사용가능 
		
		final int val = 10; // 이변수 바꿀수 없다, 
		val = 20; //그래서 밑에 서 변수를 변경할수없고 에러가 발생
		
		MainEx ex = new MainEx();
		ex.age = 20;
	}

}
