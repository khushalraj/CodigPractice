package com.example.code;

import java.util.Scanner;

public class Example22 {
	public static void main(String[] args) {
		double result = 0;
		for (int i = 0; i < 10; i++) {
			
			if (i % 2 == 0) {
				result = Math.sqrt(i);
				
			}
			
		}
		System.out.println("square of even digits of number : " + result);
		
	}
}
