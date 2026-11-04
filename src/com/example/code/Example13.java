package com.example.code;

public class Example13 {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 6, 8, 10 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				sum = sum + arr[i];
			}
		}
		System.out.println(" sum of odd numbers : " + sum);
	}
}
