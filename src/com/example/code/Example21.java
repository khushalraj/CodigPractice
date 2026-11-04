package com.example.code;

import java.util.Scanner;

//Create a menu-driven mathematical program using operations such as square, square root and sine.
public class Example21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter choice : ");
		int choice = sc.nextInt();
		double number;
		double result;
		do {
			switch (choice) {
			case 1:
				System.out.println("1. square of number : ");
				System.out.println(" Enter number : ");
				number = sc.nextDouble();

				result = number * number;
				break;

			case 2:
				System.out.println("2. square root of number : ");
				System.out.println(" Enter number : ");
				number = sc.nextDouble();
				if (number > 0) {
					result = Math.sqrt(number);
					System.out.println(" square root : "+result);
				} else {
					System.out.println(" negative number can't find the squre root ");
				}
				break;
			
				
			case 3:
				System.out.println("3. Enter angles in degrees : ");
				
				number = sc.nextDouble();
                result = Math.sin(Math.toRadians(number));
                System.out.println("sine of number "+result);
                break;
			
			case 4:
				System.out.println("Exit the program : ");
				break;
				
			default:
				System.out.println("you entered wrong choice please try again !!");
			}	
			
		} while (choice != 4);
		sc.close();
	}
}

		
	
	
	

