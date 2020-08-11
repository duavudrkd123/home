package com.yedam.dev;

public class LongExample {
	public static void main(String[] args) {
		long l1 = 10;
		System.out.println("long 최대값: " + Long.MIN_VALUE);
		System.out.println("long 최대값: " + Long.MAX_VALUE);
		long l2 = 20;
		int result =(int) (l1 * l2); // int result = int l1 * l2; 로하면 오류가 난다( 이유는 long이 int보다 더 큰 수를 받기 때문에, int로 표현이 되지 않아서 int로 변환한후 출력을 해줘야 오류가 나지 않는다
		System.out.println(result);
		}
	}