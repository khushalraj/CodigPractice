package com.example.code;
//Print numbers between 1 and 20 divisible by both 2 and 4.
public class Example28 {

	public static void main(String[] args) {
		for(int i = 1; i<=20; i++)
		{
			if(i%2 == 0 && i%4 == 0)
			{
				System.out.println(" divisible by 2 & 4 "+i);
			}
		}
	}
}
