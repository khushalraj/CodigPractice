package com.example.code;

//Sort an array of strings alphabetically using compareTo().
public class Example72 {
	public static void main(String[] args) {
		String[] s = { "Banana", "Apple", "Cat", "Dog" };
		for (int i = 0; i < s.length; i++) {
			for (int j = i + 1; j < s.length; j++) {
				if (s[i].compareTo(s[j]) > 0) {
					String temp = s[i];
					s[i] = s[j];
					s[j] = temp;
				}
			}
			
		}
		System.out.println("original array");
		for(int i=0; i<s.length; i++)
		{
			System.out.println(s[i]);
		}

	}

}
