package com.example.code;
//Compare two String objects using == and equals().
public class Example76 {
public static void main(String[] args) {
	String s1 = "Khushal";
	String s2 = "nAman";
	String s3 = new String("naman");
	System.out.println(s1+" "+s2);
	System.out.println(s1==s2);
	System.out.println(s1 == s3);
	System.out.println(s1.equals(s2));
}
}
