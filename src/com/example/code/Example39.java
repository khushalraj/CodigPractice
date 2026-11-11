package com.example.code;

//print prime numbers between 1 to 50
public class Example39 {
	public static void main(String[] args) {
		int num = 50;
		
		for (int i = 2; i <= num; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.println(i + "is prime number");
			} else {
				System.out.println(i + "is not prime number");
			}
		}

	}
}
