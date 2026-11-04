package com.example.code;

//Check whether a number is a palindrome.
public class Example24 {
	public static void main(String[] args) {
		int number = 123;
		int reverse = 0;
		int original = number;

		while (number > 0) {
			reverse = reverse * 10;
			reverse = reverse + number % 10;
			number = number / 10;
		}
		if(reverse == original)
		{
			System.out.println(" number is pallindrome : "+reverse);
		}
		else
		{
			System.out.println(" number is not a pallindrome : "+reverse);
		}
	}
}
