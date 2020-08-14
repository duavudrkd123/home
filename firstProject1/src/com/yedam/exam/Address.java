package com.yedam.exam;

public class Address {
	String name;
	String age;
	String pnum;

	public Address() {
//		name = "No";
//		age = 99;
//		pnum = "010-9992-9291";
	}

	public Address(String name) {
		this.name = name;

	}

	public Address(String name, String age) {
		this.name = name;
		this.age = age;
	}

	public Address(String name, String age, String pnum) {
		this.name = name;
		this.age = age;
		this.pnum = pnum;
	}

	// 메소드
	public String getName() {
		return name;
	}
	public String getAge() {
		return age;
	}
	public String getPnum() {
		return pnum;
	}
}