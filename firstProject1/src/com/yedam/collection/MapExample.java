package com.yedam.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void getinfo(Map<String, String> m) {
		System.out.println("이름: " + m.get("이름"));
		System.out.println("전공: " + m.get("전공"));
	}

	public static void getAge(Map<String, Integer> m2) {
				
			Set<Map.Entry<String, Integer>> entSet = m2.entrySet();
			for (Map.Entry<String, Integer> m1 : entSet) {
				System.out.println(m1.getKey() + ", " + m1.getValue());
		}

	}

	public static void main(String[] args) {

		Map<String, Integer> m2 = new HashMap<>();
		m2.put("최재역", 20);
		m2.put("최역", 21);
		m2.put("최성중", 23);
		getAge(m2);
//
//		Map<Integer, Member> map = new HashMap<>();
//		map.put(11, new Member("김현동", 20));
//		map.put(12, new Member("박진규", 21));
//		map.put(13, new Member("오재훈", 22));
//
//		System.out.println(map.get(11).getName() + ", " + map.get(11).getAge());
//
//		Set<Integer> set = map.keySet();
//		for (Integer i : set) {
//			Member m = map.get(i);
//			System.out.println(m.getName() + ", " + m.getAge());
//		}
//		Set<Map.Entry<Integer, Member>> entSet = map.entrySet();
//		for (Map.Entry<Integer, Member> m : entSet) {
//			System.out.println(m.getKey() + ", " + m.getValue().getName());
//		}

	}
}
