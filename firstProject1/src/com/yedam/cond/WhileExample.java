package com.yedam.cond;

public class WhileExample {
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;

		{
			while (i < 10) {
// System.out.println(i);
				i++;
				sum = sum + i;

			}
			//구구단을 while 사용해서 출력
			System.out.println("합 " + sum);

			int num = 2;
			int l = 0;
			{
				while (num < 10) {
					l = 0; // l값이 초기화가 안되서 출력이 안되었던것
					while (l < 9) {
						l++;

						System.out.println(num + " * " + l + " = " + (num * l));
					}
					num++;
				}

			}
		}
	}
}
