package com.yedam.exam;

public class EX5_8 {
public static void main(String[] args) {
	int[][] array = {
			{95, 86},
			{83 ,92, 96}, 
			{78, 83, 93, 37, 88}
};
	int sum = 0;
	double avg = 0.0;
	int count=0;
	for (int i = 0; i < array.length; i++) 
		for(int j = 0; j < array[i].length; j++) {
		sum = sum + array[i][j];
		count=count+1;
		}	
	avg = (double) sum /count;
	System.out.println(sum);
	System.out.println(avg);
	System.out.println(array.length);
}
}