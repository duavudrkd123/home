package com.yedam.exam;

import java.util.Scanner;

public class Friend {
	public static void main(String[] args) {

		

		boolean run = true;
		String name;
		String age ;
		String pnum;
		String[] f1 = null;
		Scanner scn = new Scanner(System.in);

		while (run) {
			System.out.println("1.정보입력    2.리스트    9. 종료");
			System.out.print("선택 : ");
			int selectN = scn.nextInt();
			scn.nextLine();
			for (int i = 0; i < 3; i++) {

				if (selectN == 1) {
					System.out.println("정보를 입력하세요 ");

					System.out.println("이름 입력");
					name = scn.nextLine();

					System.out.println("나이 입력");
					age = scn.nextLine();
					

					System.out.println("번호입력");
					pnum = scn.nextLine();

				System.out.println (f1[i].intro(name, age, pnum));
					

				} else if (selectN == 2) {
					System.out.println("k99");
					

				} else if (selectN == 9) {
					run = false;
				}

			}
			System.out.println("끝");
		}
	}
}
