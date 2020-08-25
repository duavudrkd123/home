package com.yedam.collection;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<>();
		scores.put(new Integer(97), "최재연");
		scores.put(new Integer(88), "민핻주");
		scores.put(new Integer(84), "김상민");
		scores.put(new Integer(68), "저얄레");
		scores.put(new Integer(87), "문서네");
		scores.put(new Integer(81), "염평강");
		scores.put(new Integer(47), "베이비");

		Map.Entry<Integer, String> entry = scores.lastEntry(); // firstentry : 작은거, lastentry :큰거
		System.out.println("점수(키): " + entry.getKey() + ", 이름: " + entry.getValue());
		// 키 값으로 크다 작다한다.
		Integer icnt = scores.firstKey();
		System.out.println("점수(키): " + icnt
		+", 이름: " +scores.get(icnt)); 
		scores.get(icnt);
		
		Map.Entry<Integer, String> pEntry = scores.pollFirstEntry();

	}
}
