package com.example.code;
//Create a method to add two numbers and check whether their sum is even or odd.
public class Example42 {

	public static void main(String[] args) {
    evenOrOddSum(20, 30);   
	}
	public static void evenOrOddSum(int a, int b) {
		int result = a + b;
		if (result % 2 == 0) {
               System.out.println(" sum of 2 numbers are even : "+result);
		}
		else {
			System.out.println(" sum of 2 numbers are odd : "+result);
		}
	}

	
}
