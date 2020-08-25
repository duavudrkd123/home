package com.yedam.collection;

public class Person implements Comparable<Person>{
	String name;
	int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Person o) {
		return o.age - this.age; // 음수(오름차순), 앞의값이 뒷값보다 작으면 음수. 양수 (내림차순)
	}
	

}
