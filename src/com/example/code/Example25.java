package com.example.code;

//Print all divisors of 10.
public class Example25 {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int number = 10;
		for(int i = 0; i < arr.length; i++)
		{
			if(number%arr[i] == 0)
			{
				System.out.println(" numbers of divisors of 10 "+arr[i]);
			}
		}
	    
	}
}
