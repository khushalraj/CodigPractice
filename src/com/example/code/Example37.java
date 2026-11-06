package com.example.code;

//Check whether a number is a strong number.
public class Example37 {
	public static void main(String[] args) {
		int number = 145;
		int original = number;
		int sum = 0;
		int digit = 0;
		while (number > 0) {
			digit = number % 10;
			int fact = 1;

			for (int i = 1; i <= digit; i++) {
				fact = fact * i;
			}
			sum = sum + fact;
			number = number / 10;
		}
		if (sum == original) {
			System.out.println(original + "is a strong number ");
		} else {
			System.out.println(original + "is not a strong number ");
		}
	}
}
