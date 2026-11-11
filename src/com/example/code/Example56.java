package com.example.code;

//Print a triangular alphabet pattern beginning with A.
public class Example56 {
	public static void main(String[] args) {
		char ch = 'A';
		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= i; j++) {
				
					System.out.print((char) ch++);
			}
			System.out.println();
		}
	}
}	
		
		
			
			
		



