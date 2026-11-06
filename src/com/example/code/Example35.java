package com.example.code;

//Calculate the power of a number using a method.
public class Example35 {
	public static void main(String[] args) {
       System.out.println(powOfNumber(2, 3));
	}

	public static double powOfNumber(int number, int cube) {

		double result = Math.pow(number, cube);
		return result;
	}
}
