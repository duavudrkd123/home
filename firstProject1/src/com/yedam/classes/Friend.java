package com.yedam.classes;

public class Friend {
	private String name;
	private int age;
	private String Phone; // 010-
	// 생성자 만들기 source 가서 generate construct user
	// 생성자 오버로딩

	public Friend(String name, int age, String Phone) {
		this.name = name;
		this.age = age;
		this.Phone = Phone;

	}
	// source 가서 getter and setter
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

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

}
