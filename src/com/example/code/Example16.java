package com.example.code;

public class Example16 {
public static void main(String[] args) {
	int num = 123456;
	int reverse = 0;
	while(num > 0)
	{
	   reverse = reverse * 10;
	   reverse = reverse + num % 10;
	   num = num / 10;
	}
	System.out.println(" reverse number is : "+reverse);
}
}
