package com.yedam.abstracts;

public class AnimalExample {
	public static void main(String[] args) {
//		Animal anm = new Animal(); // 추상클래스는 인스턴스 생성 불가하다.
		Animal anm = new Cat();
		anm.breathe();
		anm.sound();  
		
		anm = new Dog();
		anm.breathe();
		anm.sound();
		
		// 추상을 사용하지 않으면 cat이랑 dog랑 다르게 생길수도있다. 
		// sound라고 강제 사용하기 위해
		
		int a = 10;
		double b = 1; //프로모션: 자동 줄변환
		a = (int) b; //캐스팅: ~~
		
		Dog dog = (Dog) anm;
		// 부모와 자식간 상속의 관계있을때 강제로 행변환 시킬수있다
		dog.sound();
	}

}
