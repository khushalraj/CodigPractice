package com.example.code;

import java.util.Scanner;

public class Example1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter age : ");
		int age = sc.nextInt();
		System.out.println(" Enter gender : ");
		String gender = sc.next();

		if (age  >= 18 && gender.equals("female")) {
			System.out.println("women is eligible for marriage");
		}
		if (age >= 21 && gender.equals("male")) {
			System.out.println("men is eligible for marriage");
		}
		else
		{
			 System.out.println("Not eligible or invalid gender.");
		}
	}
	}

