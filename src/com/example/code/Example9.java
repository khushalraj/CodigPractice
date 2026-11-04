package com.example.code;

public class Example9 {
	public static void main(String[] args) {
		int arr[] = { 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19 };
		for (int i = arr.length-1; i >= 0; i--) {
			if (arr[i] % 2 == 0) {	
				System.out.print(" " + arr[i]);
			}

		}
	}
}
