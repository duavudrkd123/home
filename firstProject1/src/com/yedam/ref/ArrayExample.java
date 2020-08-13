package com.yedam.ref;

public class ArrayExample {
	public static void main(String[] args) {
		int score1 = 10, score2 = 20, score3 = 30, score4 = 40;
		score2 = 50; // 값을 바꿀수 있다
		int sum = score1 + score2 + score3 + score4;

		int[] intAry = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 98 }; // int[] intAry 배열기호라고한다
		sum = intAry[0] + intAry[1] + intAry[2] + intAry[3]; // double타입의 데이터를 담으려면 int대신 double넣으면 된다
		intAry[1] = 50; // 값을 바꿀수 있다.

		sum = 0;
		for (int i = 0; i < intAry.length; i++) { // 인트어레이의 데이터 갯수를 알려줌
			System.out.println(intAry[i]);
			sum = sum + intAry[i];
		}
		System.out.println("sum : " + sum);
		// double타입의 데이터를 담으려면 int대신 double넣으면 된다
		double sums = 0;
		double[] dary = { 2.3, 4.3 };
		for (int c = 0; c < dary.length; c++)
			sums = sums + dary[c];
		System.out.println(sums);
		String[] sary = { "ㅗㅑ", "ㅓㅜㅑ", "굿", "낫굿" };
		for (int i = 0; i < sary.length; i++) {
			System.out.println(sary[i]);
		}
		String[] scoreAry = new String[5]; // 배열의 크기만
		for (int i = 0; i < scoreAry.length; i++) {
			System.out.println(scoreAry[i]);
		}
		scoreAry[0] = "one";
		scoreAry[1] = "two";
		scoreAry[2] = "three";
		scoreAry[3] = "four";
		for (int i = 0; i < scoreAry.length; i++) {
			System.out.println(scoreAry[i]);
		}
		int[] mathAry;
		mathAry = new int[] { 1, 2, 3, 4 }; //new를 사용해서 값을 넣어주곘다,
		
	}
}