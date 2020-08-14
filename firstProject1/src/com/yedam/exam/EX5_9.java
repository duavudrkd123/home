package com.yedam.exam;

import java.util.Scanner;

public class EX5_9 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println(" ________________________________________________");
			System.out.println("|       //         //           //      //      /");
			System.out.println("|1.학생수 || 2.점수입력 || 3. 점수리스트 || 4.분석 || 5.종료|");
			System.out.println("|______//_________//___________//______//______/");
			System.out.println("선택> ");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				System.out.print("학생수 입력해라-_-! : ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
				System.out.println("배열이 생성되었다: " + studentNum);
	
			
			} else if (selectNo == 2) {
				for (int i = 0; i < scores.length; i++) {
					System.out.print("이름모를[" + i + "]번의 학생의 점수 : ");
					scores[i] = scanner.nextInt();
				}
			} else if (selectNo == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println("리스트 of 점수 >_<: " + scores[i]);
				}
			} else if (selectNo == 4) {

				int maxV = 0;
				int sum = 0;
				double avg = 0;
				{
					for (int i = 0; i < scores.length; i++)
						sum = sum + scores[i];
				}
				avg = (double) sum / scores.length;
				for (int num = 0; num < scores.length; num++) { // int num = 0; num < scores.length; num++
					sum = sum + scores[num];// sum = sum + num;
					if (maxV < scores[num])
						maxV = scores[num]; // if 엘스를 줄여보자.
				}
				System.out.println("분석결과는");
				System.out.println("합계 : " + sum);
				System.out.printf("평균값  %.2f", avg);
				System.out.println();
				System.out.println("최대값 : " + maxV);
				
			} else if (selectNo == 5) {
				run = false;
			}

		}
		System.out.println("끗");
	}

}
//scn.nextInt(); 입력값을 받을때까지 기다리기 때문에 무한반복이 되지 않음
//