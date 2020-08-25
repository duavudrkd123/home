package com.yedam.collection;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Example04 {
	public static void main(String[] args) {
		// 배열의 크기 3
		// 1~ 6까지의 임의의 숫자가 반복되지 않도록 배열에 저장해 보세요
		int[] intAry = new int[3];
		Random num = new Random();

		for (int i = 0; i < 3; i++) {
			intAry[i] = num.nextInt(5) + 1;
			for (int j = 0; j < i; j++) {
				if (intAry[i] == intAry[j]) {
					i--;
				}
			}
		}
		for (int b = 0; b < 3; b++) {
			System.out.println(intAry[b]);
		}
// 밑에꺼랑 Person에 꺼 하면 중복이 제거가 된다. hashcode, equals.
		Set<Person> pSet = new HashSet<>();
		pSet.add(new Person("Hong1" , 20));
		pSet.add(new Person("Hong2" , 21));
		pSet.add(new Person("Hong3" , 20));
		
		for (Person p : pSet) {
			System.out.println(p.name + ", " + p.age + ", " + p.toString());
	}
	}
}
