package com.example.code;



//Find duplicate values in an array and print their indices.
public class Example70 {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50, 40, 60, 70, 80, 100 };
	      for(int i=0; i < arr.length; i++)
	      {
	    	  for(int j=i+1; j < arr.length; j++)
	    	  {
	    		  if(arr[i]==arr[j])
	    		  {
	    			  System.out.println(" duplicate values "+arr[i]+
	    					  " indices "+i);
	    		  }
	    	  }
	      }
		
	}
}
