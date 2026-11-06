package com.example.code;
//Calculate the sum of numbers between 20 and 60 divisible by 11.
public class Example29 {
public static void main(String[] args) {
	int sum = 0;
	for(int i = 20; i<=60; i++)
	{
		if(i%11 == 0)
		{
			sum = sum + i;
		}
	}
	System.out.println(" sum of numbers divisble by 11 "+sum);
}
}
