package com.yedam.classes.exam;

public class Member {
	String name;
	String id;
	String password;
	int age;

	public Member(String name, String id) {
		this.name = name;
		this.id = id;
		

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

	public String getId() {
		return id;
	}

	public void setId(String name) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
