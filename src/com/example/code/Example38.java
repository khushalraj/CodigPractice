package com.example.code;

//Find numbers for which the sum of digits plus the 
//product of digits equals the original number.
public class Example38 {
	public static void main(String[] args) {
		for (int num = 1; num <= 1000; num++) {
			int sum = 0;
			int product = 1;
			int number = num;
			while (number > 0) {
				int digit = number % 10;
				sum = sum + digit;
				product = product * digit;
				number = number / 10;

			}
			if (sum + product == num) {
				System.out.println(num);
			}
		}

	}
}
