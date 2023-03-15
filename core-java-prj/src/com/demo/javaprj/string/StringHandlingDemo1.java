package com.demo.javaprj.string;

public class StringHandlingDemo1 {
	public static void main(String[] args) {
		String s="welcome";
		char chars[] = new char[5];
		s.getChars(3, 7, chars, 1);
		System.out.println(chars[0]);
		System.out.println(chars[1]);
		System.out.println(chars[2]);
		System.out.println(chars[3]);
		char char1[]=s.toCharArray();
		for(int i=0;i<char1.length;i++) {
			System.out.print(char1[i]);
		}
	}
}
