package com.yedam.ref;

public class ArrayExample3 {
	public static void main(String[] args) {
		int[][] iAry = { { 10, 20 }, // iAry[0]
				{ 30, 40, 50 }, // [1]
				{ 60, 30 }, // [2]
				{ 40 } // [3]
		}; // ary 중괄
		for (int j = 0; j < iAry.length; j++) {
			for (int i = 0; i < iAry[j].length; i++) {
				System.out.print(iAry[j][i] + " ");
			}
			System.out.println();
		}
	} // main 중괄
} // class 중괄
