package com.example.code;

public class Example19 {
public static void main(String[] args) {
	int num = 31;
	int reverse = 0;
	int original = reverse;
	while(num > 0)
	{
	   reverse = reverse * 10;
	   reverse = reverse + num % 10;
	   num = num / 10;
	}
	System.out.println(" reverse number is : "+reverse);
}
}
