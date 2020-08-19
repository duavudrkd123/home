package com.yedam.classes;

import java.util.Calendar;

public class CalendarExample {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance(); // 2020-08-19
//		System.out.println(cal.get(Calendar.YEAR));
//		System.out.println(cal.get(Calendar.MONTH)); // 월은 0부터 시작한다. 0~11
//		System.out.println(cal.get(Calendar.DATE));
		// 2020 7 19로 출력
		
		
//		cal.set(2020, 2, 1); // 2020 2 1로 출력된다
//		System.out.println(cal.get(Calendar.YEAR));
//		System.out.println(cal.get(Calendar.MONTH)); // 월은 0부터 시작한다. 0~11
//		System.out.println(cal.get(Calendar.DATE));
		// 2020 2 1 로 출력

		cal.set(2020, 7, 1); // 2020 7, 7로 출력된다
//		System.out.println(cal.get(Calendar.YEAR));
//		System.out.println(cal.get(Calendar.MONTH)); 
//		System.out.println(cal.get(Calendar.DAY_OF_WEEK));// 일요일
//		//2020 7 7 로 출력
		
		
		cal.set(2020, 7, 0); // 2020 6, 6, 31로 출력된다. 그달의 마지막날은 0을 넣으면 됨
//		System.out.println(cal.get(Calendar.YEAR));
//		System.out.println(cal.get(Calendar.MONTH)); 
//		System.out.println(cal.get(Calendar.DAY_OF_WEEK)); //마지막 주에 있는 날짜수
//		System.out.println(cal.get(Calendar.DATE));
		//2020 8 4 30으로 출력

		createCalendar(2020, 8); // 2020년 8월 달력을 보여주세요
	}

	private static void createCalendar(int year, int month) {
		Calendar cal = Calendar.getInstance();
		System.out.println("일 월 화 수 목 금 토");
		cal.set(year, month-1, 1);//이번달의 첫 날 
		System.out.println("요일 숫자 " + cal.get(Calendar.DAY_OF_WEEK));
		System.out.println("*");
		cal.set(year, month, 0); //이번달의 마지막 날
		int b = cal.get(Calendar.DATE);
//		System.out.println("b의 값은" + b);
		cal.set(year, month-1, 1);//이번달의 첫 날 
		
		for(int a=0; a < (cal.get(Calendar.DAY_OF_WEEK)-1) ; a++ ) {
			System.out.print("*");
		}
		
		for(int a=0 + cal.get(Calendar.DAY_OF_WEEK) ; a <= b + cal.get(Calendar.DAY_OF_WEEK) -1; a++ ) {
			System.out.print(a-6); 
			if(a%7 == 0) {
				System.out.println();
			}
		}
	}
	/*1. 메서드에 인수 넣기
	 *2. 월 정해서 날짜 수만큼 수 입력 7배수에 엔터넣기
	 *3. 공백 넣기
	 *4. 배열깔끔하게
	 */
	
	

}
