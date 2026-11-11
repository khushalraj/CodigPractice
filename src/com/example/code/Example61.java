package com.example.code;

//Read an array and calculate the sum of its elements.
public class Example61 {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50, 60, 70 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println(" sum of elements : " + sum);
	}
}	
