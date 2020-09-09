package com.yedam.doeun;

public class Exercise07 {
	public static void main(String[] args) {
		int max = 0;
		int[] arry= {1,5,3,8,2};
		for(int i : arry) {
			if(i>max) {
				max = i;
			}
		}
		System.out.println(max);
	}
}
