package com.example.code;

//Print elements at odd indices and 
//calculate the sum of all elements.
public class Example62 {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50, 60, 70 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 != 0) {
				
				System.out.println("print elements at odd indices " + arr[i]);
			}
			sum = sum + arr[i];
		}
	}
}
