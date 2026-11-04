package com.example.code;

//Print numbers between 1 and 30 divisible by both 3 and 9.
public class Example26 {
	public static void main(String[] args) {
		int number1 = 3;
		int number2 = 9;
		for (int i = 1; i <= 30; i++) {
			if (i % number1 == 0 && i % number2 == 0) {
				System.out.println(" divisible by 3 & 9 " + i);

			}
		}
	}
}
