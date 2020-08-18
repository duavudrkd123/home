package com.yedam.classes;

import java.util.Scanner;

public class FriendAddress {
	static Scanner scn = new Scanner(System.in); // static을 붙여주면 밑에도클라스단위로 쓸수있다
	static Friend[] friends = new Friend[100];

	public static void main(String[] args) {
		while (true) {
			System.out.println("________________________________________");
			System.out.println("1.학교친구    2.회사친구     3.친구    4.리스트    9.종료");
			System.out.println("-_______________________________________");
			System.out.println("선택 > ");
			int selectNo = scn.nextInt();
			scn.nextLine();
			if (selectNo == 1) {
				addUnivFriend();

			} else if (selectNo == 2) {
				addComFriend();
			} else if (selectNo == 3) {
				addFriend();

			} else if (selectNo == 4) {
				friendList();

			} else if (selectNo == 9) {
				break;
			}

		}
		System.out.println("프로그램 종료");
	}

	public static void friendList() {
		for (Friend friend : friends) {
			if (friend != null)
				System.out.println(friend.toString());
		}
	}

	public static void addFriend() {

		System.out.println("그외친구등록.");
		System.out.println("이름입력: ");
		String name = scn.nextLine();
		System.out.println("전화입력: ");
		String phone = scn.nextLine();

		Friend friend = new Friend();
		friend.setName(name);
		friend.setPhone(phone);

		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				friends[i] = friend;
				break;
			}

			System.out.println("입력완료");
		}
	}

	// 회사친구등록메소드
	public static void addComFriend() {

		System.out.println("친구등록.");
		System.out.println("이름입력: ");
		String name = scn.nextLine();
		System.out.println("전화입력: ");
		String phone = scn.nextLine();
		System.out.println(" ");
		String comName = scn.nextLine();

		ComFriend friend = new ComFriend();
		friend.setName(name);
		friend.setPhone(phone);
		friend.setComName(comName);

		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				friends[i] = friend;
				break;
			}
		}

		System.out.println("입력완료");
	}

	// 학교친구등록 메소드
	public static void addUnivFriend() {

		System.out.println("학교친구등록.");
		System.out.println("이름입력: ");
		String name = scn.nextLine();
		System.out.println("전화입력: ");
		String phone = scn.nextLine();
		System.out.println("전공입력: ");
		String major = scn.nextLine();
		UnivFriend friend = new UnivFriend();
		friend.setName(name);
		friend.setPhone(phone);
		friend.setMajor(major);

		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				friends[i] = friend;
				break;
			}
		}

		System.out.println("입력완료");
	}

}