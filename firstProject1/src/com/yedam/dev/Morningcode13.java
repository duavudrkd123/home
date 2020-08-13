package com.yedam.dev;

public class Morningcode13 {
	public static void main(String[] args) {
int n = 0;
while(true) {
	if (n++ ==5)
		break;
	else if (n == 3)
		continue;
	System.out.println("프로그램 진행중...");
}
		int j = 0;
		while (j < 10) {
			int i = 0;
			while (i < 10) {
				i++;
			}
		}
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum = sum + i;
			System.out.println(i);
		}

		int score = 96;
		if (score >= 90) {
			if (score >= 95)
				System.out.println("95 이상");
			else
				System.out.println("90이상입니다ㅡ");
		} else if (score >= 80) {
			System.out.println("80 이상 입니다");

		} else if (score >= 50) {
			System.out.println("50이상이다");
		}
	}
}
