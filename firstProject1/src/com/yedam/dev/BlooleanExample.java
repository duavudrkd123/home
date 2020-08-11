package com.yedam.dev;

public class BlooleanExample {
	public static void main(String[] arges) {
		long l1 = 10L;
		int i1 = 10;
		
		boolean trueOrFalse = false;//a, 10 같은 값은 올수 없다. only true or false
		
		
		trueOrFalse = l1 != i1; // *이렇게해도 적용되어 나온다 3* != = false
		//trueOrFalse = l1 == i1;/*이렇게해도 적용되어 나온다 1*/ == = true ,!는 반대의 뜻
		
		
		if (!trueOrFalse) {
		
			
		// if (trueOrFalse)/*true or false 를 확인하는것1*/ {
		
			
		// /*이렇게해도 적용되어 나온다 2*/if (l1 == i1) {
		
			
		//if (trueOrFalse/*이렇게해도 적용되어 나온다 3*/) {
			
			
			
			System.out.println("이 내용은 참일 경우에 출력됩니다."); // false하면 값이 안나온다.
			System.out.println(trueOrFalse); //false로 출력
	}
		
		
	//>. <. >=, <=
	if (l1 >= i1) {
		System.out.println("왼쪽이 크거나 같습니다."); 
	}
}}

