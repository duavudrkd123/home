package com.yedam.collection;


import java.util.HashSet;
import java.util.Set;


public class HashSetExample {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<>();
		set.add(new Member("김다희", 20));
		set.add(new Member("김도은", 21)); // set은 동일한 값을 허용하지 않는다
		set.add(new Member("김도은", 20));
		
		for(Member mem : set ) {
			System.out.println(mem.getName()+","+mem.getAge());
		}

	}
}
