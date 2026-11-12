package com.example.code;

//Calculate the sum and average of array elements
public class Example68 {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50, 60, 70 };
		int sum = 0;
		int avg = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		avg = sum / arr.length;
		System.out.println(" Sum of array elements " + sum);
		System.out.println(" avg of array elements " + avg);
	}

}
