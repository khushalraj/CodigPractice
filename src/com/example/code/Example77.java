package com.example.code;

//Demonstrate string methods such as charAt(), 
//toUpperCase(), toLowerCase(), trim(), replace(), 
//substring(), toCharArray() and string reversal.
public class Example77 {
	public static void main(String[] args) {
		String s = "Khushal";
		String s1 = " Hello Java ";
		System.out.println(" find char at index position :  " + s.charAt(2));
		System.out.println(" convert to upper case "+ s.toUpperCase());
		System.out.println(" convert to lower case "+s.toLowerCase());
		System.out.println(" trim function "+s.trim());
		System.out.println("before trim : "+s1);
		System.out.println("after trim : "+s1.trim());
		System.out.println("replace the character : "+s.replace("u", "shu"));
		System.out.println(" substring function : "+s.substring(0, 3));
		char[] ch = s.toCharArray();
		System.out.println(ch);
	}
}
