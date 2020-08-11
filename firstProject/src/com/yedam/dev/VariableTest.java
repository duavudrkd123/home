package com.yedam.dev;

public class VariableTest {
 public static void main(String[] args) {
	 	//b = b + 1;
	 	 // 1 ~ 10까지 더하기
int b = 0;
int sum = 0;
for(int i = 0; i < 10; i++) //반복횟수에는 b를 안 넣어도됨 i는 반복횟수
	{ b = b + 1;
	sum = sum + b; // sum += b
	System.out.println("sum = " + sum + ", b =" + b);
	}
 }
}
