package com.yedam.test;

public class Example04 {
public static void main(String[] args) {
	int pencils = 534;
	int students = 30;
	
	//학생한명이가지는 연필수
	int PPS = (pencils/students);
	System.out.println("연필: " + PPS);
	
	// 남은 연필수
	int PPL = (-(PPS*students-pencils));
	System.out.println("나믄거: " + PPL);
}
}
