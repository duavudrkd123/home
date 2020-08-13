package com.yedam.ref;

import java.util.Scanner;

public class AdvancedForExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int[] scores = new int[5];// 5 개이다
		for (int i = 0; i < scores.length; i++) { // 5번 반복한다.
			System.out.println("점수를 입력하세요.");
			scores[i] = scn.nextInt();
		}

		int sum = 0;
		double avg = 0;
		int maxVal = 0;
		 
//		int[] scores = { 9, 3, 8, 7, 5 }; // 안 타입은 정수형 타입
		for (int num : scores) {
			sum += num;
			if (maxVal > num) {
			 
			} else {
				maxVal = num; // if 엘스를 줄여보자.
			}
		}
		
		avg = (double) sum / scores.length;

		System.out.println("합계는 " + sum + " 입니다");
		System.out.println("평균은 " + avg + " 입니다");
		System.out.println("최댓값은  " + maxVal + " 입니다");

	}
}
