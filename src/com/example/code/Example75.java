package com.example.code;
//Demonstrate string literals, 
//reference comparison using == and case sensitivity.
public class Example75 {
public static void main(String[] args) {
	String s1 = "Khushal";
	String s2 = "nAman";
	String s3 = new String("naman");
	System.out.println(s1+" "+s2);
	System.out.println(s1==s2);
	System.out.println(s1 == s3);
	System.out.println(s1.equals(s2));
	System.out.println(s2.equals(s3));
	System.out.println(s2.equalsIgnoreCase(s3));
}
}
