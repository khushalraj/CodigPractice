package com.example.code;

//Find the maximum element at even indices.
public class Example67 {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50, 60, 70 };
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(" max ekement at even indices " + max);
	}
}
