package com.example.code;

//Find all prime numbers present in an array.
public class Example44 {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 15, 17, 19, 20 };
		for (int i = 0; i < arr.length; i++) {
			boolean isPrime = true;
			if (arr[i] <= 1) {
				isPrime = false;

			} else {
				for (int j = 2; j < arr[i]; j++) {
					if (arr[i] % j == 0) {
						isPrime = false;
						break;
					}
				}
			}
			if (isPrime) {
				System.out.println(arr[i] + " is prime number ");
			} else {
				System.out.println(arr[i] + " is not prime number ");
			}
		}

	}
}
