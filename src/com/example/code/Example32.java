package com.example.code;

//Calculate the factorials of selected digits in a number.
public class Example32 {
	public static void main(String[] args) {
		int number = 145;
		
		
		while (number > 0) {
			int digit = number % 10;
			int factorial = 1;
			for (int i = 1; i <= digit; i++) {
			factorial = factorial * i;
			}
			System.out.println(" factorial of " + digit + " = " + factorial);
			number = number / 10;
		}
	}
}
