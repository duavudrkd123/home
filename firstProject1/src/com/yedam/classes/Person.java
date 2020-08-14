package com.yedam.classes;

public class Person {
	// 필ㄹ드
	String name;
	int age;
	// 생성자

	public Person() { // 매개값이 생성자를 기본생성자(default constructror)
		name = "annonymous";
		age = 10;
	}

	public Person(String name) {
		this.name = name;
	}

	public Person(String name, int age) { // this: name을 구분하기 위해서 사용. 필드를 구분하기 위해서
		this.name = name;
		this.age = age;
	}

	// 매소드
	public String introduce() { // 필드를 구분할 필요가 없으니까 this를 사용하지 않음
		return " 이름은: " + name + " 나이는: " + age;
	}

	public String getName() { //return값이 있다. void가 없으면 생긴다.
		return name;
	}

	public void setName(String name) { // void가 있으면 return이 없다, 그래서 return을 안적어준다
		this.name = name;
//this는 인스턴스를 말하는거, new person을 만들면 인스턴스가 만들어지는데 그 인스턴스를 가르킨다.		

	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
