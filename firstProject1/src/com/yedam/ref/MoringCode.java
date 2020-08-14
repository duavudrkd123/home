// 배열에 1씩 더하기 싫습
package com.yedam.ref;

public class MoringCode {
	public static void main(String[] args) {
		double[] dAry = new double[5];
		dAry[0] = 1.2;
		for (int j = 0; j < 6; j++) {
			System.out.println();
		}
		int[][] iAry = new int[5][5];
		int num1 = 1;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				iAry[i][j] = num1++;
				System.out.printf("%3d", iAry[i][j]);
			}
			System.out.println();
		}
		System.out.println("---------------------------");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%3d", iAry[j][i]); // i랑 j 바꾸면 세로로 합, 가로로합 한다.

				// System.out.printf("%3d", iAry[i][j]);
			}
			System.out.println();
		}

//			int result = iAry[i][j];

	}
}
