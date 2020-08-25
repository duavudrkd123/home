package com.yedam.collection;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<Integer> tSet = new TreeSet<>();
		tSet.add(new Integer(87));
		tSet.add(new Integer(98));
		tSet.add(new Integer(75));
		tSet.add(new Integer(95));
		tSet.add(new Integer(80));

		Integer t = tSet.first();
		t = tSet.last();
		t = tSet.floor(new Integer(87));// 85보다 작거나 같은값 <=
		t = tSet.lower(new Integer(87)); // 87을 제외한 작은값 <
		t = tSet.ceiling(new Integer(85));// 85보다 크거나 같은값 >=
		t = tSet.higher(new Integer(85)); // 85를 제외한 큰값>
		
		
		Iterator<Integer> dIter = tSet.descendingIterator();
		while(dIter.hasNext()) {
			System.out.println("dIter: " + dIter.next());
		}
		
		NavigableSet<Integer> nSet = tSet.descendingSet();
		for(Integer icnt : nSet) {
			System.out.println("navi: " +icnt);
		}

		int size = tSet.size();
		// 요소를 가지고 와서 삭제.
		for (int i = 0; i < size; i++) {

//			t = tSet.pollFirst();
//			System.out.println(t + ", " + tSet.size()); // 작은넘부터
			t = tSet.pollLast();
			System.out.println(t + ", " + tSet.size()); // 큰놈부터 빼오기
		}

		Iterator<Integer> iter = tSet.iterator();
		while (iter.hasNext()) {
			Integer icnt = iter.next();
		}

	}
}
