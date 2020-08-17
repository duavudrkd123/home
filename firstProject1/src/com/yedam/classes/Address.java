package com.yedam.classes;

import java.util.Scanner;

public class Address {
	public static void main(String[] args) {

// 1. 정보입력(이름, 나이, 전화번호)
//2. 리스트
//(3). 이름조회
//(4). 이름조회 후 수정
//9. 종료
		Friend[] friends = new Friend[100];
		// friend클래스를 담는 배열, friends는 그냥 변수 friend[100]은 100개의 자리를 만드는것
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		// 메뉴 출력/
		while (run) {
			System.out.println("________________");
			System.out.println("1. 정보입력,  2. 리스트     9.종료");
			System.out.println("___________________");
			System.out.print("선택 : ");
			int selectNo = scn.nextInt();// 인트타입의 입력을 selectno에 넣겠다.
			scn.nextLine(); // int는 번호 입력하고 내려가서 line에 엔터가 들어가서 넘어가버린다.
			if (selectNo == 1) {
				System.out.println("이름 입력 하쇼 : ");
				String name = scn.nextLine();
				System.out.println("나이 입력 하쇼 : ");
				int age = scn.nextInt();
				scn.nextLine(); // int는 라인으로 못받으니까
				// nextInt 로 바꿔준다
				System.out.println("번호 입력 하쇼 : ");
				String Phone = scn.nextLine();
				Friend f = new Friend(name, age, Phone); // friend f 라는 변수에 담는것
				// 한건만 입력해야됨
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] == null) { // null갋ㅅ일때 넣어라
						friends[i] = f;
						break; // for 반복문 탈출
					}
				}
			} else if (selectNo == 2) {
				for (Friend frnd : friends) {
					if (frnd != null) {
						System.out.println(
								"이름: " + frnd.getName() + ", 나이: " + frnd.getAge() + ", 번호: " + frnd.getPhone());
					}
				}
			} else if (selectNo == 9) {
				run = false;
			}

		}
		System.out.println("프로그램 종료.");
	}// main
}// class
