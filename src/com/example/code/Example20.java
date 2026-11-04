package com.example.code;

public class Example20 {
	public static void main(String[] args) {
		int result = 1;
		int base = 2;
		int component = 5;

		for (int i = 1; i < component; i++) {
			result = result * base;
		}

		System.out.println(" Base " + base);
		System.out.println(" Component " + component);
		System.out.println(" result " + result);
	}
}
