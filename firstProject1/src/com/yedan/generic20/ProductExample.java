package com.yedan.generic20;

import com.yedam.classes.Person;

public class ProductExample {
	public static void main(String[] args) {
		Product<String, Person> pr1 = new Product<String, Person>();
		pr1.setModel(new Person());// "hello"가 오면 오류난다
		pr1.setType("유형"); // 스트링 클래스는 바로 만들수있다. 원래라면 new String("유형")으로 만들어야된다.

		Product<String, Integer> p1 = new Product<>();
		p1.setModel(10);
		p1.setType("최재역");
		Product<String, Integer> p2 = new Product<>();
		p2.setModel(10);
		p2.setType("최재역");

//		p1 == p2  //이값은 항상 false이다

		boolean tof = Utils.compare(p1, p2);
		if (tof)
			System.out.println("논리적으로 동등.");
		else
			System.out.println("논리적으로 다름.");

	}

}
