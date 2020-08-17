package com.yedam.classes.statics;

import com.yedam.classes.Person;

public class SingletonExample {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();

		if (s1 == s2) { //주소값을 비교되기때문에 false가 나오는데 이렇게 비교하게 되면
			System.out.println("Same instance.");
		} else {
			System.out.println("Different instance");
			}
		Person p1 = new Person();
//		p1.name = "111";  //값을 받을수 없다
		p1.setName("111"); // 오류가 나지 않는다. 이유는 퍼브릭이기 때문

		}
}
