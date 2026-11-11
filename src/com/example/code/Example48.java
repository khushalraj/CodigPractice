package com.example.code;

//Print the letter E using stars.
public class Example48 {
	public static void main(String[] args) {
		
		 for (int i = 0; i < 7; i++) {

	            for (int j = 0; j < 5; j++) {

	                if (i == 0 || i == 3 || i == 6 || j == 0) {

	                    System.out.print("*");

	                } else {

	                    System.out.print(" ");
	                }
	            }

	            System.out.println();
	        }
	    }
	}

