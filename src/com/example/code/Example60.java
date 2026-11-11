package com.example.code;
//Print array elements at even indices.
public class Example60 {
public static void main(String[] args) {
	int arr[] = {10,20,30,40,50,60,70};
	for(int i=0; i<arr.length; i++)
	{
		if(i%2 == 0)
		{
			System.out.println("print elements ate even indices "+arr[i]);
		}
	}
}
}
