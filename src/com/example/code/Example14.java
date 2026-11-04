package com.example.code;

public class Example14 {
public static void main(String[] args) {
	int arr[] = { 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};	
	int sum = 0;
	for(int i = arr.length-1; i>=0; i--)
	{
		if(arr[i]%2 == 0)
		{
			sum = sum + arr[i];
			
			
		}
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	System.out.println(" sum of even numbers in desc order : "+sum);
}
}
