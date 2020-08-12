package com.yedam.cond;

public class SwitchExample {
	public static void main(String[] args) {
//		double m = Math.random() * 6; // 0< m < 6 임의의 값을 출력
//		double m = (int) (Math.random() * 6); //int타입의 수를 출력해준다
		int m = (int) (Math.random() * 6) + 1; 
		System.out.println(m);
		
		switch (m) {
		case 1:
			System.out.println("1번 나옴 ㅋㅋㄹ");
			break;
		case 2:
			System.out.println("2번 나옴 ㅋㅋㄹ");
			break;
		case 3:
			System.out.println("3번 나옴 ㅋㅋㄹ");
			break;
		case 4:
			System.out.println("4번 나옴 ㅋㅋㄹ");
			break;
		case 5:
			System.out.println("5번 나옴 ㅋㅋㄹ");
			break;
		case 6:
			System.out.println("6번 나옴 ㅋㅋㄹ");
		}
	}
}
