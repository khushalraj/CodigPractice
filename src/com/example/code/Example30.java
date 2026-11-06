package com.example.code;

//Check whether a number is a perfect number.
public class Example30 {
	public static void main(String[] args) {
		int number = 6;
		int sum = 0;

		for (int i = 1; i < number; i++) {
			if (number % i == 0) {

				sum = sum + i;
			}
		}
		if(sum == number)
		{
			System.out.println(number+" is perfect number ");
		}
		else
		{
			System.out.println(number+" is not perfect number ");
		}
	}
}
