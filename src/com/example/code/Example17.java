package com.example.code;

public class Example17 {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 6, 10, 12, 13, 15, 20 };
		int sumOfEven = 0;
		int sumOfOdd = 0;
		int countEvenDigits = 0;
		int counOddDigits = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				countEvenDigits++;
				sumOfEven = sumOfEven + arr[i];
			} else {
				counOddDigits++;
				sumOfOdd = sumOfOdd + arr[i];
			}
		}
		System.out.println("count even Digits : " + countEvenDigits + " sum of Even Digits :  " + sumOfEven
				+ " count odd digits :  " + counOddDigits + " sum of odd digits :  " + sumOfOdd);

	}
}
