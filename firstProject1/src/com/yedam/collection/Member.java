package com.yedam.collection;

public class Member {
	private String name;
	private int age;
	public Member(String name, int age) {
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
	
	// hashcode, equals 활용; 논리적으로 동일한 객체/
	@Override
	public int hashCode() {
		return this.age; // 이름이 같으면 허용하지 않겠다.
	}
	@Override
	public boolean equals(Object obj) {
		Member mem = (Member) obj;
 		return this.name.equals(mem.name);
	}

		return null;
	}

	

}
