package com.yedam.collection;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExample2 {
	public static void main(String[] args) {
		TreeSet<Person> set = new TreeSet<>();
		set.add(new Person("Jogn1", 10));
		set.add(new Person("Jogn2", 27));
		set.add(new Person("Jogn3", 21));
		set.add(new Person("Jogn4", 24));
		set.add(new Person("Jogn5", 23));

		SortedSet<Person> sSet = set.headSet(new Person("Sorted", 22));
		sSet = set.tailSet(new Person("So", 12));
		sSet = set.subSet(new Person("Temp", 10), new Person("Temp2", 21));
		for (Person person : sSet) {
			System.out.println(person.name + ", " + person.age);
		}
		System.out.println("-----------------------------");
		NavigableSet<Person> nSet = set.headSet(new Person("Sorted", 22), true);
		nSet = set.tailSet(new Person("So", 21), false);
		nSet = set.subSet(new Person("SSS", 24), true, new Person("TTT" , 21), true);
		for (Person person : nSet) {
			System.out.println(person.name + ", " + person.age);
		}
		Iterator<Person> iter = set.iterator();
		while (iter.hasNext()) {

//			String name = iter.next().name;
//			int age = iter.next().age;
//			System.out.println(name + ", " + age); // 가져올 값이 없어서 오류가난다.
		}
	}

}
