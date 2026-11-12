package com.example.code;
//Copy an array reference into another array variable 
//and display it.
public class Example69 {
public static void main(String[] args) {
	int arr[] = { 10, 20, 30, 40, 50, 60, 70 };
	int []arr1 = arr;
	
	System.out.println(" Original array ");
	for(int i=-0; i < arr.length; i++)
	{
		System.out.println(arr[i]);
	}
	System.out.println(" copy array ");
	for(int i=0; i<arr1.length; i++)
	{
		System.out.println(arr1[i]);
	}
	
	
}
}
