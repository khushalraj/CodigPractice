package com.example.code;

//Calculate factorial using a method that returns the result.
public class Example33 {
	public static void main(String[] args) {
                System.out.println(calculateFacotrial(1));
	}

	public static int calculateFacotrial(int n) {
        int fact = 1; 
		for(int i=1; i<=n; i++)
         {
        	 fact = fact * i;
         }
		return fact;
	}
}
