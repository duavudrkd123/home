package com.yedan.generic20;

import com.yedam.classes.Person;

public class BoxExample {
	public static void main(String[] args) {
		Box<String> box = new Box<String> (); //<>위치에 타입을 지정해준다
		box.set(new String("Hello"));
		String result = box.get();
		
		Box<Person> box2 = new Box<>();
		box2.set(new Person());
		Person p1 = box2.get();
		
		Box<Person> box3 = Utils.boxing(new Person());
		
		Box<String> box4 = Utils.boxing(new String("hhh"));
		
	}
		
//		Box box = new Box();
//		String str1 = new String("Hello");
//		box.set(str1);
//		String result = (String) box.get(); 
//		// object에 담으려면 형변환을 해줘야 된다.
//		
//		Person p1 = new Person(); // import 해준다;
//		box.set(p1);
//		Person p2 = (Person) box.get();
//		
//		result = (String) box.get(); // runtime error
//	}
}
