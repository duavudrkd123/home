package com.yedam.inherit;

public class Child extends Parent { // parent로 부터 상속 받는다.
	private int grade;

	public Child(String name, int age) {
		super(name, age); // super는 부모클래스가 가지고 있는 생성자를말함(호출함)
	}
	
	public Child(String name, int age, int grade) {
		super(name, age);
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

}
