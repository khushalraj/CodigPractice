package com.example.code;

//Print array elements greater than their preceding elements.
public class Example65 {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50, 60, 70 };

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[i - 1]) {
                     System.out.println(" greater elements "+arr[i]);
			}
		}

	}
}
