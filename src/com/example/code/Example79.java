package com.example.code;

//Convert lowercase characters to uppercase 
//using character arithmetic.
public class Example79 {
	public static void main(String[] args) {
		String s = "Khushal";
		String result = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				ch = (char) (ch - 32);
			}
			result = result + ch;
		}
		System.out.println("Original string"+s);
		System.out.println("Upper case"+result);
	}
}
