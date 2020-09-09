package com.yedam.doeun;

import java.util.Scanner;

public class Exercise09 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum =0;
		int[] scores = null;
		int max = 0;
		double sum=0;
		double avg=0;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------------------");
			System.out.println("1.학생수 2.점수입력 3.점수리스트 4.분석 5.종료");
			System.out.println("-----------------------------------");
			System.out.print("선택 >");
			
			int selectNo = scanner.nextInt();
			if(selectNo == 1) {
				System.out.print("학생수:" );
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
			}else if(selectNo==2) {				
				for(int i=0; i<scores.length; i++) {
					System.out.print("scores["+i+"] : ");
					scores[i]=scanner.nextInt();
				}
			}else if(selectNo == 3) {
				for(int i=0; i<scores.length; i++)
				System.out.println("score["+i+"] : "+scores[i]);
			}else if(selectNo==4) {
				for(int i=0; i<scores.length; i++) {
					sum=sum+scores[i];
					if(scores[i]>max) {
						max = scores[i];
					}
				}avg=sum/scores.length;
				System.out.println(sum);
				System.out.println(max);
				System.out.println(avg);
			}
		}
	}
}
