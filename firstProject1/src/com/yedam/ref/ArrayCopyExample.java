//145~148쪽

package com.yedam.ref;

public class ArrayCopyExample {
	public static void main(String[] args) {
		int[] origAry;
		origAry = new int[] { 3, 6, 9, 2, 4, };
		int[] cpyAry = new int[5];

		for (int i = 0; i < origAry.length; i++) {
			cpyAry[0] = origAry[i];
		}
		System.out.println(cpyAry);
	}
}
