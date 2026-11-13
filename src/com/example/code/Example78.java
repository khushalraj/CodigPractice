package com.example.code;

//Count characters in a string while excluding spaces.
public class Example78 {
	public static void main(String[] args) {
		String s = " khushal ";
//		int count = s.replace(" ", "").length();
//		System.out.println("Total characters excluding spaces" + count);
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				count++;
			}
		}
		System.out.println(" total characters excluding spaces " + count);
	}
}
