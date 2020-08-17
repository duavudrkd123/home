package com.yedam.classes.exam;

public class Account1 {
	int MIN_BALANCE = 0;
	int MAX_BALANCE = 1000000;
	
	private int balance = 0;
	
	public void setBalance(int balance) {
		if(balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
			this.balance = balance;
		}
	}

	public int getBalance() {
		return this.balance;
	}
}