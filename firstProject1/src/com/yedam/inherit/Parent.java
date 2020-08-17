package com.yedam.inherit;

public class Parent extends Object { // extends Object 없더라도 오브젝트를 상속 받고 있다.
	private String name;
	private int age;
	
	public Parent() {}
	
	public Parent(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override //재정의 하겠다.
	public String toString() { //오브젝트가 toString이라는 걸 가지고 있어야된다.
//		return super.toString(); // 주소값이 리턴된다
		return "Parent [name=" + name + ", age=" + age + "]"; // 
	}
	
	

}
