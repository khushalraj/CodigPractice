package com.example.code;
//Print a triangular number pattern with 
//continuously increasing numbers
public class Example55 {
public static void main(String[] args) {
	int k=1;
	for(int i = 1; i<=4; i++)
	{
		
		for(int j = 1; j<=i; j++)
		{
			
			if(j<=i)
			{
				System.out.print(k++);
			}
			else
			{
				System.out.println(" ");
			}
		}
		System.out.println();
	}
	
}
}
