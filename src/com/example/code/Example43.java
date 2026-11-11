package com.example.code;

//Accept an array and print its first half.
public class Example43 {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50, 60 };
	    int half = arr.length/2;
	    
	    for(int i=0; i<half; i++)
	    {
	    	System.out.println(arr[i]);
	    }

	}
}
