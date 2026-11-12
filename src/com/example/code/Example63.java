package com.example.code;

import java.util.Scanner;

//Create a method that accepts an array size, reads elements 
//and returns the array.
public class Example63 {
	public static void main(String[] args) {
		int size = 5;
		int[] arr = readArray(size);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);

		}
	}

	public static int[] readArray(int size) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter size of an array ");
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}

}
