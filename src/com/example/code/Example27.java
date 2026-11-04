package com.example.code;
//Print numbers between 1 and 100 divisible by 9.
public class Example27 {
public static void main(String[] args) {
	int number = 9;
	
	for(int i = 1; i <= 100; i++)
	{
		if(i%number == 0)
		{
			System.out.println(" divisible by 9 "+i);
		}
	}
}
}
