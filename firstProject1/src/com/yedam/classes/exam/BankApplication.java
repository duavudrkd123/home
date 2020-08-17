package com.yedam.classes.exam;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountAry = new Account[100];
	private static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("----------------------------------------------");
			System.out.println("1.계좌 생성    2.계좌목록    3.예금    4.출금    5.종료");
			System.out.println("_-_-_-_-_-_------------------------------------");
			System.out.print("선택 :  ");

			int selectNo = scn.nextInt(); scn.nextLine();

			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}

		}
		System.out.println("프로그램 종료");
	}

	private static void createAccount() {
		System.out.print("새로운 계좌번호 입력하세요");
		String ano = scn.next();

		System.out.print("성함을 입력하세요");
		String owner = scn.next();

		System.out.print("초기 입금액을 입력하세요");
		int balance = scn.nextInt();
		scn.nextLine();

		Account a = new Account(ano, owner, balance);
		for (int i = 0; i < accountAry.length; i++) {
			if (accountAry[i] == null) { // null갋ㅅ일때 넣어라
				accountAry[i] = a;
				break;
			}
		}
	}

	// 계좌목록보기
	private static void accountList() {
		for (Account acco : accountAry) {
			if (acco != null) {
				System.out.println("계좌번호: " + acco.getAno() + "이름: " + acco.getOwner() + "잔액: " + acco.getBalance());
			}
		}
	}

	// 예금하기
	private static void deposit() {
		System.out.println("계좌번호: ");
		String ano = scn.nextLine();
		System.out.println("입금액: ");
		int balance = scn.nextInt();
		
		for (int i = 0; i < accountAry.length; i++) {
			if (accountAry[i] != null && accountAry[i].getAno().equals(ano)) {
				int curBalance = accountAry[i].getBalance();
				accountAry[i].setBalance(curBalance + balance);
			}
		}
	}

	private static void withdraw() {
		System.out.println("계좌번호: ");
		String ano = scn.nextLine();
		System.out.println("출금액: ");
		int balance = scn.nextInt();
		Account acnt = findAccount(ano);
		int curBalance = acnt.getBalance(); // 현재잔액
		acnt.setBalance(curBalance - balance); // 잔고
	}

	private static Account findAccount(String ano) {
		Account searchAcnt = null;
		for (int i = 0; i < accountAry.length; i++) {
			if (accountAry[i] != null && accountAry[i].getAno().equals(ano)) {
				searchAcnt = accountAry[i]; // Account[]
			}
		}
		return searchAcnt;
	}
}

