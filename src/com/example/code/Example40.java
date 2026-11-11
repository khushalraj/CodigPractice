package com.example.code;

public class Example40 {
	public static void main(String[] args) {
		int num = 153;
		int original = num;
		int sum = 0;
		int prod = 0;
		while (num > 0) {
			int rem = num % 10;
			sum = sum + rem * rem * rem;
			num = num / 10;

		}
		System.out.println("Armesrong number is : " + sum);

		if (original == sum) {
			System.out.println("number is armstrong number");
		} else {
			System.out.println("number is not armstrong number");
		}
	}
}
