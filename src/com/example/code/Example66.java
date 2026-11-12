package com.example.code;

//Calculate the sum of elements at odd indices.
public class Example66 {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50, 60, 70 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 != 0) {
				sum = sum + arr[i];
			}

		}
		System.out.println("sum of elements at odd indices " + sum);
	}
}
